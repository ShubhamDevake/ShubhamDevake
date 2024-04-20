package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class CSSLocatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Automation programs\\Software\\Crome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/facebook.html");
//		
//		//1. By using tag and class name
//		WebElement un = driver.findElement(By.cssSelector("input.inputtext"));
//		
//		//2. By using tag and id
//		WebElement pass = driver.findElement(By.cssSelector("input#pass"));
//		
//		un.sendKeys("Shubham");
//		pass.sendKeys("Shubham@1234");
		
//		//3. by using tag and attribute
//		WebElement un = driver.findElement(By.cssSelector("input[type= 'text'][name = 'email']"));
//		
//		//4. by using tag,class and attribute
//		
//		WebElement pass = driver.findElement(By.cssSelector("input.inputtext[type = 'pass'][tabindex='1']"));
//		
//		un.sendKeys("Shubham");
//		pass.sendKeys("Shubham@1234");
//		
//		//5. by using tag, id and attribute
//		
//		WebElement login = driver.findElement(By.cssSelector("input#u_0_b[type = 'submit'][value = 'Log In']"));
//		login.click();
		
		
		//6. by using start with- it will find the locator based on Starting charcter.
		WebElement un = driver.findElement(By.cssSelector("input[name^=ema]"));
		un.sendKeys("Shubham");
		
		
		// 7. by using end with - it will find the locator based on ending charcter.
		WebElement pass = driver.findElement(By.cssSelector("input[type$='word']"));
		pass.sendKeys("Shubham");
		
		// 8. by using the contains - it will find the locator based on  charcter which is present or not.
		WebElement login = driver.findElement(By.cssSelector("input#u_0_b[type*='bm']"));
		login.click();
		
		
		
		
		
		

	}

}
