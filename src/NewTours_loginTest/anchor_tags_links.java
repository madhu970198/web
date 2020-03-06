package NewTours_loginTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class anchor_tags_links {
	
	
	public static void main (String[] args){
		
		
		String Url = "http://newtours.demoaut.com";
		System.setProperty("webdriver.chrome.driver","./driverfiles/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.navigate().to(Url);
		
		List<WebElement> links =  driver.findElements(By.tagName("a"));
		
		 int linksCount = links.size();
		 
		 System.out.println("the totla number of links on the newtours LoginPage:" +linksCount);
		
	        for (int i=0;i<linksCount;i++)
	        {
	        	
	        	String linkname = links.get(i).getText();
	        	
	        	System.out.println(i+ " " +linkname);
	        	
	        }
		
	        
	        driver.quit();
	}

}
