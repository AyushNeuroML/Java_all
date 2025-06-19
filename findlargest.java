import java.util.*;

public class findlargest {
    public static void main(String[] args) {
        Scanner cc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int no1 = cc.nextInt();
        System.out.println("Enter the second number:");
        int no2 = cc.nextInt();
        System.out.println("Enter the third number:");
        int no3 = cc.nextInt();


        if (no1>no2 && no1>no3) {
            System.out.println(no1 + " is the largest number.");
        }
        else if (no2>no1 && no2>no3) {
            System.out.println(no2 + " is the largest number.");
        }
        else if (no3>no1 && no3>no2) {

            System.out.println(no3 + ": is the largest number");

        }

        else if (no1 == no2 && no2==no3 && no3==no1 ){
            System.out.println("All numbers are equal");

        
        
            
        }
        else {
            System.out.println("sahise input dalde gawar");
        }
        cc.close();
        
    }
}
