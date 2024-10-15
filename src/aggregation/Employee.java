package aggregation;

public class Employee {
    private long employeeId;
    private String employeeName;

    Employee(long employeeId, String employeeName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Destroying Employee Object ....");
    }
}
