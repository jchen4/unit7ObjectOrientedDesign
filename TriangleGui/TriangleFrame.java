import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TriangleFrame extends JFrame
{
    private static final int FRAME_WIDTH = 500;
    private static final int FRAME_HEIGHT = 500;
    
    private TriangleComponent triangle;
    
    
    public class PointMouseListener implements MouseListener
    {
        public void mousePressed(MouseEvent event)
        {
            int x = event.getX();
            int y = event.getY();
            triangle.nextStep(x, y);
        }
        
        public void mouseClicked(MouseEvent event){}
        public void mouseReleased(MouseEvent event){}
        public void mouseEntered(MouseEvent event){}
        public void mouseExited(MouseEvent event){}
    }
    
    public TriangleFrame()
    {
        triangle = new TriangleComponent();
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.add(triangle);
        MouseListener listener = new PointMouseListener();
        triangle.addMouseListener(listener);
    }
}
