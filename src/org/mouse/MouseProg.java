package org.mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MouseProg {
      public static void main(String[] args) throws InterruptedException {
    	  
    	  System.setProperty("Webdriver.chrome.driver",
    			  "C:\\Users\\Ammu\\eclipse-workspace\\Selenium1\\Chrome111\\chromedriver.exe");
    	  
    	  ChromeOptions opts = new ChromeOptions();
    	  opts.addArguments("--remove-allow-origins=*");
    	  
    	  WebDriver driver = new ChromeDriver(opts);
    	  driver.get("http://demo.guru99.com/test/drag_drop.html ");
    	  driver.manage().window().maximize();
    	   
    	   
    	  Thread.sleep(1000);
    	  
    	  WebElement source1 = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
    	  
    	  WebElement destination1 = driver.findElement(By.id("5000"));
    	  
    	  Actions actions1 = new Actions(driver);
    	  
    	  actions1.dragAndDrop(source1, destination1).perform();
    	  
    	  
    //	  WebElement source2 = driver.findElement(By.xpath("//a[text()=' SALES ']"));
    	  
    	 // WebElement destination2 = driver.findElement(By.id("Sales"));
    //	  
     //     Actions actions2 = new Actions(driver);
    	  
    //	  actions2.dragAndDrop(source2, destination2).perform();
    	   
    	  
    	  
    	  
      }
}
