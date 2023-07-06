package org.path;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Bypath1 {
    public static void main(String[] args) {
    	
    	System.setProperty("Webdriver.chrome.driver",
    			"C:\\Users\\Ammu\\eclipse-workspace\\Selenium1\\Chrome111\\chromedriver.exe");
    	ChromeOptions opts = new ChromeOptions();
    	opts.addArguments("--remove-allow-origins=*");
    	WebDriver driver = new ChromeDriver(opts);
    	driver.get("http://www.greenstechnologys.com ");
    	driver.manage().window().maximize();
    	
    	WebElement text1 = driver.findElement(By.xpath("//span[@class='blue_text']"));
    	String text = text1.getText();
    	   System.out.println(text);
    	
    	
    	
    	
    }
}
