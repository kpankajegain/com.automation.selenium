 package com.egain.agent.loginpage.pom;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AgentLoginPage {
	
	WebDriver driver;
	
	By username=By.xpath("//div[@id='textfield-1013-inputWrap']/input[@name='userName']");
	By password=By.xpath("//div[@id='textfield-1014-inputWrap']/input[@name='password']");
	By loginbutton=By.xpath("//span[@id='button-1041-btnInnerEl']");
	By optionbutton=By.xpath("//span[@id='button-1023-btnEl']");
	By logout = By.xpath("//span[@id='menuitem-1037-textEl']");
	By invalidlogin = By.xpath("//div[@id='component-1037']");
	By SignAgain = By.xpath("//div[@id='component-1037']");
	By afterlogin= By.xpath("//span[@class='user-name-txt']");
	By endsession=By.xpath("//div/label[text()='End existing sessions and begin new session']");
	By retainsession=By.xpath("//div/label[text()='Retain existing sessions and begin new session']");
	By LoginFailed=By.xpath("//div/label[text()='Login Failed']");
	//By LoginFailure=By.xpath("//div[text()='Your Username and/or Password is invalid.']");
	By LoginFailure=By.xpath("//div[@class='x-component failedMsg x-box-item x-component-default']");
	
	
					
	public AgentLoginPage(WebDriver driver){
	this.driver=driver;
	}
	public void fn_userLogin(String uid, String pswd)
	{
		driver.findElement(username).sendKeys(uid);
		driver.findElement(password).sendKeys(pswd);
		driver.findElement(loginbutton).click();	
	}
	
	public void fn_logout()
	{
		driver.findElement(optionbutton).click();
		driver.findElement(logout).click();
	}
	
	
	public void fn_getAgentNameAfterLoginInConsole()
	{
		String agentname= driver.findElement(afterlogin).getText();
		System.out.println("The Agent name is "  + agentname);
		Assert.assertEquals("calltrack", agentname);
	}
	
	
	public void fn_endExistignSession() throws InterruptedException
	{
		Thread.sleep(10000);
		driver.findElement(endsession).click();
		driver.findElement(loginbutton).click();
	}
	
	public void fn_retainExistignSession() throws InterruptedException
	{
		Thread.sleep(10000);
		driver.findElement(retainsession).click();
		driver.findElement(loginbutton).click();
	}
	
	
	public void fn_loginFailed() throws InterruptedException 
	{
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(LoginFailure));	
		String actul= driver.findElement(LoginFailure).getText();
		System.out.println(actul);
		Assert.assertEquals("Your Username and/or Password is invalid.", actul);
	}
	
	
	public void fn_takeScreen() throws IOException {
	TakesScreenshot ts=(TakesScreenshot)driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
	FileUtils.copyFile(source,new File("./Screens/Agent"+ timeStamp+ ".png"));
	System.out.println("Screenshot captured");
	}
	
		}
	


