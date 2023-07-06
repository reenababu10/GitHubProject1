package org.alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Alert5 {
     public static void main(String[] args) throws InterruptedException {
    	 
    	 System.setProperty("Webdriver.chrome.driver",
    			 "C:\\Users\\Ammu\\eclipse-workspace\\Selenium1\\Chrome111\\chromedriver.exe");
    	 
    	 ChromeOptions opts = new ChromeOptions();
    	 opts.addArguments("--remove=-allow-origins=*");
    	 WebDriver driver = new ChromeDriver(opts);
    	 driver.get(" https://infinity.icicibank.com/corp/AuthenticationController?"
    	 		+ "FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION."
    	 		+ "LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI\r\n" );
    	 	
    	 driver.manage().window().maximize();
    	 
    	 Thread.sleep(1000);
    	 driver.switchTo().frame("google_cookie_match_frame");
    	 WebElement userId = driver.findElement(By.xpath(""));
    	 userId.sendKeys("");
    	 
    	 
     }
}
