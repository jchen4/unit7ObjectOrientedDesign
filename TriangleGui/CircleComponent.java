import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.geom.*;

public class CircleComponent extends JComponent
{
    private Ellipse2D.Double circle;
    private double cX;
    private double cY;

    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        g2.draw(circle);
    }

    public void saveCenter(int x, int y)
    {
         cX = x;
         cY = y;
    }
    
    public void drawCircle(int x, int y)
    {
        double rad = Math.sqrt(Math.pow((x - cX), 2) + Math.pow((y - cY), 2));
        
        cX = cX - rad;
        cY = cY - rad;
        
        circle = new Ellipse2D.Double(cX, cY, rad*2, rad*2);
        repaint();
    }
}

