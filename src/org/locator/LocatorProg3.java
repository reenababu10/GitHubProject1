package org.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LocatorProg3 {
      public static void main(String[] args) throws InterruptedException {
    	  
    	  System.setProperty("Webdriver.chrome.driver", 
    			  "C:\\Users\\Ammu\\eclipse-workspace\\Selenium1\\Chrome111\\chromedriver.exe");
    	  
    	  ChromeOptions opts = new ChromeOptions();
    	  opts.addArguments("--remove-allow-origins=*");
    	  
    	  WebDriver driver = new ChromeDriver(opts);
    	  driver.get("http://www.greenstechnologys.com ");
    	  driver.manage().window().maximize();
    	  
    	  Thread.sleep(1000);
    	  WebElement centers = driver.findElement(By.xpath("//u[text()='Greens Technologys Software Training Centers in Chennai']")) ;
    	  
    	  String text = centers.getText();
    	      System.out.println(text);
    	  
    	
    	  
      }
}
