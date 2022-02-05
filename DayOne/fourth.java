//Program to convert Fahrenheit temperature into celcius

package DayOne;

import java.util.Scanner;

public class fourth {
    public static void main(String[] args) {
        
        System.out.println("Enter Temperature in Fahrenheit:");
        Scanner sc = new Scanner(System.in);
        int fh =sc.nextInt();
        
        int cel = (fh-32)*5/9; // Using the standard formula
        System.out.printf("Temperature in celcius is: %d\n", cel);
    
        sc.close();
    }
}
