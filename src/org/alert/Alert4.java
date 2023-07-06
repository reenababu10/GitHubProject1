package org.alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Alert4 {
    public static void main(String[]args) throws InterruptedException {
    	
    	System.setProperty("Webdriver.chrome.driver",
    			"C:\\Users\\Ammu\\eclipse-workspace\\Selenium1\\Chrome111\\chromedriver.exe");
    	ChromeOptions opts = new ChromeOptions();
    	opts.addArguments("--remove-allow-origins=*");
    	WebDriver driver = new ChromeDriver(opts);
    	driver.get(" https://netbanking.hdfcbank.com/netbanking/");
    	driver.manage().window().maximize();
    	
    	driver.switchTo().frame("login_page");
    	
    	Thread.sleep(1000);
    	WebElement tab1 = driver.findElement(By.xpath("//div[@class='lablefield ibvt']"));
    	tab1.click();
    	Thread.sleep(1000);
    	WebElement btn1 = driver.findElement(By.xpath("//input[@type='text']"));
    	btn1.click();
    	btn1.sendKeys("reena");

    	WebElement tab2 = driver.findElement(By.xpath("//a[text()='CONTINUE']"));
    	tab2.click();
    	
    //	driver.switchTo().frame("");
    	
    //	Thread.sleep(1000);
    //	WebElement tab3 = driver.findElement(By.xpath("//div[@class='lablefield ibvt']"));
    //	tab3.click();
    	//Thread.sleep(1000);
    //	WebElement btn3 = driver.findElement(By.xpath("//input[@type='text']"));
    //	btn3.click();
    //	btn3.sendKeys("reena@2710");

    	
    	
    }
}
