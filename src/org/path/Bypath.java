package org.path;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Bypath {
      public static void main(String[] args) {
    	  
    	  System.setProperty("Webdriver.chrome.driver",
    			  "C:\\Users\\Ammu\\eclipse-workspace\\Selenium1\\Chrome111\\chromedriver.exe");
    	  
    	  ChromeOptions opts = new ChromeOptions();
    	  opts.addArguments("--remove-allows-origins=*");
    	  
    	  
    	  WebDriver driver = new ChromeDriver(opts);
    	  
    	  driver.get(" https://www.facebook.com/");
    	  driver.manage().window().maximize();		
    	  
    	  WebElement userName = driver.findElement(By.xpath("//input[@id='email']"));
    	      userName.sendKeys("hello");
    	  
    	  WebElement passWord = driver.findElement(By.xpath("//input[@name='pass']"));
    	      passWord.sendKeys("hello@3455");
    	  
    	  WebElement loginBtn = driver.findElement(By.xpath("//button[@name='login']"));
    	      loginBtn.click();
    	  
    	  
      }
}
