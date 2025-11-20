// Create a class with the following attributes: 
// int rollno, 
// int mark1, 
// int mark2, 
// int mark3. 
// Create an array of objects for the above class. 
// Create the main class and in the main method calculate and print the following. 
// Total marks obtained by each student. 
// The highest mark in each subject with the roll number of the student who scored it. 
// The student who obtained the highest total mark. 
// Input Format 
// The first line of the input consists of the value of n. 
// The second lines consist of an integer (roll number, mark1, mark2, and mark3) 
// Output Format 
// First n lines print the total marks of each student. 
// The next 3 lines print the student's roll number and highest marks in each subject, separated 
// by a space. 
// The last line prints the roll number of the student and the highest total marks scored. 
// Sample Input 
// 5 
// 1 98 85 76 
// 2 85 74 65 
// 3 85 96 75 
// 4 52 65 79 
// 5 52 75 65 
// Sample Output 
// 259 
// 224 
// 256 
// 196 
// 256 
// 1 98    
// 3 96    
// 1 79
// 1 259
import java.util.Scanner;
class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            int rollno = sc.nextInt();
            int mark1 = sc.nextInt();
            int mark2 = sc.nextInt();
            int mark3 = sc.nextInt();
            students[i] = new Student(rollno, mark1, mark2, mark3);
        }

        // Calculate and print total marks for each student
        for (Student student : students) {
            System.out.println(student.getTotalMarks());
        }
    }
    private int rollno;
    private int mark1;
    private int mark2;
    private int mark3;

    public Student(int rollno, int mark1, int mark2, int mark3) {
        this.rollno = rollno;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    public int getRollno() {
        return rollno;
    }

    public int getMark1() {
        return mark1;
    }

    public int getMark2() {
        return mark2;
    }

    public int getMark3() {
        return mark3;
    }

    public int getTotalMarks() {
        return mark1 + mark2 + mark3;
    }
}
