// Program to check if no is even or odd using function


package DayTwo;

import java.util.Scanner;

public class three {
    public static void CheckEvenOdd(int n) {
        if(n%2==0){
            System.out.println("Even!");
            
        }else{
            System.out.println("Odd!");  
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no. to check if its odd or even: ");
        int num = sc.nextInt();

        CheckEvenOdd(num);
        
        sc.close();
    }
    
}
