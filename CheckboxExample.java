package Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class CheckboxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Automation programs\\Software\\Crome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		//1. To click on single check box we need to findout the Element as need to click on it.
//		
//		WebElement checkbox1 = driver.findElement(By.id("checkbox1"));
//		checkbox1.click();
//		
//		//to check the 
//		
//		if (checkbox1.isSelected())
//		{
//			System.out.println("chEckbox is selected by default");
//		}
//		else
//		{
//			checkbox1.click();
//		}
		
		//2. To select the multiple checkbox in single code we will use below method.
		
		List<WebElement> checkboxes = driver.findElements(By.xpath("//*[@type = 'checkbox']")) ;
//		int size  = checkboxes.size();
//		
//		for(int i = 0; i<size; i++)
//		{
//			checkboxes.get(i).click();
//		}

		
		// if you have multiple element and you want to perform operation on specific in index you can use the below method.
//		checkboxes.get(0).click();
		
		//---------------------------------------------------------------------------------------------
		
		
		int size = 0;
		for (int i= 0;i<size;i++)
		{
			// getattribute method is used to fetch the value of elements attribute as per given key.
			
			String value = checkboxes.get(i).getAttribute("value");
			if(value.equalsIgnoreCase("Movies"))
			{
				checkboxes.get(i).click();
			}
		}
		
		
	}

}
