package Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethodPractical {

	public static void main(String[] args) {
		
		//This method is helps you to set the browser path which we need to use to run the automation Script.
		
		System.setProperty("webdriver.chrome.driver", "C:\\Automation programs\\Software\\Crome\\chromedriver.exe");
		
		//To create the   chromeDriver object we need to create webdriver interface reference variable and need to 
		//create object for browser.
		
		WebDriver driver = new ChromeDriver();
		
		// 1. get() :- This method will help to open valid url/website.
		
		driver.get("https://www.amazon.in/");
		
		//3. getTitle() :- To get the title of current open url we can use get title method. 
		String title = driver.getTitle();
		System.out.println(title);
		
		//4. getCurrentURl ():- to get the currently open url we can use current url
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		// 5. getPageSource():- 
		String source = driver.getPageSource();
		System.out.println(source);
		
		
		
		//2. close():- this method will help to close method.
		
		driver.close();
		
		// 6. quit() :-  to closed all open url we need to used quit method.
		
		driver.quit();
	}
	
	

}
