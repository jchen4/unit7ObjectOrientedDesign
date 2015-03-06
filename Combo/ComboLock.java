public class ComboLock
{
    private int num1 = 40;
    private int num2 = 40;

    private int secret1;
    private int secret2;
    private int secret3;
    private boolean left;

    private int currentNum;
    public ComboLock(int secret1, int secret2, int secret3)
    {
        this.secret1 = secret1;
        this.secret2 = secret2;
        this.secret3 = secret3;
        left = true;
    }

    public void reset()
    {
        currentNum = 0;
        num1 = 40;
        num2 = 40;
        left = true;
    }
    
    public void turnLeft(int ticks)
    {
        if(!left)
        {
            num1 = currentNum;
        }
        currentNum = (currentNum + ticks) % 39;
        left = true;
    }

    public void turnRight(int ticks)
    {
        if(left && num1 != 40)
        {
            num2 = currentNum;            
        }
        if(currentNum >= ticks)
        {
            currentNum -= ticks;
        }
        else
        {
            currentNum = (40 + currentNum - ticks);
        }
        left = false;
    }
    
    public boolean open()
    {
        return num1 == secret1 && num2 == secret2 && currentNum == secret3;
    }

}