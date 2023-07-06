package org.alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Alert2 {
   public static void main(String[]args) throws InterruptedException {
	   
	   System.setProperty("Webdriver.chrome.driver", 
			   "C:\\Users\\Ammu\\eclipse-workspace\\Selenium1\\Chrome111\\chromedriver.exe");
	   
	   ChromeOptions opts = new ChromeOptions();
	   opts.addArguments("--remove-allow-origins=*");
	   WebDriver driver = new ChromeDriver(opts); 
	   driver.get("http://demo.automationtesting.in/Alerts.html");
	   driver.manage().window().maximize();
	   
	   Thread.sleep(1000);
	   WebElement tab2 = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
	   tab2.click();
	   Thread.sleep(1000);
	   WebElement btn2 = driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
	   btn2.click();
	   driver.switchTo().alert().accept();
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
   }
}
