package org.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LocatorProg {
     public static void main(String[] args) {
    	 
    	 System.setProperty("Webdriver.chrome.driver",
    			 "C:\\Users\\Ammu\\eclipse-workspace\\Selenium1\\Chrome113\\chromedriver.exe");
    	 ChromeOptions opts = new ChromeOptions();
    	 opts.addArguments("--remove-allow-origins=*");
    	 
    	 WebDriver driver = new ChromeDriver(opts);
    	 driver.get("https://www.facebook.com/");  
    	 driver.manage().window().maximize();
    	 
    //	 WebElement fbText = driver.findElement(By.xpath("//h2[text()='Facebook helps you connect and"
    //	 		+ " share with the people in your life']"));
    	 
    //	 String text = fbText.getText();
    //	   System.out.println(text);
    	 
    	 WebElement username = driver.findElement(By.id("email"));
    	    username.sendKeys("bala");
    	 
    	 String attribute = username.getAttribute("value");
    	    System.out.println(attribute);
    	 
    	
     }
}
