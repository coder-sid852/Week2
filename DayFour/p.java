package DayFour;

import java.util.Scanner;

public class p {
    public static void main(String[] args) {
        int rev = 0, remainder;
        System.out.printf("Enter an integer: ");
    
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        while (n != 0) {
            remainder = n % 10;
            rev = rev * 10 + remainder;
            n /= 10;
        }
        System.out.printf("Reversed number = %d", rev);
   
    
    }
}
