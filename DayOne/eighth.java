//Program to check if the string is palindrome
// Palindrome is when something is same as it's reversed form.


package DayOne;

import java.util.Scanner;

public class eighth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.nextLine();
        String check="";
        for (int i = str.length()-1; i >=0; i--) // this loop will reverse the string
        {
            check += str.charAt(i);
        }
        
        if(str.equals(check)) // Now the reversed string will be checked if it is same as the entered one
        {
            System.out.println(str+" is a palindrome string");  
        }
        else
        {
            System.out.println(str+" is not a palindrome string");   
        }
        sc.close();
    }
}
