package com.egain.agent.logintestcases;

import junit.framework.Assert;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.egain.agent.loginpage.pom.AgentLoginPage;
import com.egain.agent.loginpage.pom.LaunchAgentConsole;

public class TC_2_VerifyEndExistingSessions extends LaunchAgentConsole {
	@Test
	public void VerifyValidLoginEndExistingSessions() throws InterruptedException
	{
		fn_AppLaunch();
		AgentLoginPage a = new AgentLoginPage(driver);
		a.fn_userLogin("calltrack", "egain123");
		a.fn_endExistignSession();
		System.out.println("End existing sessions and begin new session");
		//a.fn_getText();
	}	
}

