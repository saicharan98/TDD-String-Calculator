
public class Calculator {

	public int StringToInt(String a) throws Exception
	{
		if(Integer.parseInt(a)<0)
		{
			throw new Exception("Negative number");
		}
		else
		{
			return Integer.parseInt(a);
		}
	}
	
	public boolean EmptyString(String a)
	{
		return a.isEmpty();
	}
	
	public int SumOfTwo(String[] a) throws Exception
	{
		GetException(a);
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			if(StringToInt(a[i]) >= 1000)
			{
				continue;
			}
			sum=sum+ Integer.parseInt(a[i]);
		}
		return sum;
	}
	
	public void GetException(String[] a) throws Exception
	{
		for(String str:a)
		{
			if(StringToInt(str)<0)
			{
				throw new Exception("Negative number");
			}
		}
	}
	
	public int calculate(String input) throws Exception {
		
		String delimiter = ",|\n";
		String[] s = input.split(delimiter);
		if(EmptyString(input))
		{
			return 0;
		}
		else if(s.length == 1)
		{
			return StringToInt(input);
		}
		else
		{
			return SumOfTwo(s);
		}
	}
	
	

}
