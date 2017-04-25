package Listener_Demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Date;
import java.util.StringTokenizer;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CookiesCopy {
	@Test
	public void login(){
		
	
	System.setProperty("webdriver.chrome.driver","D:\\QAWorkspace\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	    driver=new ChromeDriver();					
	    try{			
	     
	        File file = new File("Cookies.data");							
	        FileReader fileReader = new FileReader(file);							
	        BufferedReader Buffreader = new BufferedReader(fileReader);							
	        String strline;			
	        while((strline=Buffreader.readLine())!=null){									
	        StringTokenizer Tokenizertoken = new StringTokenizer(strline,";");									
	        while(Tokenizertoken.hasMoreTokens()){					
	        String name = Tokenizertoken.nextToken();					
	        String value = Tokenizertoken.nextToken();					
	        String domain = Tokenizertoken.nextToken();					
	        String path = Tokenizertoken.nextToken();					
	        Date expiry = null;					
	        		
	        String val;			
	        if(!(val=Tokenizertoken.nextToken()).equals("null"))
			{		
	        	expiry = new Date(val);					
	        }		
	        Boolean isSecure = new Boolean(Tokenizertoken.nextToken()).								
	        booleanValue();		
	        Cookie ck = new Cookie(name,value,domain,path,expiry,isSecure);																	
	        driver.manage().addCookie(ck); // This will add the stored cookie to your current session					
	        }		
	        }		
	        }catch(Exception ex){					
	        ex.printStackTrace();			
	        }		
	        driver.get("http://demo.guru99.com/V4/");	
}
}
