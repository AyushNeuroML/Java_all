import java.util.*;
public class productzz {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter your first number:");
        int a = sc.nextInt();
        System.out.println("Enter your second number:");
        int b = sc.nextInt();
        int product = (a*b);
        System.out.println("the product is: "+product);
        sc.close();
    }
}
