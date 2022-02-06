// Program to check if it's Equal

package DayFour;

public class e {
    public static boolean equal(int a, int b) {
        //passing a boolean function would be better in this case
        if(a==b){
            return true;
        }else
            return false;
        
    }
    public static void main(String[] args) {
        if(equal(23, 45)){
            System.out.println("Equal!");
            
        }else 
            System.out.println("Unequal!");
            
    }
}
