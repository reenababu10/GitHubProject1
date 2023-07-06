package org.mouseprog;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
    public static void main(String[] args) throws InterruptedException, AWTException {
    	
    	System.setProperty("Webdriver.chrome.driver",
    			"C:\\Users\\Ammu\\eclipse-workspace\\Selenium1\\Chrome111\\chromedriver.exe");
    	ChromeOptions opts = new ChromeOptions();
    	opts.addArguments("--remove-allow-origins=*");
    	WebDriver driver = new ChromeDriver(opts);
    	driver.get("https://www.google.co.in/webhp");
    	driver.manage().window().maximize();
    	
    	Thread.sleep(1000);
    	Actions actions = new Actions(driver);
    	WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
    	search.sendKeys("Velmurugan");
    	Thread.sleep(1000);
    	actions.doubleClick(search).perform();
    	
    	
    	
    	
    	
    	
    }
}
