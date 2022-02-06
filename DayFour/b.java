//Program to calculate Perimeter of a triangle

package DayFour;

public class b {
    public static int triangleP(int a, int b, int c) {
        int p = a+b+c; // as per the formula

        return p;
    }
    public static void main(String[] args) {
        int a = 2, b = 3, c = 5;
        System.out.println("Side a = "+a);
        System.out.println("Side b = "+b);
        System.out.println("Side c = "+c);

        int perimeter = triangleP(a, b, c); // calling the method in main

        System.out.println("The perimeter of this Triangle is "+perimeter); // printing the result
        

    }
}
