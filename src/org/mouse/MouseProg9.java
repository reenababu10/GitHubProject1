package org.mouse;

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
    	 ChromeOptions opts = new ChromeOptions();
    	 opts.addArguments("--remove-allow-origins=*");
    	 WebDriver driver = new ChromeDriver(opts);
    	 driver.get("https://www.homedepot.com/");
    	 driver.manage().window().maximize();
    	 
    	Thread.sleep(1000);
    	 
    	 WebElement dept = driver.findElement(By.xpath("//a[text()='All Departments']"));
    	Actions actions = new Actions(driver);
    	actions.moveToElement(dept).perform();
    	 
        Thread.sleep(1000);
    	 
    	 WebElement paint = driver.findElement(By.xpath("//a[text()='Paint']"));
    	 Actions actions1 = new Actions(driver);
    	 actions1.moveToElement(paint).perform();
    	 
         Thread.sleep(1000);
    	 
    	 WebElement interiorPaint = driver.findElement(By.xpath("//a[text()='Interior Paint']"));
    	 Actions actions2 = new Actions(driver);
    	 actions2.moveToElement(interiorPaint).perform();
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
     }
}
