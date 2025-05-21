package testng_Package;

import org.testng.annotations.Test;

public class ChildClass extends ParentClass
{
	
	
	@Test
	public void testRun()
	{
		//ParentClass ps = new ParentClass(); //Create an object and call the method from another class
		//ps.doThis();
		
		ReusableMethods rm = new ReusableMethods(3); //Parameterized constructor
		int a = 3;
		doThis(); //You need to use "extends" to call the method from another class (from ParentClass)
		System.out.println(rm.increment());
		System.out.println(rm.decrement());
	}
		
		
}
