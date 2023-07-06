package org.scroll;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ScrollProg1 {
      public static void main(String[] args) {
    	  
    	  System.setProperty("Webdriver.chrome.driver",
    			  "C:\\Users\\Ammu\\eclipse-workspace\\Selenium1\\Chrome111\\chromedriver.exe");
    	  
    	  ChromeOptions opts = new ChromeOptions();
    	  opts.addArguments("--remove-allow-origins=*");
    	  WebDriver driver = new ChromeDriver(opts);
    	  driver.get("http://toolsqa.com/");
    	  driver.manage().window().maximize();
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
      }
}
