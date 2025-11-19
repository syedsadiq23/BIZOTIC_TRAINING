// Cricket Stadium 
// There was a large ground in the centre of the city which is rectangular in shape. The 
// Corporation decided to build a Cricket stadium in the area for school and college students, but 
// the area was used as a car parking zone. In order to protect the land from being used as an 
// unauthorised parking zone, the corporation wanted to protect the stadium by building a fence. 
// In order to help the workers to build a fence, they planned to place a thick rope around the 
// ground. They wanted to buy only the exact length of the rope that is needed. They also 
// wanted to cover the entire ground with a carpet during the rainy season. They wanted to buy 
// only the exact quantity of carpet that is needed. They requested your help. Can you please 
// help them by writing a program to find the exact length of the rope and the exact quantity of 
// carpet that is required? Input format: Input consists of 2 integers. The first integer 
// corresponds to the length of the ground and the second integer corresponds to the breadth of 
// the ground. Output Format: Output Consists of two integers. The first integer corresponds to 
// the length. The second integer corresponds to the quantity of carpet required. 
// Sample Input: 
// 50 
// 20 
// Sample Output: 
// 140 
// 1000
import java.util.Scanner;
public class program2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read length and breadth of the ground
        int length = scanner.nextInt();
        int breadth = scanner.nextInt();

        // Calculate the length of the rope needed (perimeter of the rectangle)
        int ropeLength = 2 * (length + breadth);

        // Calculate the quantity of carpet needed (area of the rectangle)
        int carpetQuantity = length * breadth;

        // Print the results
        System.out.println(ropeLength);
        System.out.println(carpetQuantity);

        scanner.close();
    }
}

