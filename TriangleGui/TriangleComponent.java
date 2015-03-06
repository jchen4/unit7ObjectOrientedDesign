import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.geom.*;

public class TriangleComponent extends JComponent
{
    private Rectangle r1, r2, r3;
    private Line2D.Double l1, l2, l3;
    private int clickCount;

    public TriangleComponent()
    {
        clickCount = 0;
        r1 = new Rectangle(5, 5);
        r2 = new Rectangle(5, 5);
        r3 = new Rectangle(5, 5);
        l1 = new Line2D.Double();
        l2 = new Line2D.Double();
        l3 = new Line2D.Double();
    }

    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        g2.draw(r1);
        g2.draw(r2);
        g2.draw(r3);
        g2.draw(l1);
        g2.draw(l2);
        g2.draw(l3);
    }

    public void nextStep(int x, int y)
    {
        switch ( clickCount) 
        {
            case 0:     r1.setLocation(x, y);
                        clickCount++;
                        repaint();
                        break;
            case 1:     r2.setLocation(x, y);
                        l1.setLine(x, y, r1.getX(), r1.getY());
                        clickCount++;
                        repaint();  
                        break;
            case 2:     r3.setLocation(x, y);
                        l2.setLine(x, y, r1.getX(), r1.getY());
                        l3.setLine(x, y, r2.getX(), r2.getY());
                        clickCount++;
                        repaint();
                        break;
             case 3:    clickCount = 0;
                        r1 = new Rectangle(5, 5);
                        r2 = new Rectangle(5, 5);
                        r3 = new Rectangle(5, 5);
                        l1 = new Line2D.Double();
                        l2 = new Line2D.Double();
                        l3 = new Line2D.Double();
                        repaint();    
                        break;
        }       
    }
}
