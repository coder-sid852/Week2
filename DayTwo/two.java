// factorial program using Do-while loop

package DayTwo;

import java.util.Scanner;

public class two {
    public static void main(String[] args) {
        char ans;
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.println("Enter a no. to find its Factorial: ");
            int num = sc.nextInt();
            int factorial = 1;
    
            for(int i=num; i>0; i--){
                factorial*= i;              // Calculating factorial using for loop
            }
            System.out.println("The factorial of "+num+" = "+factorial);

            System.out.println("Do you want to continue?(N for 'N' anything for 'yes'): ");
            ans = sc.next().charAt(0); // taking user choice

        } while (ans != 'N'); { // this loop will run untill user enters N
            System.out.println("exiting.... ");
        }
        sc.close();
    
    }
}
