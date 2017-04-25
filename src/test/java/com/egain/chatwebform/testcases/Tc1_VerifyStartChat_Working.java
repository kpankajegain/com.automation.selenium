package com.egain.chatwebform.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.automation.selenium.CustomerWebPagePom;
import com.egain.agent.loginpage.pom.AgentLoginPage;

import utility.ConfigReader;

public class Tc1_VerifyStartChat_Working {
	
	
	
ConfigReader reader;
	
	@BeforeTest
	public void setup(){
		reader = new ConfigReader();
		//System.setProperty("webdriver.chrome.driver",reader.getChromePath());
		System.out.println("==Chrome is launched==");
		System.setProperty("webdriver.chrome.driver",reader.getChatURL());
		System.out.println("==Customer web form launched==");
	}

	@Test
	public void verifyChat()
	{

		System.setProperty("webdriver.chrome.driver","D:\\QAWorkspace\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	//driver.manage().window().maximize();
	
	TimeUnit  tu = TimeUnit.MILLISECONDS;
	driver.manage().timeouts().implicitlyWait(20000, tu);
	driver.get("http://punv730r.egeng.info/system/templates/chat/kiwi/chat.html?entryPointId=1000&templateName=kiwi&languageCode=en&countryCode=US&ver=v11");
	CustomerWebPagePom chatweb = new CustomerWebPagePom(driver);
	//chatweb.fn_checkforxbutton();
	//chatweb.fn_logopresent();
	//chatweb.fn_getattibutes();
	chatweb.fn_startChat("","","","");
	//chatweb.fn_chatWindowTtitle();
	chatweb.fn_valiadterror();
	//driver.quit();
}
}
