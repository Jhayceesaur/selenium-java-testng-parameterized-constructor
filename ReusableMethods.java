package testng_Package;

public class ReusableMethods 
{
	int a;
	
	public ReusableMethods(int a) 
	{
		this.a=a;
	}

	public int increment()
	{
		a = a+1;
		return a;
	}
	
	public int decrement()
	{
		a = a-1;
		return a;
	}

}
