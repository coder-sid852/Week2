//Program to calculate no. of Digits

package DayTwo;

import java.util.Scanner;

public class one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        while(num!=0)
        {
            num = num/10; // every time this statement is executed one digit will be reduced
            count++; // and that one digit count will be added here
        } // this loop will continue untill num = 0;
        
        System.out.println(count);
        
        sc.close();
    }
}
