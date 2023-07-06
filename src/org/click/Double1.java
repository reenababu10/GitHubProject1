package org.click;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Double1 {
     public static void main(String[] args) throws InterruptedException {
    	 
    	 System.setProperty("Webdriver.chrome.driver", 
    			 "C:\\Users\\Ammu\\eclipse-workspace\\Selenium1\\Chrome113\\chromedriver.exe");
    	 ChromeOptions opts = new ChromeOptions();
    	 opts.addArguments("--remove-allow-origins=*");
    	 WebDriver driver = new ChromeDriver(opts);
    	 driver.get("http://greenstech.in/selenium-course-content.html");
    	 driver.manage().window().maximize();
    	 
    	 Thread.sleep(1000);
    	 Actions actions = new Actions(driver);
    	 WebElement interview = driver.findElement(By.xpath("//h2[@class='title mb-0 center']"));
    	 actions.contextClick(interview).perform();
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
     }
}
