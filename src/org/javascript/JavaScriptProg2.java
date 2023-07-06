package org.javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class JavaScriptProg2 {
    public static void main(String[] args) {
    	
    	System.setProperty("Webdriver.chrome.driver",
    			"C:\\Users\\Ammu\\eclipse-workspace\\Selenium1\\Chrome111\\chromedriver.exe");
    	ChromeOptions opts = new ChromeOptions();
    	opts.addArguments("--remove-allow-origins=*");
    	WebDriver driver = new ChromeDriver(opts);
    	driver.get("http://adactinhotelapp.com/");
    	driver.manage().window().maximize();
    	
    	WebElement username = driver.findElement(By.id("username"));
    	JavascriptExecutor executor = (JavascriptExecutor) driver;
    	executor.executeScript("arguments[0].setAttribute('value','reena')", username);
    	Object name = executor.executeScript("return arguments[0].getAttribute('value')", username);
    	System.out.println(name);
    	
    	WebElement password = driver.findElement(By.id("password"));
    	JavascriptExecutor executor1 = (JavascriptExecutor) driver;
    	executor1.executeScript("arguments[0].setAttribute('value','reena@2710')", password);
    	Object pass = executor1.executeScript("return arguments[0].getAttribute('value')", password);
    	System.out.println(pass);
    	
    	WebElement lgBtn = driver.findElement(By.name("login"));
    	JavascriptExecutor executor2 = (JavascriptExecutor) driver;
    	executor2.executeScript("arguments[0].click()", lgBtn);
    	
    	
    	
    	
    }
}
