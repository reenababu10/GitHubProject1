package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ScreenShot {
     public static void main(String[]args) throws InterruptedException {
    	 
    	 System.setProperty("Webdriver.chrome.driver",
    			 "C:\\Users\\Ammu\\eclipse-workspace\\Selenium1\\Chrome111\\chromedriver.exe");
    	 
    	
    	 ChromeOptions opts = new ChromeOptions();
    	 opts.addArguments("--remote-allow-origins=*");
    	 WebDriver driver = new ChromeDriver(opts);
    	 driver.get("https://www.moneycontrol.com/");
    	 driver.manage().window().maximize();
    	 
    	 Thread.sleep(1000);
    	 
    	 WebElement markets =driver.findElement(By.xpath("//a[@title='Markets']"));
    	 Actions actions = new Actions(driver);
    	 actions.contextClick(markets).click();
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
     }
}
