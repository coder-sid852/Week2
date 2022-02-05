// Program to print ASCII value of any character

package DayOne;

import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any character: ");
        char c = sc.next().charAt(0);

        int ascii = c; // integer value of a character is ASCII, 
                      //therefore assigning integer to a charcter will provide it's ASCII
        System.out.println(ascii);
        
        sc.close();
    }
}
