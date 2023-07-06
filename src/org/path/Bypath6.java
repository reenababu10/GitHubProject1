package org.path;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Bypath6 {
   public static void main(String[] args) {
	   
	   System.setProperty("Webdriver.chrome.driver",
			  "C:\\Users\\Ammu\\eclipse-workspace\\Selenium1\\Chrome111\\chromedriver.exe"); 
	   ChromeOptions opts = new ChromeOptions(); 
	   opts.addArguments("--remove-allow-origins=*");
	   WebDriver driver = new ChromeDriver(opts);
	   driver.get("http://adactinhotelapp.com/");
	   driver.manage().window().maximize();
	   
	   WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
	   username.sendKeys("reena");
	   String attribute = username.getAttribute("value");
	   System.out.println(attribute);
	   
	   WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
	   password.sendKeys("reena@3553");
	   String attribute1=password.getAttribute("value");
	   System.out.println(attribute1);
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
   }
}
