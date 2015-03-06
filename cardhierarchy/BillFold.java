public class BillFold
{
    private Card card1;
    private Card card2;
    public BillFold()
    {
    }
    
    
    public void addCard(Card newCard)
    {
        if (card1 == null)
        {
            card1 = newCard;
        }
        else if (card2 == null)
        {
            card2 = newCard;
        }
    }
    
    public String formatCard()
    {
        String formatted = "[";
        if (card1 != null)
        {
            formatted += (card1.format() + "|");
        }
        
        if (card2 != null)
        {
            formatted += card2.format();
        }
        formatted += "]";
        return formatted;
    }
    
    public int getExpiredCardCount()
    {
        int count = 0;
        if (card1.isExpired() == true)
        {
            count++ ;
        }
        
        if (card2.isExpired() == true)
        {
            count++ ;
        }
        
        return count;
    }
}


