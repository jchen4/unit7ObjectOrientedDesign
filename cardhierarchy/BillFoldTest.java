import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BillFoldTest
{
    @Test
    public void test1()
    {
        BillFold billfold = new BillFold();
        IDCard id = new IDCard("123456");
        DriverLicense dCard = new DriverLicense (2013);
        
        billfold.addCard(id);
        billfold.addCard(dCard);
        assertEquals(billfold.getExpiredCardCount(), 1);
    }
    
    @Test
    public void test2()
    {
        BillFold billfold = new BillFold();
        IDCard id = new IDCard("123456");
        CallingCard dCard = new CallingCard ("123", "456");
        
        billfold.addCard(id);
        billfold.addCard(dCard);
        System.out.println(billfold.formatCard());
    }
}
