import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.After;
import org.junit.Before;
public class TestUtility
{
	Utility u=null;
	@Before
	public void setUp()
	{
		u=new Utility();
		
	}
	@After
	public void tearDown()
	{
		u=null;
	}
    @Test
	public void testsqr()
    {
    	assertEquals(100,u.sqr(10));
    }
    @Test
    public void testsum()
    {
    	assertEquals(10,u.sum(20, -10));
    }
    @Test
    public void testpower()
    {
    	  assertEquals(125,u.power(5, 3));
    }
}
    
