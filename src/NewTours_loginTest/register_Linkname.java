package NewTours_loginTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class register_Linkname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 
		 String url = "http://newtours.demoaut.com";
		 
		 System.setProperty("webdriver.chrome.driver","./driverfiles/chromedriver.exe");
		 
		 ChromeDriver driver = new ChromeDriver();
		  driver.navigate().to(url);
		  
		  driver.manage().window().maximize();
		  
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  
		  WebElement register = driver.findElement(By.linkText("REGISTER"));
		  
		  String linkname = register.getText();

		  System.out.println("the text of Element Register is:" +linkname);
		  
		  register.click();
		  
		  driver.quit();
		 
		 
		
	

	}

}
