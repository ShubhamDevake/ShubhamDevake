package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAndDragAndDropEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Automation programs\\Software\\Crome\\chromedriver.exe");

		WebDriver driver =new ChromeDriver();
		
		Actions action = new Actions(driver);
		
		driver.get("https://only-testing-blog.blogspot.com/");
		driver.manage().window().maximize();
		
//		//1. double click:it will double click on the given webelement.
//		WebElement button = driver.findElement(By.xpath("//*[@id=\"post-body-7297556448793668582\"]/div[1]/button"));
//		action.doubleClick(button).perform();
		
		//2. drag and drop :- 
		
		WebElement dragAndDrop = driver.findElement(By.linkText("Drag and Drop"));
		dragAndDrop.click();
		
		WebElement drag = driver.findElement(By.id("dragdiv"));
		WebElement drop = driver.findElement(By.id("dropdiv"));
		
//		action.dragAndDrop(drag, drop).perform();
		
		action.dragAndDropBy(drag, 120, 150).perform(); // by x and y axis.

		

	}

}
