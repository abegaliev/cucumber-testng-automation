package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public final class Screenshot {

	private static WebDriver driver = Browser.getDriver();

	/**
	 * Takes a screenshot using FilesUtil(custom class).
	 * File sourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	 */
	public static void takeScreenshot() {
		String fileName = "screenshot" + LocalDateTime.now() + ".png";
		String directory = "//Users//almazbekbegaliev//Desktop//";
String fullPath = directory + fileName;
		
		File sourceFile = null;
		FileChannel sourceChannel = null;
		FileChannel destChannel = null;

		try {

			sourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			sourceChannel = new FileInputStream(sourceFile).getChannel();
			destChannel = new FileOutputStream(fullPath).getChannel();
			destChannel.transferFrom(sourceChannel, 0, sourceChannel.size());
		} catch (Exception e) {
			System.out.println("Error while taking a screenshot: " + e);
		}

	}


	public static String getRandomString(int length) {
		StringBuilder sb = new StringBuilder();
		String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		for (int i = 0; i < length; i++) {
			int index = Num.getRandomInt(characters.length());
			sb.append(characters.charAt(index));
		}
		return sb.toString();
	}

}
