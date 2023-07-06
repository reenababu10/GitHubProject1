package org.mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MouseProg7 {
     public static void main(String[] args) throws InterruptedException {
	 
	    System.setProperty("Webdriver.chrome.driver",
			 "C:\\Users\\Ammu\\eclipse-workspace\\Selenium1\\Chrome111\\chromedriver.exe");
	    ChromeOptions opts = new ChromeOptions();
	    opts.addArguments("--remove-allow-origins=*");
	    WebDriver driver = new ChromeDriver(opts);
	    driver.get("http://greenstech.in/selenium-course-content.html");
	    driver.manage().window().maximize();
	    
	    Thread.sleep(1000);
	    
	    WebElement courses = driver.findElement(By.xpath("//div[text()='Courses ']"));
	    Actions actions = new Actions(driver);
	    actions.moveToElement(courses).perform();
	 
        Thread.sleep(1000);
	    
	    WebElement data = driver.findElement(By.xpath("//span[text()='Data Warehousing (5)']"));
	    Actions actions1 = new Actions(driver);
	    actions1.moveToElement(data).perform();
	 
        Thread.sleep(1000);
	    
	    WebElement training = driver.findElement(By.xpath("//span[text()='DataStage Certification Training']"));
	    Actions actions2 = new Actions(driver);
	    actions2.moveToElement(training).perform();
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
 }
}
