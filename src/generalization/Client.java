package generalization;


public class Client {
    public static void main(String[] args) {

        Employee employee = new Employee("prudhvi",33.0,"Hyderabad","prudhvi@gmail.com","Capgemini",234444.44);
        School school = new School("prudhvi",33.0,"Hyderabad","prudhvi@gmail.com","ABC","A");
        Customer customer = new Customer("prudhvi",33.0,"Hyderabad","prudhvi@gmail.com",34555.5,12.5);

        employee.displayPersonalDetails(); // calling parent class method using child object
        employee.displayEmployeeDetails(); // calling child class specific method using child class object

        System.out.println("************************************************************");

        school.displayPersonalDetails(); // calling parent class method using child object
        school.displaySchoolDetails();// calling child class specific method using child class object

        System.out.println("************************************************************");

        customer.displayPersonalDetails();
        customer.displayCustomerDetails();


        Person person=new Employee("prudhvi",33.0,"Hyderabad","prudhvi@gmail.com","Capgemini",234444.44);



    }
}