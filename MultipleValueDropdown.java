package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class MultipleValueDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Automation programs\\Software\\Crome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://output.jsbin.com/osebed/2");
		
		WebElement fruits = driver.findElement(By.id("fruits"));
		Select select = new Select(fruits);
		
		//To check the if we can select the multiple value from the dropdown we can use ismultiple.
		
		if(select.isMultiple())
		{
			select.selectByIndex(0);
			select.selectByValue("grape");
			select.selectByVisibleText("Apple");
		}
		
		select.deselectByIndex(0);
		select.selectByValue("grape");
		select.deselectAll();
		

	}

}
