package org.alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Alert3 {
    public static void main(String[] args) throws InterruptedException {
    	
    	System.setProperty("Webdriver.chrome.driver",
    			"C:\\Users\\Ammu\\eclipse-workspace\\Selenium1\\Chrome111\\chromedriver.exe");
    	ChromeOptions opts = new ChromeOptions();
    	opts.addArguments("--remove-allow-origins=*");
    	WebDriver driver = new ChromeDriver(opts);		
    	driver.get("http://demo.automationtesting.in/Alerts.html");
    	driver.manage().window().maximize();
    	
    	Thread.sleep(1000);
    	WebElement tab3 = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
    	tab3.click();
    	WebElement btn3 = driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']"));
    	btn3.click();
    	
    	Thread.sleep(1000);
    	String text = driver.switchTo().alert().getText();
    	System.out.println(text);
    	
    	Thread.sleep(1000);
    	driver.switchTo().alert().sendKeys("alertboxText");
    	driver.switchTo().alert().accept();
    }
}
