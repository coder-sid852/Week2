//Program to convert Minutes into Year and Days

package DayOne;

import java.util.Scanner;

public class sixth {
    public static void main(String[] args) {
        System.out.println("Enter Minutes to convert into Year and Days: ");
        
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
        sc.close();

        // 1 year = 525600 min = 365*24*60
        // 1 day = 1440 min = 24*60
        int year = min/525600;
        int days = (min%525600)/1440;
        System.out.println();
        
        System.out.println(min+" minute = "+year+" year and "+days+" days.");
        
    }
}
