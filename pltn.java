import java.util.*;

public class pltn {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number :");
        int a = sc.nextInt();
        System.out.println("enter second number:");
        int b = sc.nextInt();

        if (a>b) {
            System.out.println("" + a + " is greater than or equal to " + b);
        }
        else if (a==b) {
            System.out.println("" + a + " is equal to " + b);
        }
        else {
            System.out.println("" + b + " is greater than " + a);
        }











        sc.close();
        
    }
    
}
