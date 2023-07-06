package org.javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class JavaScriptProg4 {
    public static void main(String[] args) throws InterruptedException {
    	
    	System.setProperty("Webdriver.chrome.driver", 
    			"C:\\Users\\Ammu\\eclipse-workspace\\Selenium1\\Chrome111");
    	ChromeOptions opts = new ChromeOptions();
    	opts.addArguments("--remove-allow-origins=*");
    	WebDriver driver = new ChromeDriver(opts);
    	driver.get("http://www.greenstechnologys.com/");
    	driver.manage().window().maximize();
    	
    	Thread.sleep(1000);
    	WebElement address = driver.findElement(By.xpath("//span[text()='Greens Technologies Porur']"));
    	JavascriptExecutor executor = (JavascriptExecutor) driver;
    	executor.executeScript("arguments[0].scrollIntoView(true)",address );
    	
    	Thread.sleep(1000);
    	WebElement address1 = driver.findElement(By.xpath("//span[text()='Greens Technologies Porur']"));
    	JavascriptExecutor executor1 = (JavascriptExecutor) driver;
    	executor1.executeScript("arguments[0].setAtribute('value','Greens Technologies Porur')", address1);
    	Object address11= executor.executeScript("return arguments[0].getAtribute('value')", address);
    	System.out.println(address11);
    	
    	
    	
    	
    	
    	
    	
    	
    	
    }
}
