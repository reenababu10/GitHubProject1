package org.ie;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DayOne {
     public static void main(String[] args) {
    	 
    	 System.setProperty("Webdriver.chrome.driver",
    			 "C:\\Users\\Ammu\\eclipse-workspace\\Selenium1\\IE11\\IEDriverServer.exe");
    	 
    	 WebDriver driver = new ChromeDriver ();
    	 
    	 driver.get("http://www.greenstechnologys.com/");
    	 
    	 
     }
}
