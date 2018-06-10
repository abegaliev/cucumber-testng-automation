package advancedFeatures.listenersPackage;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class CustomListeners1 implements IInvokedMethodListener {

	@Override
	public void beforeInvocation(IInvokedMethod method, ITestResult testResult ) {
		// Runs Before every method in the Test Class
		System.out.println("BeforeInvocation: "+testResult.getClass().getName() + " ==> " + method.getTestMethod().getMethodName());
	}
	
	@Override
	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
		// Runs after every method in the Test Class
		System.out.println("AfterInvocation: "+testResult.getClass().getName() + " ==> " + method.getTestMethod().getMethodName());
	}
	
	
	
	
	
	
}
