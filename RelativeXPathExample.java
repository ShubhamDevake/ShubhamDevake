package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class RelativeXPathExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Automation programs\\Software\\Crome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/facebook.html");
		
		//1. using simple xpath method by using tag and attribute.
//		WebElement un = driver.findElement(By.xpath("//input[@id='email']"));
//		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
//		WebElement login = driver.findElement(By.xpath("//input[@value='Log In']"));
		
		//2. using and condition 
		
//		WebElement un = driver.findElement(By.xpath("//input[@id='email' and @class= 'inputtext']"));
//		WebElement pass = driver.findElement(By.xpath("//input[@id='pass' and @tabindex= '2']"));
//		WebElement login = driver.findElement(By.xpath("//input[@value='Log In' and @type= 'submit']"));
		
		//3. using or condition
		
//		WebElement un = driver.findElement(By.xpath("//input[@id='email' or @class= 'inputtext']"));
//		WebElement pass = driver.findElement(By.xpath("//input[@id='pass' or @tabindex= '2']"));
//		WebElement login = driver.findElement(By.xpath("//input[@value='Log In' or @type= 'submit']"));
		
		// 4. using contains method
		
//		WebElement un = driver.findElement(By.xpath("//input[contains(@type,'s')]"));
//		WebElement pass = driver.findElement(By.xpath("//input[contains(@id,'s')]"));
//		WebElement login = driver.findElement(By.xpath("//input[contains(@value,'og')]"));
		
		//5. using Starts with 
		WebElement un = driver.findElement(By.xpath("//input[starts-with(@name , 'e')]"));
		WebElement pass = driver.findElement(By.xpath("//input[starts-with(@type , 'p')]"));
		WebElement login = driver.findElement(By.xpath("//input[starts-with(@value , 'log')]"));
		
		un.sendKeys("Shubham");
		pass.sendKeys("SHubham1234");
		login.click();
		
		// 6. using  text method 
		
		WebElement link = driver.findElement(By.xpath(null))
		

	}

}
