package advancedFeatures.listenersPackage;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners1.class)
public class ListenersTest1 {

	@BeforeClass
	public void setUp() {
		System.out.println("SetUp method");
	}
	
	@BeforeClass
	public void tearDown() {
		System.out.println("End method");
	}
	
	@Test
	public void test1() {
		System.out.println("First method");
		Assert.assertTrue(true);
	}
	
	@Test
	public void test2() {
		System.out.println("Second method");
		Assert.assertTrue(true);
	}
	
	
	
	
	
	
}
