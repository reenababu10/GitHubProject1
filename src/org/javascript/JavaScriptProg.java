package org.javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class JavaScriptProg {
        public static void main(String[] args) {
        	
        	System.setProperty("Webdriver.chrome.driver",
        			"C:\\Users\\Ammu\\eclipse-workspace\\Selenium1\\Chrome111\\chromedriver.exe");
        	ChromeOptions opts = new ChromeOptions();
        	opts.addArguments("--remove-allow-origins=*");
        	WebDriver driver = new ChromeDriver(opts);  
        	driver.get("http://greenstech.in/selenium-course-content.html");
        	driver.manage().window().maximize();
        	
        	WebElement framework = driver.findElement(By.xpath("//h2[@class='mb-0']"));
        	
        	JavascriptExecutor executor = (JavascriptExecutor) driver;
     	    executor.executeScript("arguments[0].scrollIntoView(true)", framework);
     			  
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        }
}
