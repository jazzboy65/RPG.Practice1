package generics;

import java.util.Date;

public class ResponseDataController {
    public ResponseData<AuthUserData> authUser() {
        ResponseData<AuthUserData> responseData = new ResponseData<>();
        responseData.setData(new AuthUserData("lsdkjfsklfj123", "+79822345835"));
        return responseData;
    }

    public ResponseData<GetLoansData> getLoans() {
        ResponseData<GetLoansData> responseData = new ResponseData<>();
        responseData.setData(new GetLoansData(8999999999999999999L,new Date()));
        return responseData;
    }
    public ResponseData<GetLoansData> getLoansWithError() {
        ResponseData<GetLoansData> responseData = new ResponseData<>();
        responseData.setErrors(new Error[]{new Error(404,"Loan not found")});
        return responseData;
    }
}
