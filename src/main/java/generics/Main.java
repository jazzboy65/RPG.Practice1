package generics;

public class Main {
    public static void main(String[] args) {
        ResponseDataController controller = new ResponseDataController();
        ResponseData<AuthUserData> q = controller.authUser();
        AuthUserData authUserData = q.getData();
        ResponseData<GetLoansData> s = controller.getLoans();
        GetLoansData getLoansData = s.getData();
        ResponseData<GetLoansData> error1 = controller.getLoansWithError();
        Error[] errors = error1.getErrors();
        Error l = errors[0];
    }
}
