package generalization;

public class Customer extends Person {
    private double billing;
    private double discount;

    public Customer() {}

    public Customer(String name,double age,String city, String email, double billing, double discount) {
        super(name,age,city,email); // call to super class constructor
        this.billing = billing;
        this.discount = discount;
    }

    public void displayCustomerDetails() {
        System.out.println("Billing: " + billing);
        System.out.println("Discount " + discount);
    }

    public double getBilling() {
        return billing;
    }

    public void setBilling(double billing) {
        this.billing = billing;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
