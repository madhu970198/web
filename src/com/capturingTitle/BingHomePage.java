package com.capturingTitle;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class BingHomePage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String url = "http://bing.com";
		
		System.setProperty("webdriver.chrome.driver","./driverfiles/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();		
		driver.navigate().to(url);
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  
		  String Expected_BingHomePageTitle = "bing";
		  
	               System.out.println("the Title of the BingHomePage title is:" +Expected_BingHomePageTitle);
		  
		      String Actual_bingHomePageTitle = driver.getTitle();
		      
		      System.out.println("the title of the binghome page title is:" +Actual_bingHomePageTitle);
		      
		      if (Actual_bingHomePageTitle.equals(Expected_BingHomePageTitle))
		    	  
		      {
		    	  
		    	  System.out.println("title matched = pass");
		      }
		      
		      
		      else
		    	  
		    	  
		      {
		    	  
		  
		    	  System.out.println("title is not match = fail");
		      
		    	  
		      }
		      
		      driver.quit();
		      
	}

}
