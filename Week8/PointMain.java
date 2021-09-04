//import java.awt.*;

public class PointMain {
    public static void main(String[] args) {
        // create two Point objects
        Point p1 = new Point();
        p1.x = 5;
        p1.y = 2;
        Point p2 = new Point();
        p2.x = 4;
        p2.x = 3;


        // print each point
        System.out.println("p1: (" + p1.x + ", " + p1.y + ")");
        System.out.println("p2: (" + p2.x + ", " + p2.y + ")"); 

        // move p2 and then print it again
        p2.moveBy(2, 4);
        System.out.println("p2: (" + p2.x + ", " + p2.y + ")"); 
    }
}
