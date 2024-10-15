package aggregation;

import java.util.ArrayList;
import java.util.List;

public class Company {

    private long companyId;
    private String companyName;
    private List<Employee> employees;

    Company(long companyId, String companyName) {
        this.companyId = companyId;
        this.companyName = companyName;
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void displayEmployees() {
        System.out.println("Employees Working in company : "+companyName);
        for (Employee employee : employees) {
            System.out.println("Employee Id :"+employee.getEmployeeId());
            System.out.println("Employee Name :"+employee.getEmployeeName());
            System.out.println("*************************************************");
        }
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Destroying Company Object ......");
        employees=null;
    }
}
