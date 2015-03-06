import java.awt.Rectangle;

public class BetterRectangle extends Rectangle
{   
    public BetterRectangle()
    {
        super.setSize(10, 10);
        super.setLocation(0, 0);
    }

    public int getArea()
    {
        return super.height * super.width;
    }

    public int getPerimeter()
    {
        return 2 * (super.height + super.width);
    }
}
