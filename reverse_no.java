public class reverse_no {
    public static void main(String[] args) {
        int n = 220704;
        

        while(n>0){
            int lastdg = n%10;
            System.out.println(lastdg);
            n = n/10;
        }
        System.out.println();
    }
}
