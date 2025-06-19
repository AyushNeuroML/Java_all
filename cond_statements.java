import java.util.*;

public class cond_statements{
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        
        
        System.out.println("Enter your age:");
        int age = a.nextInt();
        if (age>=18) {
            System.out.println("You are eligible to vote.");
        }
        else if (age > 13 && age<18) {
            System.out.println("You are a teenager, but not eligible to vote yet.");
        } 
        else {
            System.out.println("You are not eligible to vote.");
        }
        
        a.close();
    }
}