package com.egain.agent.logintestcases;

import org.testng.annotations.Test;

import com.egain.agent.loginpage.pom.LaunchAgentConsole;

public class TC_4_VerifyGetTitle extends LaunchAgentConsole{
	
	@Test
	public void VerifyGetTitle()
	{
	fn_AppLaunch();
	driver.quit();
	}
}
