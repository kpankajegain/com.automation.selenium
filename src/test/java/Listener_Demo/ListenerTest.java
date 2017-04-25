package Listener_Demo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerTest implements ITestListener
{

	public void onTestStart(ITestResult result) {
		System.out.println(result.getName()+" test case started");	
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("The name of the testcase passed is :"+result.getName());	
		
	}

	public void onTestFailure(ITestResult result) {
		 System.out.println("The name of the testcase failed is :"+result.getName());
		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("The name of the testcase skiped is :"+result.getName());
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
}