package Tutorial7.Activity1;
public class Activity1 {
    public static void main (String[] args) {
        Employee harry = new Employee("Harry Jones", 50000);
        System.out.println("Employee Name: "+harry.getName());
        System.out.println("Employee Salary: "+harry.getSalary());
        harry.raiseSalary(10);
        System.out.println("Raise Salary: "+harry.getSalary());
    }
}
