public class CallingCard extends Card
{
    private String cardNumber;
    private String PIN;
    
    public CallingCard(String cardNumber, String PIN)
    {
        this.cardNumber = cardNumber;
        this.PIN = PIN;
    }

    public String format()
    {
        return "The card number is: " + cardNumber + " and the PIN is: " + PIN;
        
    }
    
    public String toString()
    {
        String str = "";
        str += "CallingCard";
        str += "[name = " + super.getName() + "]";
        str += "[Card number = " + this.cardNumber + "]";
        str += "[PIN = " + this.PIN + "]";
        return str;
    }
}
