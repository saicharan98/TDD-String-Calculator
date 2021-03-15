import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import static org.testng.Assert.assertEquals;

@Test
public class Calculator_Test {
	
	private Calculator cal;
	
	@BeforeTest
	public void init()
	{
		cal = new Calculator();
	}
	
	
	public void emptyString() throws Exception
	{
		assertEquals(cal.calculate(""),0);
	}
	public void singleReturn() throws Exception
	{
		assertEquals(cal.calculate("1"),1);
	}
	
	public void twoStringSum() throws Exception
	{
		assertEquals(cal.calculate("1,2"),3);
	}
	
	public void twoNewStringSum() throws Exception
	{
		assertEquals(cal.calculate("1\n2"),3);
	}
	
	public void threeStringSum() throws Exception
	{
		assertEquals(cal.calculate("1,2,3"),6);
	}
	
	@Test(expectedExceptions=Exception.class)
	public void negativeNumbers() throws Exception
	{
		cal.calculate("-10");
	}
	
	public void numberGreater1000() throws Exception
	{
		assertEquals(cal.calculate("1,2,1000"),3);
	}
}
