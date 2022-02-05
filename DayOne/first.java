// Program to Multiply an integer with decimal value

package DayOne;

import java.util.Scanner;

public class first {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        // let user enter input
        System.out.print("Enter value in integer: ");
        int intValue = sc.nextInt(); //Integer

        System.out.print("\nEnter value in Decimal: ");
        float deciValue = sc.nextFloat(); // Decimal

        double result = intValue*deciValue; // multiplying both as double
        System.out.println(result);
        
        sc.close();
    }
}
