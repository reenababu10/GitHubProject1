package org.scl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DayOne {
     public static void main(String[] args) {
    	 
    	System.setProperty("Webdriver.chrome.driver",
    			"C:\\Users\\Ammu\\eclipse-workspace\\Selenium1\\Chrome111\\chromedriver.exe"); 
    	 
    	ChromeOptions opts = new ChromeOptions();
    	opts.addArguments("--remove--allow-origins=*");
    	 
    	WebDriver driver = new ChromeDriver(opts); 
    	 
    	driver.get("https://www.facebook.com/"); 
    	driver.manage().window().maximize(); 
    //	String title = driver.getTitle();
    //	  System.out.println(title);
    	 
    	 // 	String currentUrl = driver.getCurrentUrl(); 
    	 //	  System.out.println(currentUrl);
    	 
    	 //	WebElement userName = driver.findElement(By.id("email"));
    	 //  userName.sendKeys("bala"); 
    	   
    	 //  WebElement passWord = driver.findElement(By.id("pass"));
    	 //  passWord.sendKeys("bala@123");
    	   
    	 //	WebElement loginBtn = driver.findElement(By.name("login"));   
    	 //   loginBtn.click();
    	   
    	 	WebElement userName =   driver.findElement(By.xpath("//input[@id='email']"));
    	 			userName.sendKeys("hello");
    	 			
    	 	WebElement passWord = driver.findElement(By.xpath("//input[@name='pass']"))	;	
    	 			passWord.sendKeys("hello@123");
    	 
    	 	WebElement loginBtn = driver.findElement(By.xpath("//input[@name='login']"));		
    	 			loginBtn.click();
     }
}
