// Program to find area and perimeter of rectangle
// Using function


package DayFour;

public class a {
    public static int area(int l, int b) {
        // Function for Area
        
        int areaOfRectangle = l*b;

        return areaOfRectangle;
    }
    public static int perimeter(int l, int b) {
        //Function for Perimeter

        int peri = 2*(l+b);

        return peri;
    }
    public static void main(String[] args) {
        int length = 5;
        System.out.print("Length of Rectangle = "+length);
        
        int breadth = 7;
        System.out.print("\n Breadth of Rectangle = " +breadth);

        //Calling Function to calculate area
        int Area = area(length, breadth);
        //Calling Function to calculate Perimeter
        int peri = perimeter(length, breadth);

        System.out.println("The area of Rectangle is "+Area);

        System.out.println("The perimeter of Rectangle is "+peri);
        
    }
}
