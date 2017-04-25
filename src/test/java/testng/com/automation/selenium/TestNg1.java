package testng.com.automation.selenium;
import org.testng.Assert; import org.testng.annotations.Test; 

public class TestNg1 {
	
	
	
	 
	  
	@Test(enabled =false) 
	public void testPrintMessage()
	{
		System.out.println("Inside testPrintMessage");   
	
	}  
	
	@Test()
	public void testSalutationMessage()
	{ 
		System.out.println("Inside testSalutationMessage");  
	}
	
	@Test(dependsOnMethods ={"group12"})
	public void group1()
	{ 
		System.out.println("I am in group1");  
	}
	
	
	@Test(groups={"grp1","grp2"})
	public void group12()
	{ 
		System.out.println("I am in group 1 and 2");  
	}

	
	@Test(expectedExceptions =ArithmeticException.class)  
	public void testexcp()
	{ 
		int i =1; 
		int j =i/0;
		System.out.println("exp" + j);  
		
	}
}
