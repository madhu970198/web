package com.automateBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserAutomation {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		
		WebDriver driver = null;
		
		String url = "http://www.google.com";
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SIR\\workspace\\selenium.basic\\driverfiles\\chromedriver.exe");
		
		ChromeDriver cd = new ChromeDriver();
		
		driver.navigate().to(url);
	
		

	}

}
