package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import page.CreateAcc;
import page.LoginPage;

public class TestClass2 {

	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\vicky\\selenium library\\chromedriver_win32\\chromedriver.exe");
	
	ChromeOptions ops =new ChromeOptions();
	ops.addArguments("--remote-allow-origins=*");
 
	WebDriver driver = new ChromeDriver(ops);
	
      driver.get("https://www.facebook.com");
     
      LoginPage loginPage = new LoginPage(driver);
      loginPage.creatUserAcc();
      Thread.sleep(3000);
      
      CreateAcc creatAcc = new CreateAcc(driver);

      creatAcc.sendSurname();
      creatAcc.selectDay();
      
     
	
	
	}	
	
	
	
	
	
	
}
