package NewTours_loginTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String url = "http://newtours.demoaut.com";
		  System.setProperty("webdriver.chrome.driver","./driverfiles/chromedriver.exe");
		    
		  ChromeDriver driver = new ChromeDriver();
		  
		  driver.navigate().to(url);
		  //<input type="text" name="userName" size="10">;
		  
		  WebElement cd = driver.findElement(By.name("username"));
		  cd.sendKeys("tutorial");
		  
		  
		  WebElement dv = driver.findElement(By.name("password"));
		  dv.sendKeys("tutorial");
		  
		  WebElement signin = driver.findElement(By.name("Login"));
		 
		  signin.click();
		  
		  String actual_title = driver.getTitle();
		  
		  System.out.println("the actual title:" +actual_title);
		  
		  
		  
	}

}
