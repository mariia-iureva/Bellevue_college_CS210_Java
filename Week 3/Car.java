
// CS210 Summer 2021 Assignment #1
// Mariia Iureva
// Car  - a program that draws a moving car, that is crossing the panel
// three times, driving faster and faster every time

import java.awt.*;

public class Car {
    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(800, 200);
        panel.setBackground(Color.LIGHT_GRAY);
        Graphics g = panel.getGraphics();
        
        for (int j = 1; j < 4; j++) {
            for (int i = 0; i < 90; i++) {
                panel.clear();
                drawCar(g, i * 10, 30);
                panel.sleep(120/j);
            }
        }
    } 
    public static void drawCar(Graphics g, int x, int y) {
        // car body
        g.setColor(Color.BLACK);
        g.fillRect(x, y, 100, 50);
        
        // wheels
        g.setColor(Color.RED);
        g.fillOval(x + 10, y + 40, 20, 20);
        g.fillOval(x + 70, y + 40, 20, 20);
        
        // window
        g.setColor(Color.CYAN);
        g.fillRect(x + 70, y + 10, 30, 20);
    }   
        
}