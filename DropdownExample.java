package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DropdownExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Automation programs\\Software\\Crome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		WebElement country = driver.findElement(By.name("country"));
		Select select = new Select(country);
		
		
		//1. Select By visible text
		
//		select.selectByVisibleText("CHINA");
		
//		2. Select by value
		
//		select.selectByValue("BERMUDA");
//		
		//3. select by index
		select.selectByIndex(7);

	}

}
