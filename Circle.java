import java.util.*;

public class Circle {
    public static void main(String[] args) {
        Scanner area = new Scanner (System.in);
        System.out.println("Enter first radius:");
        float rad = area.nextFloat();
        float areaOfcircle = 3.14f * rad * rad;
        System.out.println("Area of the circle is: "+ areaOfcircle);
        area.close();
        
    }
}
