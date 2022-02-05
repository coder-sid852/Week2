// Program to recieve a character and 3 to it's ASCII value and print it's character

package DayOne;

import java.util.Scanner;

public class third {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        int a = c+3; // adding three to the integer value of character c
        char result = (char)a;
        System.out.println(result);
        
        sc.close();
    }
}
