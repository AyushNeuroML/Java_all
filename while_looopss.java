import java.util.*;


public class while_looopss {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int no = sc.nextInt();


        int n = 1;
        while (n <= no) {
            System.out.println(n +"");
            n++;
        }
        // int a = 1;
        // while(a<=100) {
        //     System.out.println(a);
        //     a++;
            
            
        // }
        sc.close();

    }
}
