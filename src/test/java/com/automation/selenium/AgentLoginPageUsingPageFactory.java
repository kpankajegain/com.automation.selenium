package com.automation.selenium;

//Sayali Temp Test
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AgentLoginPageUsingPageFactory {
	
	WebDriver driver;
	
	@FindBy(xpath="//div[@id='textfield-1013-inputWrap']/input[@name='userName']") 
	WebElement username;
	@CacheLookup
	
	@FindBy(how=How.XPATH, using="//div[@id='textfield-1014-inputWrap']/input[@name='password']")
	WebElement password;
	@CacheLookup
	
	@FindBy(how=How.XPATH, using ="//span[@id='button-1040-btnEl']")
	WebElement loginbutton;
	
	public AgentLoginPageUsingPageFactory(WebDriver driver){
		
	this.driver=driver;
	
	}
	public void userLogin(String uid, String pswd)
	{
		username.sendKeys(uid);
		password.sendKeys(pswd);
		loginbutton.click();
	}
		}
	


