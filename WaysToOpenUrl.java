package Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaysToOpenUrl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Automation programs\\Software\\Crome\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		//1. by using driver.get Method
		driver.get("https://demo.guru99.com/test/facebook.html");
		
		//2. by using navigate method
		driver.navigate().to("https://demo.guru99.com/test/facebook.html");
		
		

	}

}
