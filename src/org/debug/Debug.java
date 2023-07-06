package org.debug;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Debug {
   public static void main(String[]args) {
	  System.setProperty("Webdriver.chrome.driver", 
			 "C:\\Users\\Ammu\\eclipse-workspace\\Selenium1\\IE11\\IEDriverServer.exe");
	 
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	  driver.manage().window().maximize();
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
   }
}
