package advancedFeatures.more;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import utilities.Browser;

public class ChromeOptionsDemo {

	public static void main(String[] args) {
	
		ChromeOptions options = new ChromeOptions();
		options.addExtensions(new File("/Users/almazbekbegaliev/Library/Application Support/Google/Chrome/Default/Extensions/aapocclcgogkmnckokdopfmhonfmgoek/0.10_0.crx"));
		WebDriver driver = Browser.getDriver();
		
		driver = new ChromeDriver(options);
		driver.get("http://google.com");
	}
}