package org.dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DropAndDown1 {
     public static void main(String[]args) throws InterruptedException {
    	
      System.setProperty("Webdriver.chrome.driver",
    		"C:\\Users\\Ammu\\eclipse-workspace\\Selenium1\\Chrome113\\chromedriver.exe");	
      ChromeOptions opts = new ChromeOptions();	
      opts.addArguments("--remove-allow-origins=*"); 	
      WebDriver driver = new ChromeDriver(opts);
      driver.get("http://demo.guru99.com/test/newtours/register.php");
      driver.manage().window().maximize();
      Thread.sleep(1000);
    	
      WebElement country = driver.findElement(By.xpath("//select[@name='country']"));
      Select select = new Select(country);
      
      List<WebElement> options = select.getOptions();
    	
      for (WebElement a : options) {
		System.out.println(a.getAttribute("text"));
	}
    	
    	
    }
}
