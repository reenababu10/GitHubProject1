package org.scroll;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class ScrollProg {
       public static void main(String[] args) {
    	   
    	   System.setProperty("Webdriver.chrome.driver", 
    			   "C:\\Users\\Ammu\\eclipse-workspace\\Selenium1\\Chrome111\\chromedriver.exe");
    	   
    	   ChromeOptions opts = new ChromeOptions();
    	   opts.addArguments("--remove-allow-origins=*");
    	   WebDriver driver = new ChromeDriver(opts);
    	   driver.get(" http://toolsqa.com/");
    	   driver.manage().window().maximize();
    	   
    	   WebElement latestarticles = driver.findElement(By.xpath("//a[text()='Latest Articles']"));
    	   
    	   JavascriptExecutor executor = (JavascriptExecutor) driver;
    	   executor.executeScript("arguments[0].scrollIntoView(true)", latestarticles);
    			  
    	   
    	 
    	   
    	   
    	   
    	   
       }
}
