//Program to check if its vowel or consonant using Ternary operator

package DayThree;

import java.util.Scanner;

public class five {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any character: ");
        
        char ch = sc.next().charAt(0);

        String result = (ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u' || ch == 'U')
        ? "Vowel!": "Consonant!";
        System.out.println(result);
        
        sc.close();
    }
}
