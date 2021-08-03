// CS210 Summer 2021 Assignment #1
// Mariia Iureva
// Ehrenstein Illusion - drawing complicated figures with given amount
// of concentrated circles and a diamond inside and composing them into a grid

import java.awt.*;

public class Illusion {
    
    public static void main(String[] args) {
        drawFigures();
    }  
  
    public static void drawFigures(){
        
        // the method that draws all requested patterns using
        // two methods - drawOneFigure() and drawGrid()
        
        DrawingPanel panel = new DrawingPanel(500, 400);
        panel.setBackground(Color.CYAN); 
        Graphics g = panel.getGraphics();

        // let's draw three symplest one-circle figures
        drawOneFigure(0, 0, 90, 3, g);
        drawOneFigure(120, 10, 90, 3, g);
        drawOneFigure(250, 50, 80, 5, g);

        //calling functions to draw grid with the following parametrs:
        //x,y position, size, number of circles inside the figure, number of rows and columns

        drawGrid(350, 20, 40, 5, 3, g);
        drawGrid(10, 120, 100, 10, 2, g);
        drawGrid(240, 160, 50, 5, 4, g);
    }

    public static void drawOneFigure(int x, int y, int size, int numberOfCircles, Graphics g) {
        g.setColor(Color.YELLOW); //setting color for circle yellow
        g.fillOval(x, y, size, size); //creating circle
        g.setColor(Color.BLACK); //outlines black

        //creating number of circles
        for (int i = 0; i < numberOfCircles; i++) {
            g.drawOval(x + i * (size / numberOfCircles / 2),
                    y + i * (size / numberOfCircles / 2), 
                    size - i * (size / numberOfCircles), 
                    size - i * (size / numberOfCircles));
        }
        //creating diamond
        g.drawLine(x + size / 2, y, x, y + size / 2);
        g.drawLine(x, y + size / 2, x + size / 2, y + size);
        g.drawLine(x + size / 2, y + size, x + size, y + size / 2);
        g.drawLine(x + size, y + size / 2, x + size / 2, y);
    }  
   
    public static void drawGrid(int x, int y, int size, int numberOfCircles, int rowsColumns, Graphics g) {
       
        //Drawing grid method, using the following parameters:
        //x,y position, size, number of circles inside the figure, number of rows and columns

        //starting with background square

        g.setColor(Color.LIGHT_GRAY); //our background square should be gray
        g.fillRect(x, y, size * rowsColumns, size * rowsColumns);
        g.setColor(Color.RED);//our background square outline is red
        g.drawRect(x, y, size * rowsColumns, size * rowsColumns);

        //creating numberOfCircles inside grid
        for (int i = 0; i < rowsColumns; i++) {
            for (int j = 0; j < rowsColumns; j++) {
                drawOneFigure(x + j * size, y, size, numberOfCircles, g);
            }
            y += size;
        }
    }
}