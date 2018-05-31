import java.time.LocalDate;

public abstract class Payment {
    private String name;
    private int amount;
    private LocalDate paymentDate = null;
    private LocalDate deadlineDate;

    protected Payment(String name, int amount, LocalDate paymentDate) {
        this.name = name;
        this .amount = amount;
        this.deadlineDate = paymentDate;
    }

    protected Payment(String name, int amount, int year, int month, int day) {
        this.name = name;
        this .amount = amount;
        this.deadlineDate = LocalDate.of(year,month,day);
    }

    protected Payment(String name, int amount, String date) {
        this.name = name;
        this .amount = amount;
        this.deadlineDate = LocalDate.parse(date);
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDate paymentDate) {
        this.paymentDate = paymentDate;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDeadlineDate() {
        return deadlineDate;
    }

    public void setDeadlineDate(LocalDate deadlineDate) {
        this.deadlineDate = deadlineDate;
    }

    @Override
    public String toString() {
        return new StringBuilder().append("Payment: ").append("\n").append("name: ").append(getName()).append("\n").append("amount: ").append(getAmount()).append("\n").append("DeadLine date: ").append(getDeadlineDate()).append("\n").append("Payment date: ").append(getPaymentDate()).append("\n").toString();
    }
}
