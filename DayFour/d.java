// Solving the previous three programs a.java b.java and c.java using Assignment operators

package DayFour;

public class d {
    public static int triangle(int a, int b, int c) {
        int peri =a;
        peri+=c;
        peri+=b;
        return peri;
    }
    public static int rectArea(int l, int b) {
        int area = l;
        area *=b;

        return area;
    }
    public static int rectPeri(int l, int b) {
        int peri =l;
        peri +=b;
        peri *= 2;

        return peri;
    }
    public static int exp(int a, int b, int c, int d) {
        int exp = a;
        exp += b;
        exp /=c;
        exp %= d;
        exp *= d;
        return exp;
    }
    public static void main(String[] args) {
        int tri = triangle(2, 3, 5);
        int RArea = rectArea(5, 7);
        int rPeri = rectPeri(5, 7);
        int expression = exp(8, 2345, 3, 5);

        System.out.println("Perimeter of Triangle : "+tri);
        System.out.println("Area of a Rectangle : "+RArea);
        System.out.println("Perimeter of a rectangle : "+rPeri);
        System.out.println("The evaluation of given expression is: "+expression);
        
    }
}
