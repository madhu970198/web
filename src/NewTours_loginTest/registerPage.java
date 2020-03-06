package NewTours_loginTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class registerPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		
		  String url = "http://newtours.demoaut.com";
		  
		  System.setProperty("webdriver.chrome.driver","./driverfiles/chromedriver.exe");
		    
		  ChromeDriver driver = new ChromeDriver();
		  
		  driver.navigate().to(url);
		  
		  WebElement register = driver.findElement(By.partialLinkText("REGI"));
	
		  
		 register.click();
		 
		 
		 String registerWebPageTitle = driver.getTitle();
		 
		 System.out.println("the title of register webpage is:" +registerWebPageTitle);
		 

		   String ExpectedWebpageTitile = "mercuryTours";
		   
		   System.out.println("the bingHomePageTitle:" +ExpectedWebpageTitile);
		   
		   String ActualWebPageTitle = driver.getTitle();
		   
		   
		   if (ActualWebPageTitle.contains(ExpectedWebpageTitile))
			   
		   {
			   
			   System.out.println("WebPageatitle-pass");
		   }
			   
		   else
			   
			   System.out.println("WEPageTitle-failed");
		   
		   
		   driver.quit();
		   
		   
		   
	}
	

}
