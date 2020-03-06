package com.mouseOperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_hellosignin_mouseOvereperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String url = "http://amazon.com";
		
		WebDriver driver = null;
		
		System.setProperty("webdriver.chrome.driver","./driverfiles/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.navigate().to(url);
		
		/*<a href="https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&amp;openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_ya_signin&amp;openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&amp;openid.assoc_handle=usflex&amp;openid.mode=checkid_setup&amp;openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&amp;openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&amp;" class="nav-a nav-a-2" data-nav-ref="nav_ya_signin" data-nav-role="signin" data-ux-jq-mouseenter="true" id="nav-link-accountList" tabindex="22">
		  <span class="nav-line-1">Hello, Sign in</span>
		  <span class="nav-line-2 ">Account &amp; Lists<span class="nav-icon nav-arrow" style="visibility: visible;"></span>
		  </span>
		  <span class="nav-line-3">Sign in</span>
		  <span class="nav-line-4">Account &amp; Lists</span>
		</a>
		*/
		WebElement helloSignIn = driver.findElement(By.id("nav-link-accountList"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(helloSignIn).perform();
		
		WebElement yourOrders = driver.findElement(By.linkText("Your Orders"));
		
		yourOrders.click();
		
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("madhu.abhi118@gmail.com");
		
		WebElement conti = driver.findElement(By.id("continue"));
		
		conti.click();
		
		WebElement pass = driver.findElement(By.name("password"));
		
		pass.sendKeys("9701983499");
		
		WebElement signin = driver.findElement(By.id("signInSubmit"));

		 signin.click();
		 
		 String expectedtaxt = driver.getCurrentUrl();
		 
		 
		driver.quit();
		
		
		
		
		
		
		
	}

}
