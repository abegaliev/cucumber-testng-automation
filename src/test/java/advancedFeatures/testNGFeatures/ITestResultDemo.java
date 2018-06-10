package advancedFeatures.testNGFeatures;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ITestResultDemo {

	@Test
	public void test1() {
		System.out.println("Running => test1");
		Assert.assertTrue(false);
	}
	
	
	@Test
	public void test2() {
		System.out.println("Running => test2");
		Assert.assertTrue(true);
	}
	
	@AfterMethod
	public void afterMethod(ITestResult testResult) {
		if(testResult.getStatus() == ITestResult.FAILURE) {
			System.out.println("Failed: " + testResult.getName());
		}else if(testResult.getStatus() == ITestResult.SUCCESS) {
			System.out.println("SuccessFull: "+ testResult.getName());
		}
	
	}
	
	
}
