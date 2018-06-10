package advancedFeatures.color;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.Browser;

public class Color {

	public static void main(String[] args) {
		WebDriver driver = Browser.getDriver();
		
		driver.get("https://10fastfingers.com/typing-test/english");
		WebElement elem = driver.findElement(By.xpath("(//a[.='Login'])[1]"));
		System.out.println(elem.getCssValue("background-color"));
		
	}
	
}
