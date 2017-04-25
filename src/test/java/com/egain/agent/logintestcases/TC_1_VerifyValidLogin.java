package com.egain.agent.logintestcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import utility.Screens;

import com.egain.agent.loginpage.pom.AgentLoginPage;
import com.egain.agent.loginpage.pom.LaunchAgentConsole;

public class TC_1_VerifyValidLogin extends LaunchAgentConsole{

	@Test
	public void fn_VerifyValidLogin() throws IOException, InterruptedException
	{
		fn_AppLaunch();
		AgentLoginPage agentloginobj = new AgentLoginPage(driver);
		agentloginobj.fn_userLogin("calltrack", "egain123");
		agentloginobj.fn_getAgentNameAfterLoginInConsole();
		Reporter.log("Agent logged in successfully");
		agentloginobj.fn_takeScreen();
		Reporter.log("Screenshot taken");
		
		
	}	
	}
