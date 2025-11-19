// Kaprekar number 
// A Kaprekar number is a number whose square when divided into two parts and such that the 
// sum of parts is equal to the original number and none of the parts has value 0. 
// Input: n = 45 
// Output: Yes 
// Explanation : 45*45 = 2025 and 20+ 25 is 45 
// Input: n = 13 
// Output: No 
// Explanation : 13^2 = 169. Neither 16+ 9 nor 1 + 69 is equal to 13 
// Input: n = 297 
// Output: Yes 
// Explanation: 297^2 = 88209 and 88+ 209 is 297 
// Input: n = 10 
// Output: No 
// Explanation: 102 = 100. It is not a Kaprekar number even if sum of 100+ 0 is 100. This is 
// because of the condition that none of the parts should have value 0. 
import java.util.Scanner;
public class program9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input number
        int n = scanner.nextInt();

        // Calculate the square of the number
        int square = n * n;
        String squareStr = Integer.toString(square);
        int len = squareStr.length();

        boolean isKaprekar = false;

        // Check for all possible splits of the square
        for (int i = 1; i <= len; i++) {
            String leftPartStr = squareStr.substring(0, len - i);
            String rightPartStr = squareStr.substring(len - i);

            int leftPart = leftPartStr.isEmpty() ? 0 : Integer.parseInt(leftPartStr);
            int rightPart = rightPartStr.isEmpty() ? 0 : Integer.parseInt(rightPartStr);

            // Check if the sum of parts equals the original number and none of the parts is 0
            if (leftPart + rightPart == n && rightPart != 0) {
                isKaprekar = true;
                break;
            }
        }

        // Output the result
        if (isKaprekar) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        scanner.close();
    }
}
