package org.path;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Bypath10 {
   public static void main(String[] args) {
	   
	   System.setProperty("Webdriver.chrome.driver",
			   "C:\\Users\\Ammu\\eclipse-workspace\\Selenium1\\Chrome111\\chromedriver.exe");
	   
	   ChromeOptions opts = new ChromeOptions();
	   opts.addArguments("--remove-allow-origins=*");
	   WebDriver driver = new ChromeDriver(opts);
	   driver.get("https://www.shopclues.com/wholesale.html ");
	   driver.manage().window().maximize();
	   
	   WebElement moblies = driver.findElement(By.xpath("//a[text()='Mobiles & More']"));
	   String text = moblies.getText();
	   System.out.println(text);
	
   }
}
