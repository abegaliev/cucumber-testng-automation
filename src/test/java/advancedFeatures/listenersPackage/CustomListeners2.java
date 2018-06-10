package advancedFeatures.listenersPackage;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;

public class CustomListeners2 implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		// Executes when @Test method starts
		System.out.println("onTestStart --> Test Name: "+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// If @Test method is successfully runs
		System.out.println("onTestSuccess ==> : "+ result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// If @Test method failed
		System.out.println("onTestFailure ==> : "+ result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// If @Test method failed
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// We won't use it.
		
	}

	@Override
	public void onStart(ITestContext context) {
		// Before <test> tag of xml file
		System.out.println("On test start ==> :" + context.getName());
		ITestNGMethod methods [] = context.getAllTestMethods();
		System.out.println("These methods will be executed in this test tag: ");
		
		for(ITestNGMethod method : methods) {
			System.out.println(method.getMethodName());
		}
	}

	@Override
	public void onFinish(ITestContext context) {
		// After <test> tag of xml file
		System.out.println("On test Finish ==> :" + context.getName());
		
	}

	
	
	
	
	
}
