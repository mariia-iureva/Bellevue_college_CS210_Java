import java.awt.*;


public class Point {
    int x;
    int y;

    // Draw this Point.
    public void draw(Graphics g) {
        g.fillOval(x, y, 3, 3);
        g.drawString("(" + x + ", " + y + ")", x, y);
    }

    // Changes the location of this Point object.
    public void setLocation(int newX, int newY) {
        x = newX;
        y = newY;
    }

    // Shift this Point the given amounts.
    public void moveBy(int dx, int dy) {
        setLocation(x + dx, y + dy);
    }
   
    // Calculate the distance between this Point and another one.
    public double distance(Point other) {
        int dx = x - other.x;
        int dy = y - other.y;
        return Math.sqrt(dx * dx + dy * dy);    
    }
}    
