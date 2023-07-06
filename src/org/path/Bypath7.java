package org.path;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Bypath7 {
    public static void main(String[] args) {
    	
    	System.setProperty("Webdriver.chrone.driver", 
    			"C:\\Users\\Ammu\\eclipse-workspace\\Selenium1\\Chrome111\\chromedriver.exe");
    	
    	ChromeOptions opts = new ChromeOptions();
    	opts.addArguments("--remove-allow-origins=*");
    	WebDriver driver = new ChromeDriver(opts);
    	driver.get("https://www.snapdeal.com/ ");
    	driver.manage().window().maximize();
    	
    	WebElement fashion = driver.findElement(By.xpath("//span[@class='catText']"));
    	String text = fashion.getText();
    	System.out.println(text);
    	
    	WebElement footwear = driver.findElement(By.xpath("//span[@class='headingText']"));
    	String text1 = footwear.getText();
    	System.out.println(text1);
    	
    	
    	
    }
}
