// A company maintains a database that has the details of all the employees. 
// There are two levels of employees where level 1 is the top management having a salary more 
// than 1000 dollars and level 2 is the staff who are getting a salary less than 1000 dollars. 
// Create a base class named "Employee" with empId and salary as attributes. Create a subclass, 
// empLevel, that extends the employee and categorises the employee into various levels, and 
// implements the following concept. 
// Input Format 
// The input should contain integer the employee ID and salary of the employee 
// Note: Employee id should be of integer type and salary float type. 
// Output Format 
// The output of the program must display the employee id, salary, and level of the employee, 
// one below the other in the same order. 
// Sample Input 
// 253 5.6 
// Sample Output 
// 253 
// 5.6 
// 2 
import java.util.Scanner;
class Employee {
    public static void main(String[] args) {
        // This main method is intentionally left empty.
    }
    protected int empId;
    protected float salary;

    // Constructor
    Employee(int empId, float salary) {
        this.empId = empId;
        this.salary = salary;
    }
}
class EmpLevel extends Employee {
    private int level;

    // Constructor
    EmpLevel(int empId, float salary) {
        super(empId, salary);
        if (salary > 1000) {
            this.level = 1;
        } else {
            this.level = 2;
        }
    }

    // Method to display employee details
    public void display() {
        System.out.println(empId);
        System.out.println(salary);
        System.out.println(level);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int empId = sc.nextInt();
        float salary = sc.nextFloat();

        EmpLevel employee = new EmpLevel(empId, salary);
        employee.display();
    }
}



