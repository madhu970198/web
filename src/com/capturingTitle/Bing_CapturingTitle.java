package com.capturingTitle;

import org.openqa.selenium.chrome.ChromeDriver;

public class Bing_CapturingTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String url = "http://bing.com";
		
		System.setProperty("webdriver.chrome.driver","./driverfiles/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.navigate().to(url);
		
		String actual_BingHomePageTitle = driver.getTitle();
		
		System.out.println("the title of the bing home is:" +actual_BingHomePageTitle);
		
		
		driver.quit();
		
	}
}
