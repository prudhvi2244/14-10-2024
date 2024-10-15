package aggregation;

public class Client {
    public static void main(String[] args) {

        Employee employee1=new Employee(1,"Prudhvi");
        Employee employee2=new Employee(2,"Praveen");
        Employee employee3=new Employee(3,"Prasad");
        Employee employee4=new Employee(4,"Pavan");
        Employee employee5=new Employee(5,"Prakash");

        Company company=new Company(1,"HCL");
        company.addEmployee(employee1);
        company.addEmployee(employee2);
        company.addEmployee(employee3);
        company.addEmployee(employee4);
        company.addEmployee(employee5);

        company.displayEmployees();

        company=null;

        System.gc();

    }
}
