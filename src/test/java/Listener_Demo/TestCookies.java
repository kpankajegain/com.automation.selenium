
package Listener_Demo;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Set;

import org.openqa.selenium.By;		
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCookies {
	
		@Test		
	public void Login()				
	{		
		System.setProperty("webdriver.chrome.driver","D:\\QAWorkspace\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Set<Cookie> cook = driver.manage().getCookies();
		System.out.println(cook);
	    driver.get("http://demo.guru99.com/V4/");					
	    driver.findElement(By.name("uid")).sendKeys("mngr72594");							
	    driver.findElement(By.name("password")).sendKeys("erYmepA");							
	    driver.findElement(By.name("btnLogin")).click();
	    
	    File file = new File("Cookies.data");							
        try		
        {		
            // Delete old file if exists
			file.delete();		
            file.createNewFile();			
            FileWriter fileWrite = new FileWriter(file);							
            BufferedWriter Bwrite = new BufferedWriter(fileWrite);							
            // loop for getting the cookie information 		
            for(Cookie ck : driver.manage().getCookies())							
            {		
                Bwrite.write((ck.getName()+";"+ck.getValue()+";"+ck.getDomain()+";"+ck.getPath()+";"+ck.getExpiry()+";"+ck.isSecure()));																									
                Bwrite.newLine();			
        }		
            Bwrite.flush();			
            Bwrite.close();			
            fileWrite.close();			
        }catch(Exception ex)					
        {		
            ex.printStackTrace();			
        }		
    }		
}



