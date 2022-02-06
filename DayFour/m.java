package DayFour;
import java.util.Scanner;
public class m
{
	public static void main(String[] args) {
		int first, forth, sum;
    System.out.println("Enter a 5 digit number");
    Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();
    
    first = n/10000;     
    n = n%10000;
	
    forth = n/1000;     
    n = n%1000;
	
    forth = n/100;       
    n = n%100;
	
    forth = n/10;       
	
    sum = first + forth;
    System.out.println("sum : "+sum);
    sc.close();
  }
}
