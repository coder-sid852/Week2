/* Program to add 8 to the number 2345 and then divide it by 3. 
Now, the modulus of the quotient is taken with 5 and then multiply the resultant value by 5. */

package DayFour;

public class c {
    public static int expression(int a, int b, int c, int d) {
        int exp = (((a+b)/c)%d)*d;
        return exp;
    }
    public static void main(String[] args) {

        int result = expression(8, 2345, 3, 5);
        // we are directly passing the given values in function call

        System.out.println("The evaluation of the given expression is: "+result);
        
    }
}
