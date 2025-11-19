// Super Quiz Bee is a famous quiz Competition that tests students on a wide variety of 
// academic subjects. This week's competition was a Team event and students who register for 
// the event will be given a unique registration code N. The participants are teamed into 10 
// teams and the team to which a participant is assigned depends on the absolute difference 
// between the first and last digit in the registration code. 
// The event organisers wanted your help in writing an automated program that will ease their 
// job of assigning teams to the participants. If the registration number given is less than 10, 
// then the program should display "Invalid Input". 
// Input Format 
// The only line of input contains an integer N. 
// Output Format 
// Output the absolute difference between the first and last digit of N. 
// Sample Input 
// 345 
// Sample Input 
// 9 
// Sample Output 
// 2 
// Sample Output 
// Invalid Input 
// 15 
import java.util.Scanner;
public class program10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the registration code N
        int N = scanner.nextInt();

        // Check if the input is valid
        if (N < 10) {
            System.out.println("Invalid Input");
        } else {
            // Convert the number to string to easily access first and last digits
            String numberStr = Integer.toString(N);
            int firstDigit = Character.getNumericValue(numberStr.charAt(0));
            int lastDigit = Character.getNumericValue(numberStr.charAt(numberStr.length() - 1));

            // Calculate the absolute difference
            int difference = Math.abs(firstDigit - lastDigit);

            // Output the result
            System.out.println(difference);
        }

        scanner.close();
    }
}


