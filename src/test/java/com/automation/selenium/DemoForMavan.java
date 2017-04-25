package com.automation.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class DemoForMavan {

	@Test
	public void testHello(){
		System.setProperty("webdriver.chrome.driver",
				   "D:\\QAWorkspace\\JavaPractice\\driver\\chromedriver.exe");  

			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();

	driver.get("http://yahoo.com"); 
	driver.quit();


		
	}
}
