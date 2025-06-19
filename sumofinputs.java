import java.util.Scanner;
public class sumofinputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        int Firstno = sc.nextInt();
        System.out.println("Enter your second number: ");
        int Secondno = sc.nextInt();
        int sum = Firstno + Secondno;
        System.out.println("The sum of the two numbers is: " + sum);
        sc.close();
    }
    
}
