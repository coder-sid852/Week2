//Program to reverse a string

package DayOne;

import java.util.Scanner;

public class seventh {
    public static void main(String[] args) {
        System.out.print("Enter any city Name:");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        String reverse="";
        // we are using an another string to save the reversed string
        // we will use a reversed loop for this
        for (int i = name.length()-1; i >=0; i--) {
            reverse += name.charAt(i);
        }
        System.out.println(reverse);
        
        sc.close();
        
    }
}
