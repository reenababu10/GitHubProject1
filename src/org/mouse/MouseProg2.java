package org.mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MouseProg2 {
     public static void main(String[] args) throws InterruptedException {
    	 
    	 System.setProperty("Webdriver.chrome.driver",
    			 "C:\\Users\\Ammu\\eclipse-workspace\\Selenium1\\Chrome111\\chromedriver.exe");
    	 ChromeOptions opts = new ChromeOptions();
    	 opts.addArguments("--remove-allow-origins=*");
    	 WebDriver driver = new ChromeDriver(opts);
    	 driver.get("http://www.flipkart.com");
    	 driver.manage().window().maximize();
    	 Thread.sleep(1000);
    	 
    	 WebElement home = driver.findElement(By.xpath("//div[text()='Home']"));
    	 Actions actions = new Actions(driver);
    	 actions.moveToElement(home).perform();
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
     }
}
