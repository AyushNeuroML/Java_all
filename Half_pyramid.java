public class Half_pyramid {
    public static void main(String[] args) {
        for (int line = 1; line<=4; line++){
            for (int s = 1; s <= line; s++) {
                System.out.print(s); 
            }
            System.out.println(); // Move to the next line after printing stars
        }
    }
    
}
