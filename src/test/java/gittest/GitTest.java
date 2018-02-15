package gittest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GitTest {
	
	@Test
	public void loginTest() throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("E:\\Selenium Training\\gittest\\screenshot\\test.jpg"));
	}

}
