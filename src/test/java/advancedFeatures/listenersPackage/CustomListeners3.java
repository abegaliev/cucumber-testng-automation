package advancedFeatures.listenersPackage;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class CustomListeners3 implements ISuiteListener {

	@Override
	public void onStart(ISuite suite) {
		// When <suit> tag starts
		System.out.println("onStart: before suite starts");
	}

	@Override
	public void onFinish(ISuite suite) {
		// When <suit> tag ends
		System.out.println("onFinish: after suite completes");
	}

	
	
}
