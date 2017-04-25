package com.egain.chatwebform.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.automation.selenium.CustomerWebPagePom;
import com.egain.agent.loginpage.pom.AgentLoginPage;

import utility.ConfigReader;

public class Tc1_verifyChatLaunch {

	@Test
	public void verifyChatLaunch()
	{
		System.setProperty("webdriver.chrome.driver","D:\\QAWorkspace\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		CustomerWebPagePom webpageobj = new CustomerWebPagePom(driver);
		webpageobj.fn_LaunchChatURL("http://punv897zl.egeng.info/system/templates/chat/kiwi/chat.html?entryPointId=1000&templateName=kiwi&languageCode=en&countryCode=US&ver=v11");
		Reporter.log("Customer Web Form Launhced Successfully");
	}
}
