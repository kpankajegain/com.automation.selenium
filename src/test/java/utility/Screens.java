package utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.egain.agent.loginpage.pom.AgentLoginPage;

public class Screens extends AgentLoginPage  {
	
	public Screens(WebDriver driver) throws IOException {
		super(driver);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source,new File("./Screen1/eGain.png"));
		System.out.println("Screenshot taken");
	}

}
