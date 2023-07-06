package org.dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DropAndDown4 {
	 public static void main(String[]args) throws InterruptedException {
	    	
	      System.setProperty("Webdriver.chrome.driver",
	    		"C:\\Users\\Ammu\\eclipse-workspace\\Selenium1\\Chrome113\\chromedriver.exe");	
	      ChromeOptions opts = new ChromeOptions();	
	      opts.addArguments("--remove-allow-origins=*"); 	
	     WebDriver driver = new ChromeDriver(opts);
	      driver.get("http://adactinhotelapp.com/");
	      driver.manage().window().maximize();
	      Thread.sleep(1000);
	      
	      Thread.sleep(1000);
		   WebElement userId = driver.findElement(By.xpath("//input[@id='username']"));
		   userId.sendKeys("vinothkumar22");
		   WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		   password.sendKeys("Vinoth@123");
		   WebElement loginBtn = driver.findElement(By.xpath("//input[@id='login']"));
		   loginBtn.click();
		   
	      WebElement room = driver.findElement(By.xpath("//select[@name='adult_room']"));
	      Select select = new Select(room);
	      
	      List<WebElement>options = select.getOptions();
	      for (WebElement a : options) {
			System.out.println(a.getText());
		}
	      
	 }   
	      
}
