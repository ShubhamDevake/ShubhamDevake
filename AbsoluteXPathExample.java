package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AbsoluteXPathExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Automation programs\\Software\\Crome\\chromedriver.exe");

		WebDriver driver =new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/facebook.html");
		
		WebElement uname = driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div[1]/div/div/form/table/tbody/tr[2]/td[1]/input"));
		WebElement password = driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div[1]/div/div/form/table/tbody/tr[2]/td[2]/input"));
		WebElement login = driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div[1]/div/div/form/table/tbody/tr[2]/td[3]/label/input"));
		
		
		uname.sendKeys("Shubham");
		password.sendKeys("SHubham1234");
		login.click();
		
		
	}

}
