package utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Page {
	
	private static WebDriver driver = Browser.getDriver();

	
	/**
	 * Moves to given target Element using Actions class.
	 * 
	 * @param element
	 */
	public static void moveToElement(WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
	}
	
	/**
	 * Rotates the scroll wheel on wheel- equipped mice.
	 * 
	 * @param scroll, number of "notches" to move the mouse wheel 
	 * Negative values indicate movement up/away from the user,
	 * positive values indicate movement down/towards the user.
	 */
	public static void mouseWheel(int scrolls) {
		try {
			Robot robot = new Robot();
			robot.mouseWheel(scrolls);
		} catch (AWTException e) {
			System.out.println("Could not scroll the mouse :"+ e.getMessage());
		}
	}
	
	
	/**
	 * Switches to second the window of the Browser.
	 * 
	 * @param currentHandle;
	 */
	public static void switchToSecondWindow(String currentHandle) {
		List<String> handles = Selenium.getListOfHandles();
		for(String handle : handles) {
			if(!handle.equals(currentHandle)) {
				driver.switchTo().window(handle);
			}
		}
	}
	
	
	
	
	
	
	
	
}
