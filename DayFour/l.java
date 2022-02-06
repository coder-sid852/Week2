/* The total number of students in a class are 90 out of which 45 are boys. 
If 50% of the total students secured grade 'A' out of which 20 are boys, 
then write a program to calculate the total number of girls getting grade 'A'.*/


package DayFour;

public class l {
    public static void main(String[] args) {
        int a = 90, b = 45, c = 45, d = 20;
        System.out.println("Total number of students in class = "+a);
        System.out.println("No. of Boys = "+b);
        System.out.println("Total students who secured grade 'A' = "+c);
        System.out.println("No. of Boys with grade 'A' = "+d);

        System.out.println("\n\n No. of Girls with grade A = "+ (c-d));
        
    }
}
