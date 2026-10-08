public class Bill {
    private String name;
    private double billAmount;
    private String dueDate;

    public Bill(String name, double billAmount, String dueDate) {
        this.name = name;
        this.billAmount = billAmount;
        this.dueDate = dueDate;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getBillAmount() {
        return billAmount;
    }
    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }
    public String getDueDate() {
        return dueDate;
    }
    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }
    public void displayBill() {

        System.out.println(getName() + " " + getBillAmount() + " " + getDueDate());

    }
}
