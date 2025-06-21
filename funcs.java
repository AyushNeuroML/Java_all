import java.util.*;

public class funcs {


    public static int calculate(int num1 , int num2){
        
        int sum = num1+num2;
        System.out.println("Sum is: " + sum);
        return sum;
        

    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        int sum = calculate(a,b);
        System.out.println("The sum of " + a + " and " + b + " is: " + sum);

        
        
    }
    
}
