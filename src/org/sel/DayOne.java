package org.sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DayOne {
      public static void main(String[] args) {
    	  
    	 System.setProperty("Webdriver.chrome.driver",
    			 "C:\\Users\\Ammu\\eclipse-workspace\\Selenium1\\Chrome111\\chromedriver.exe"); 
    	  
    	 ChromeOptions opts = new ChromeOptions();
    	 opts.addArguments("--remove--allow-origins=*"); 
    	  
    	 WebDriver driver = new ChromeDriver(opts); 
    	  
    	 driver.get("http://www.greenstechnologys.com/"); 
    	  
    	  
    	  
    	  
      }
}
