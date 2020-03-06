import javax.swing.plaf.ActionMapUIResource;

import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_CapturingTheTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String url =" http:\\facebook.com";
	
	System.setProperty("webdriver.chrome.driver","./driverfiles/chromedriver.exe");
	
	ChromeDriver driver = new ChromeDriver();
	 
	driver.navigate().to(url);
	
	String Expected_facebookLoginPageUrl = "facebook.com";
	
	System.out.println("the expected facebook loginpage url:" +Expected_facebookLoginPageUrl);
	
	 String Actual_FacebookLoginPaageUrl =driver.getTitle();
		if (Actual_FacebookLoginPaageUrl.contains(Expected_facebookLoginPageUrl))
		{
			
			System.out.println("url matched pass");
			
			
		}
		else 
		{
			
			System.out.println("url not matched - fail");
			
		}
		
		driver.quit();
	}
	

}
