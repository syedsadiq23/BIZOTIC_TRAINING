// PROGRAM 2 
// The newspaper Agency 
// Each Sunday, a newspaper agency sells w copies of a special edition newspaper for Rs.x per 
// copy. The cost to the agency of each newspaper is Rs.y. The agency pays a fixed cost for 
// storage, delivery and so on of Rs.100 per Sunday. The newspaper agency wants to calculate 
// the profit which it obtains only on Sundays. Can you please help them out by writing a 
// program to compute the profit if w, x, and y are given. 
// Input Format: Input consists of 3 integers: w, x, and y. w is the number of copies sold, x is 
// the cost per copy and y is the cost the agency spends per copy. 
// Output Format: The output consists of a single integer which corresponds to the profit 
// obtained by the newspaper agency. 
// SAMPLE INPUT: 
// 1000 
// 2 
// 1 
// SAMPLE OUTPUT: 
// 900 

import java.util.Scanner;   
public class program3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of copies sold, cost per copy, and cost per copy to the agency
        int w = scanner.nextInt(); // number of copies sold
        int x = scanner.nextInt(); // cost per copy
        int y = scanner.nextInt(); // cost to the agency per copy

        // Fixed cost for storage, delivery, etc.
        int fixedCost = 100;

        // Calculate total revenue
        int totalRevenue = w * x;

        // Calculate total cost
        int totalCost = (w * y) + fixedCost;

        // Calculate profit
        int profit = totalRevenue - totalCost;

        // Print the profit
        System.out.println(profit);

        scanner.close();
    }
}   

