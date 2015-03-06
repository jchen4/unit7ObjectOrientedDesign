public class IDCard extends Card
{
    private String IDNumber;
    
    public IDCard(String id)
    {
        IDNumber = id;
        
    }
    
    public String format()
    {
        return "ID number: " + IDNumber;
    }
    
    public String toString()
    {
        String str = "";
        str += "IDCard";
        str += "[name = " + super.getName() + "]";
        str += "[ID number = " + this.IDNumber + "]";
        return str;
    }
}