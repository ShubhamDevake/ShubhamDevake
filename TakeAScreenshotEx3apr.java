package Automation;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;
																																																																																									
public class TakeAScreenshotEx3apr {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Automation programs\\Software\\Crome\\chromedriver.exe");

		WebDriver driver =new ChromeDriver();
		
		driver.get("https://moneyboats.com/");
		driver.manage().window().maximize();
		
		// firstly we are creating a reference of TakeScreenShot interface
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		//calling getscreenshots method to create image
		
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		
		 //move the file into new destination folder
		
		File destFile = new File("D:\\Images\\error.png");
		
		// we will copy the ScreenShot into destination folder
		Files.copy(srcFile, destFile);
	}

}
