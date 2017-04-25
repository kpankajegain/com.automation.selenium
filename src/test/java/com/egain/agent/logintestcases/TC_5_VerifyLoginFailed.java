package com.egain.agent.logintestcases;

import org.testng.annotations.Test;

import com.egain.agent.loginpage.pom.AgentLoginPage;
import com.egain.agent.loginpage.pom.LaunchAgentConsole;

public class TC_5_VerifyLoginFailed extends LaunchAgentConsole{

	@Test
	public void fn_InvalidLogin() throws InterruptedException{		
	fn_AppLaunch();
	AgentLoginPage a = new AgentLoginPage(driver);
	a.fn_userLogin("calltrack1111", "egain123");
	a.fn_loginFailed();;
	System.out.println("Agent login failed");
	
}
}