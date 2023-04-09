package tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Test2 {
	
	@Test(priority=1)
	void demo()
	{
		int a=5,b=10;
		
		System.out.println(a*b);
	}
	
	@Test(priority=2)
	void ser()
	{
		System.out.println("Those are legal");
		System.out.println("Those are not avialable");
	}

}
