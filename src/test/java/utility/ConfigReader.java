package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	Properties prop;
	
	public ConfigReader(){
		
		
		try {
			File src = new File("./Configuration/Config.property");
			FileInputStream fis = new FileInputStream(src);
			prop = new Properties();
			prop.load(fis);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception occured" + e.getMessage());
		} 
		
	}
	
	public String getChromePath(){
		
		String path = prop.getProperty("ChromeDriver");
		return path;
		
	}
	
public String getAgentConsoleURL(){
		
		String AgentURL=prop.getProperty("AgentConsoleURL");
		return AgentURL;
			
	}

public String getChatURL(){
		return prop.getProperty("ChatURL");
}
}