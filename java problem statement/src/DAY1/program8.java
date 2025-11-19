// Co-Partners in Train 
// Tim and Bob are off to a famous Education Fair "Knowledge Forum 2017" at Uzhlanda. This 
// time they have to travel without their guardians. Tim got very interested in the arrangement of 
// seats inside the train coach. 
// The entire coach could be viewed as an arrangement of consecutive blocks of size 8. 
// BerthNumber Compartment 
// 1-8 1 
// 9-16 2 
// 17-24 3 
// ... and so on 
// Each of these size-8 blocks are further arranged as: 
// 1LB, 2MB, 3UB, 4LB, 5MB, 6UB, 7SL, 8SU 
// 9LB, 10MB, ... 
// Here LB denotes lower berth, MB middle berth and UB upper berth. 
// The following berths are called Co-Partners in Train: 
// 3 UB 6 UB 
// 2 MB 5 MB 
// 1 LB 4 LB 
// 7 SL 8 SU 
// Given a berth number, you are to determine the berth number and type of its Co-Partner. 
// Input Format:
// The first line contains T, the number of test cases. 
// Each of the next T lines contains a single integer N, the berth number.      
// Output Format:
// For each test case, output a single line containing the berth number and type of its
// Co-Partner, separated by a single space. 
// Sample Input:    
// 3
// 1            
// 5        
// 8        
// Sample Output:
// 4 LB
// 2 MB
// 7 SL
import java.util.Scanner;
public class program8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of test cases
        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            int N = scanner.nextInt();

            // Determine the position in the 8-seat block
            int position = (N - 1) % 8 + 1;
            int coPartnerNumber = 0;
            String coPartnerType = "";

            // Find the co-partner based on the position
            switch (position) {
                case 1:
                    coPartnerNumber = N + 3;
                    coPartnerType = "LB";
                    break;
                case 2:
                    coPartnerNumber = N + 3;
                    coPartnerType = "MB";
                    break;
                case 3:
                    coPartnerNumber = N + 3;
                    coPartnerType = "UB";
                    break;
                case 4:
                    coPartnerNumber = N - 3;
                    coPartnerType = "LB";
                    break;
                case 5:
                    coPartnerNumber = N - 3;
                    coPartnerType = "MB";
                    break;
                case 6:
                    coPartnerNumber = N - 3;
                    coPartnerType = "UB";
                    break;
                case 7:
                    coPartnerNumber = N + 1;
                    coPartnerType = "SL";
                    break;
                case 8:
                    coPartnerNumber = N - 1;
                    coPartnerType = "SU";
                    break;
            }

            // Output the result
            System.out.println(coPartnerNumber + " " + coPartnerType);
        }

        scanner.close();
    }
}

