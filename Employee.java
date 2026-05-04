package MyPkg;

public class Employee {
    private int empId;
    private String empName;
    private double salary;

    // Getters and Setters
    public void setEmpId(int empId) { this.empId = empId; }
    public void setEmpName(String empName) { this.empName = empName; }
    public void setSalary(double salary) { this.salary = salary; }

    public void displayDetails() {
        System.out.println("ID: " + empId + " | Name: " + empName + " | Salary: " + salary);
    }

    // Main method inside the Employee class
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setEmpId(24);
        emp.setEmpName("Godwin");
        emp.setSalary(30000);
        emp.displayDetails();
    }
}