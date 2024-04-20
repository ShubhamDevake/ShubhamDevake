package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocaterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Automation Testing\\software\\chrome\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/facebook.html");
		//to find the element by using id locators firstly we need to create reference variable of webelement interface and below syntax
	WebElement username =	driver.findElement(By.id("email"));
	WebElement userpassword = driver.findElement(By.id("pass"));
	 WebElement login   =  driver.findElement(By.id("u_0_b"));
	 
	 //sendkeys method is used to enter values of textbox
	 username.sendKeys("snehagawand");
	 userpassword.sendKeys("snehal123");
	 //click method use for click on radio button ,checkbox,link
	 login.click();
	 
	 
	 

	}

}
