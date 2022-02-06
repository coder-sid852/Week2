package DayFour;

import java.util.Scanner;

public class j {
    public static void thirdVariable(int a, int b) {
        int c = a;
        a=b;
        b=c;
        System.out.println("a = "+a+", b = "+b);
        
    }
    public static void swap(int a, int b) {
        a= a+b;
        b= a-b;
        a= a-b;
        System.out.println("a = "+a+", b = "+b);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        System.out.println("Before swapping : ");
        System.out.println("a = "+a+", b = "+b);
        
        
        System.out.println("After Swapping without Third variable : ");
        swap(a, b);
        
        System.out.println("After Swapping with third variable: ");
        thirdVariable(a, b);
        
        sc.close();
    }
}
