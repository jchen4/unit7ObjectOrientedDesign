import java.util.GregorianCalendar;

public class DriverLicense extends Card
{
    private int expirationYear;
    
    public DriverLicense(int expirationYear)
    {
        this.expirationYear = expirationYear;
    }
    
    public String format()
    {
        return "The expiration year is: " + expirationYear;
    }
    
    public boolean isExpired()
    {
        GregorianCalendar calendar = new GregorianCalendar();
        return calendar.get(calendar.YEAR) > expirationYear;
    }
    
    public String toString()
    {
        String str = "";
        str += "DriverLicense";
        str += "[name = " + super.getName() + "]";
        str += "[expiration year = " + this.expirationYear + "]";
        return str;
    }
}
