package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardEventEx30mar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Automation programs\\Software\\Crome\\chromedriver.exe");

		WebDriver driver =new ChromeDriver();
		
		Actions action = new Actions(driver);
		
		driver.get("https://demo.guru99.com/test/facebook.html");
		driver.manage().window().maximize();
		WebElement un = driver.findElement(By.id("email"));
		WebElement pw = driver.findElement(By.id("pass"));
		
		//1. Keydown : - it will press the key and does not release
		
		action.keyDown(un,Keys.SHIFT).sendKeys("shubham").perform();
		action.keyDown(pw,Keys.SHIFT).sendKeys("shubham123").perform();
		
		action.keyDown(Keys.ENTER).perform();

		

	}

}
