package com.seleniumproject.module1;
import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.firefox.FirefoxDriver;		
import org.testng.Assert;		
import org.testng.annotations.Test;	
import org.testng.annotations.BeforeTest;	
import org.testng.annotations.AfterTest;		
public class NewTestNG {		
	    private WebDriver driver;		
		@Test				
		public void testEasy() {	
			driver.get("https://demo.guru99.com/test/guru99home/");  
			String title = driver.getTitle();				 
			Assert.assertTrue(title.contains("Demo Guru99 Page")); 		
			System.out.println("hello");
		}	
		@BeforeTest
		public void beforeTest() {	
			System.setProperty("webdriver.gecko.driver","C:\\Users\\shilpa\\Documents\\Study_Stuff\\Selenium_Project\\Selenium_Browser\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		    driver = new FirefoxDriver();  
		}		
		@AfterTest
		public void afterTest() {
			driver.quit();			
		}		
}	
