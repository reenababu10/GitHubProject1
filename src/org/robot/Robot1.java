package org.robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Robot1 {
	   
	public static void main(String[] args) throws InterruptedException, AWTException {
	
		System.setProperty("Webdriver.chrome.driver",
				"C:\\Users\\Ammu\\eclipse-workspace\\Selenium1\\Chrome111\\chromedriver.exe");
		
		ChromeOptions opts = new ChromeOptions();
		opts.addArguments("--remove-allow-origins=*");
		WebDriver driver = new ChromeDriver(opts);
		driver.get(" https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		Robot robot = new Robot();
		
		 robot.keyPress(KeyEvent.VK_R);
		 robot.keyRelease(KeyEvent.VK_R);
		 robot.keyPress(KeyEvent.VK_E);
		 robot.keyRelease(KeyEvent.VK_E);
		 robot.keyPress(KeyEvent.VK_N);
		 robot.keyRelease(KeyEvent.VK_N);
		 robot.keyPress(KeyEvent.VK_A);
		 robot.keyRelease(KeyEvent.VK_A);
		 
		 Thread.sleep(1000);
		 robot.keyPress(KeyEvent.VK_TAB);
		 robot.keyRelease(KeyEvent.VK_TAB);
		 
		 robot.keyPress(KeyEvent.VK_CONTROL);
		 robot.keyPress(KeyEvent.VK_X);
		 robot.keyPress(KeyEvent.VK_CONTROL);
		 robot.keyRelease(KeyEvent.VK_X);
		 
		 Thread.sleep(1000);
		 robot.keyPress(KeyEvent.VK_TAB);
		 robot.keyRelease(KeyEvent.VK_TAB);
		 
		 
	}
	   
	   
}
