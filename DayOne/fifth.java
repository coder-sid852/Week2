//Program to convert inches into meter
// 1 inch = 0.0254 meter
// Therefore, x inch = x*0.0254 m

package DayOne;

import java.util.Scanner;

public class fifth {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter inches: ");
        
        double inches = sc.nextInt();
        double meter = inches * 0.0254; // formula to convert

        System.out.println(inches+" inches = "+meter+" m"); // printing output
    
        sc.close();
    }
}
