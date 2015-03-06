import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CircleFrame extends JFrame
{
    private static final int FRAME_WIDTH = 500;
    private static final int FRAME_HEIGHT = 500;
    
    private CircleComponent circle;
    
    
    public class PointMouseListener implements MouseMotionListener, MouseListener
    {
        public void mousePressed(MouseEvent event)
        {
            int x = event.getX();
            int y = event.getY();
            circle.saveCenter(x, y);
        }
        
        public void mouseDragged(MouseEvent event)
        {
            int x = event.getX();
            int y = event.getY(); 
            circle.drawCircle(x, y);
        }
        
        public void mouseReleased(MouseEvent event){}
        public void mouseMoved(MouseEvent event){}
        public void mouseEntered(MouseEvent event){}
        public void mouseClicked(MouseEvent event){}
        public void mouseExited(MouseEvent event){}
    }
    
    public CircleFrame()
    {
        circle = new CircleComponent();
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.add(circle);
        MouseListener listener = new PointMouseListener();
        circle.addMouseListener(listener);
    }
}
