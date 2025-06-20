public class breaks {
    public static void main(String[] args) {
        for ( int i = 1; i <=5; i++){
            if (i == 3) {
                System.out.println("Breaking at i = " + i);
                break; // Exit the loop when i is 3
            }
            System.out.println("Current value of i: " + i);
        }
    }
    
}
