import java.time.LocalDate;

public class Tax extends Payment {

    public Tax(String name, int amount, LocalDate paymentDate) {
        super(name, amount, paymentDate);
    }

    public Tax(String name, int amount,String date) {
        super(name,amount,date);
    }

    public Tax(String name, int amount,int year, int month, int day) {
        super(name,amount,year,month,day);
    }
}
