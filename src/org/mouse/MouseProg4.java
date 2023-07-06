package org.mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MouseProg4 {
     public static void main(String[] args) throws InterruptedException {
    	 
    	 System.setProperty("Webdriver.chrome.driver",
    			 "C:\\Users\\Ammu\\eclipse-workspace\\Selenium1\\Chrome111\\chromedriver.exe");
    	 
    	 ChromeOptions opts = new ChromeOptions();
    	 opts.addArguments("--remove-allow-origins=*");
    	 WebDriver driver = new ChromeDriver(opts);
    	 driver.get("https://www.shopclues.com/wholesale.html ");
    	 driver.manage().window().maximize();
    	 
    	 Thread.sleep(1000);
    	 
    	 WebElement sports = driver.findElement(By.xpath("//a[text()='Sports & More']"));
    	 Actions actions = new Actions(driver);
    	 actions.moveToElement(sports).perform();
    	 
    	 Thread.sleep(1000);
    	 
    	 WebElement weight = driver.findElement(By.xpath("//a[text()='Weight Gainers']"));
    	 Actions actions1 = new Actions(driver);
    	 actions1.moveToElement(weight).perform();
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
     }
}
