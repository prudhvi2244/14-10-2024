package generalization;


public class Employee extends Person {
    private String companyName;
    private double salary;

    public Employee() {}

    public Employee(String name,double age,String city, String email, String companyName, double salary) {
        super(name,age,city,email);
        this.companyName = companyName;
        this.salary = salary;
    }

    public void displayEmployeeDetails() {
        System.out.println("Company Name: " + companyName);
        System.out.println("Employee Salary: " + salary);
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }




}