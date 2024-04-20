package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class JavaScriptExecuterEx2apr {

	public static void main(String[] args) throws InterruptedException {

		
		// java script executer is an interface which is used to execute javascript statement.
		
		System.setProperty("webdriver.chrome.driver", "C:\\Automation programs\\Software\\Crome\\chromedriver.exe");

		WebDriver driver =new ChromeDriver();
		
		driver.get("https://demo.guru99.com/v4/index.php");
		driver.manage().window().maximize();
		
		//1. we need to create reference variable of javascript executor interface.
		JavascriptExecutor js = (JavascriptExecutor)driver;
			
		//2. in javascript executor interface we have 2 method executescript and executeAsyncScript
		
		driver.findElement(By.name("uid")).sendKeys("Shubham");
		driver.findElement(By.name("password")).sendKeys("Shubham1234");
		
		WebElement login = driver.findElement(By.name("btnLogin"));
		
//		// we will use below javascript to click on login button.
//		js.executeScript("arguments[0].click();", login);
//		
//		Thread.sleep(2000);
//		
//		//we will use below javascript to handle the alert
//		js.executeScript("alert('User or Password is not valid!');");
		
		// we will use below script to get all the detailed of webpage like title ,domain name and url
		
		String domainName = js.executeScript("return document.domain;").toString();
		System.out.println(domainName);
		
		String title = js.executeScript("return document.title;").toString();
		System.out.println(title);
		
		String url = js.executeScript("return document.URL;").toString();
		System.out.println(url);
		
		// we will use below script to launch the new url.
		
		js.executeScript("window.location='https://demo.guru99.com/test/facebook.html'");
		
		
		
		
	}

}
