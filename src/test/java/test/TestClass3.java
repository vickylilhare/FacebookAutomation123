package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import page.ForgotPassPage;
import page.LoginPage;

public class TestClass3 {

	
	
	
	
	public static void main(String[] args) {
		
		

		System.setProperty("webdriver.chrome.driver", "C:\\vicky\\selenium library\\chromedriver_win32\\chromedriver.exe");
		
		ChromeOptions ops =new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
	 
		WebDriver driver = new ChromeDriver(ops);
		
	      driver.get("https://www.facebook.com");
	      
	      LoginPage loginPage = new LoginPage(driver);
	      loginPage.forgotUserPass();
		
		
		ForgotPassPage forgotPassPage = new ForgotPassPage(driver);
		forgotPassPage.getTextMessage();
		//forgotPassPage.sendemailPhone();
		//forgotPassPage.searchButtonclick();
		//forgotPassPage.cancelButtonClick();
		
	
		
		
	}
	
	
	
	
	
}
