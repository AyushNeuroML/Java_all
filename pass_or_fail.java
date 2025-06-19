import java.util.*;

public class pass_or_fail {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Marks in maths:");
        int sub1 = sc.nextInt();
        System.out.println("Enter Your Marks in Physics:");
        int sub2 = sc.nextInt();
        System.out.println("Enter Your Marks in Chemistry:");
        int sub3 = sc.nextInt();
        System.out.println("Enter Your Marks in English:");
        int sub4  = sc.nextInt();
        System.out.println("Enter Your Marks in Computer Science:");
        int sub5 = sc.nextInt();

        int total = sub1 + sub2 + sub3 + sub4 + sub5;



        System.out.println("Your total marks is: "+ total +" out of 500");

        if (total<200) {
            System.out.println("Fail hogaya hai tu saale.....!!!");
        }

        else if (total>=200 && total<350) {
            System.out.println("pass hogaya magar aur sahise padh");
        }
        else if (total>350 && total<450){
            System.out.println("beta game kam khel marks badh jayenge");
        }
        else if (total>=450) {
            System.out.println("Bahen ke taake tu to genius hai...!!!");
        }
        else {
            System.out.println("Sahise input daal gawar");
        }























        sc.close();
    }
    
}
