package com.app.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.app.utilities.ConfigurationReader;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTesting2 {

	
	@Test
	@Parameters({"browser"})
	public static void test1(String browser) {
		System.out.println("Running on: " + browser);
		System.out.println("Running Test 1");
		
		WebDriver driver = null;
		if (driver == null) {
			switch (browser) {
			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				break;
			case "chrome":
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				break;
			default:
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			}
		}
		System.out.println(driver instanceof ChromeDriver);
		
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
	}
	
	
	
}
