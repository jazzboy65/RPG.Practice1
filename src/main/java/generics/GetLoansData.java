package generics;

import java.util.Date;

public class GetLoansData {
    private long amount;
    private Date returnDate; //Дата возврата бабла

    public GetLoansData(long amount, Date returnDate) {
        this.amount = amount;
        this.returnDate = returnDate;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }
}
