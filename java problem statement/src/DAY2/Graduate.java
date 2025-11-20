// Pooja is developing a system to track students and their education history. She creates a 
// superclass Person with attributes name and age. The Student subclass inherits from Person 
// and adds an attribute university. Another subclass, Graduate, inherits from Student and adds 
// an attribute graduation Year. Implement these classes and print the details of the graduate. 
// Input Format: 
// The first line contains the name of the person (string). 
// The second line contains the age of the person (integer). 
// The third line contains the university the student attended (string). 
// The fourth line contains the graduation Year of the graduate (integer). 
// Output Format: 
// Display the details of the graduate in the following format: "Graduate <name>, Age: 
// <age>, University: <university>, Year: <graduation Year>" 
// Sample Input 1: 
// Neeraj 
// 24 
// IIT Delhi 
// 2023 
// Sample Output 1: 
// Graduate Neeraj, Age: 24, University: IIT Delhi, Year: 2023 
// Sample Input 2: 
// Shreya 
// 22 
// Anna University 
// 2022 
// Sample Output 2: 
// Graduate Shreya, Age: 22, University: Anna University, Year: 2022 
// 28 
import java.util.Scanner;

class Person {
    protected String name;
    protected int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Student extends Person {
    protected String university;

    // Constructor
    Student(String name, int age, String university) {
        super(name, age);
        this.university = university;
    }
}

public class Graduate extends Student {
    private int graduationYear;

    // Constructor
    Graduate(String name, int age, String university, int graduationYear) {
        super(name, age, university);
        this.graduationYear = graduationYear;
    }

    // Method to display graduate details
    public void display() {
        System.out.println("Graduate " + name + ", Age: " + age +
                           ", University: " + university +
                           ", Year: " + graduationYear);
    }

    // Main method (program entry)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter age: ");
        while (!sc.hasNextInt()) {
            System.out.print("Please enter a valid integer for age: ");
            sc.next();
        }
        int age = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        System.out.print("Enter university: ");
        String university = sc.nextLine();

        System.out.print("Enter graduation year: ");
        while (!sc.hasNextInt()) {
            System.out.print("Please enter a valid integer for graduation year: ");
            sc.next();
        }
        int graduationYear = sc.nextInt();

        Graduate graduate = new Graduate(name, age, university, graduationYear);
        System.out.println();
        graduate.display();

        sc.close();
    }
}


