import java.util.*;

public class swtich_sikhlo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");



        int number = sc.nextInt();
        switch(number){
            case 1: System.out.println("samosa");
            break;
            case 2: System.out.println("burger");
            break;
            case 3: System.out.println("pizza");
            break;
            case 4: System.out.println("daal-roti");
            break;
            default: System.out.println("kha liya...? bkl uthja sapne se...!");
            break;

    
        }
        sc.close();    
    }
}
