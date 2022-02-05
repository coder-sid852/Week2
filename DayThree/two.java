//Program to check if a no. is greater then or less than using ternary operator

package DayThree;

import java.util.Scanner;

public class two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num = sc.nextInt();
        // now we will use ternary operator
        String result = num>10 ? "Greater than 10!" : num>5 ? "Greater than 5!" : "Less than 5!";
        
        System.out.println(result);
        
        sc.close();
        
    }
}
