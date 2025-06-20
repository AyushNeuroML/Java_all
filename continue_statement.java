public class continue_statement {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("Skipping i = " + i);
                continue; // Skip the rest of the loop when i is 3
            }
            System.out.println("Current value of i: " + i);
        }
    }
    
}
