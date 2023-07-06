package org.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LocatorProg2 {
     public static void main(String[] args) {
    	 
    	 System.setProperty("Webdriver.chrome.driver", 
    			 "C:\\Users\\Ammu\\eclipse-workspace\\Selenium1\\Chrome111\\chromedriver.exe");
    	 
    	 ChromeOptions opts = new ChromeOptions();
    	 opts.addArguments("--remove-allow-origins=*");
    	 
    	 WebDriver driver = new ChromeDriver(opts);
    	 
    	 driver.get(" https://www.flipkart.com/ ");
    	 driver.manage().window().maximize();
    	 
    	 
    	 WebElement username = driver.findElement(By.id("email"));
    	    username.sendKeys("karthi");
    	 
    	 WebElement password = driver.findElement(By.id("pass"));
    	    password.sendKeys("karthi@1365");
    	 
    	 WebElement loginBtn = driver.findElement(By.name("login"));
    	    loginBtn.click();
    	 
    	 
    	 
    	 
    	 
     }
}
