package org.loc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Locators9 {
     public static void main(String[] args) {
    	 
    	
    	System.setProperty("Webdriver.chrome.driver", 
    		          "C:\\Users\\Ammu\\eclipse-workspace\\Selenium1\\Chrome111\\chromedriver.exe");
    	
    	ChromeOptions opts = new ChromeOptions ();
    	opts.addArguments("--remove--allows-origins=*");
    	
    	
    	WebDriver driver = new ChromeDriver(opts);
    	
    	driver.get(" http://adactinhotelapp.com/");
    	
    	String title = driver.getTitle();
    	  System.out.println(title);
    	
    	String currentUrl = driver.getCurrentUrl();
    	  System.out.println(currentUrl);
    	
   	    WebElement userName = driver.findElement(By.id("email"));
   	      userName.sendKeys("karthikeyan");
   	    
   	    WebElement passWord = driver.findElement(By.id("pass")); 
   	      passWord.sendKeys("karthikeyan@123");
   	    
   	   WebElement loginBtn = driver.findElement(By.name("login")) ;
   	      loginBtn.click();
   	    
   	    
    }	
    	
}
