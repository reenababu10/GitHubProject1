package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Locators1 {
        public static void main(String[] args) {
        	
        System.setProperty("Webdriver.chrome.driver", 
        		"C:\\Users\\Ammu\\eclipse-workspace\\Selenium1\\Chrome111\\chromedriver.exe"); 	
        ChromeOptions opts = new ChromeOptions();	
        opts.addArguments("--remove-allow-origins=*");	
        	
        WebDriver driver = new ChromeDriver(opts);	
        	
        driver.get(" https://www.redbus.in/" );
        			
        WebElement userName = driver.findElement(By.id("email"));	
        	userName.sendKeys("renu");
        	
        WebElement passWord = driver.findElement(By.id("pass"));	
        	passWord.sendKeys("renu@22");
        	
        WebElement loginBtn = driver.findElement(By.name("login"));
        	loginBtn.click();
        	
        }
}
