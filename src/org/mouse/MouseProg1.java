package org.mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MouseProg1 {
	public static void main(String[] args) throws InterruptedException {
  	  
  	  System.setProperty("Webdriver.chrome.driver",
  			  "C:\\Users\\Ammu\\eclipse-workspace\\Selenium1\\Chrome111\\chromedriver.exe");
  	 
  	  ChromeOptions opts = new ChromeOptions();
  	  opts.addArguments("--remove-allow-origins=*");
  	  Thread.sleep(1000);
  	  WebDriver driver = new ChromeDriver(opts);
  	  driver.get(" http://www.amazon.in ");
  	  driver.manage().window().maximize();
  	  
  	  WebElement prime = driver.findElement(By.xpath("//span [text()='Prime']"));
  	  
  	  Actions actions = new Actions(driver);
  	  actions.moveToElement(prime).perform();
  	  
	}  
  	  
  	  
}
