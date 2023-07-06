package org.mouseprog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MouseProg9 {
     public static void main(String[]args) throws InterruptedException {
    	 
    	 System.setProperty("Webdriver.chrome.driver",
    			 "C:\\Users\\Ammu\\eclipse-workspace\\Selenium1\\Chrome111\\chromedriver.exe");
    	 ChromeOptions opts = new  ChromeOptions();
    	 opts.addArguments("--remove-allow-origins=*");
    	 WebDriver driver = new ChromeDriver(opts);
    	 driver.get("https://www.snapdeal.com");
    	 driver.manage().window().maximize();		
    	 
    	 Thread.sleep(1000);
    	 
    	 WebElement moblies = driver.findElement(By.xpath("//span[text()='Mobile & Accessories']"));
    	 Actions actions = new Actions(driver);
    	 actions.moveToElement(moblies).perform();
    	 
         Thread.sleep(1000);
    	 
    	 WebElement backCovers = driver.findElement(By.xpath("//span[text()='Printed Back Covers']"));
    	 Actions actions1 = new Actions(driver);
    	 actions1.moveToElement(backCovers).perform();
    	 
    	
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
     }
}
