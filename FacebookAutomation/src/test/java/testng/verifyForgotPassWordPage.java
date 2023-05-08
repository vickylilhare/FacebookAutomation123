package testng;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Utils.Utility;
import page.ForgotPassPage;
import page.LoginPage;

public class verifyForgotPassWordPage {
	WebDriver driver;
	LoginPage loginPage;
	ForgotPassPage forgotPassPage;
	static ExtentTest test;
	static ExtentHtmlReporter reporter;
	
	

@Parameters("browser")
@BeforeTest
public void operaBrowse(String browserName) {
	
	reporter = new ExtentHtmlReporter("test-output/ExtendReport/Extent.html");
	ExtentReports extend = new ExtentReports();
	extend.attachReporter(reporter);
	
	System.out.println("Before test");
	if(browserName.equals("Chrome"))
	{
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\vicky\\selenium library\\chromedriver_win32\\chromedriver.exe");
				       
				ChromeOptions ops =new ChromeOptions();
				ops.addArguments("--remote-allow-origins=*");
			 
				 driver = new ChromeDriver(ops);
    }
	if(browserName.equals("Firefox"))
	{

		System.setProperty("webdriver.gecko.driver", "C:\\vicky\\selenium library\\geckodriver-v0.32.2-win32\\geckodriver.exe");
		driver = new FirefoxDriver();
		 
    }
	
	if(browserName.equals("Edge"))
	{

		System.setProperty("webdriver.edge.driver", "C:\\vicky\\selenium library\\edgedriver_win64\\msedgedriver.exe");
		driver = new EdgeDriver();
		 
    }
	
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));

	
	
}
	

	
@BeforeClass
public void beforeclass() {
	System.out.println("before class");

	
	
}
	
@BeforeMethod
public void beforeMethod() {
	System.out.println("before method");
	driver.get("https://www.facebook.com");
     loginPage = new LoginPage(driver);
     loginPage.forgotUserPass();
	 forgotPassPage = new ForgotPassPage(driver);


}

@Test
public void test1() throws InterruptedException, IOException {
	System.out.println("test1");
	 forgotPassPage.cancelButtonClick();
	 String expectedURL = "https://www.facebook.com/login.php";
	 String expectedTitle = "Log in to Facebook";
	 String actualURL = driver.getCurrentUrl();
	 String ActualTitle = driver.getTitle();
	 Thread.sleep(5000);
	
	 Thread.sleep(5000);
	 
	 if(expectedURL.equals(actualURL) && expectedTitle.equals(ActualTitle))
	 {
		 System.out.println("passed");
	 }
	 else
	 {
		 System.out.println("failed");
		 
	 }
	 
	 
}


@Test
public void test2() {
	System.out.println("test2");
	
	String actualMsz = forgotPassPage.getTextMessage();
	String expectedMsz = "Please enter your email address or mobile number to search for your account.";
			if(actualMsz.equals(expectedMsz))
			{
				System.out.println("passes");
			}
			else
			{
				System.out.println("passes");
			}
				
}

@Test
public void test3() {
	System.out.println("test3");
	forgotPassPage.sendemailPhone();
	forgotPassPage.searchButtonclick();
	String actualresult = driver.getCurrentUrl();
	String expectedresult ="https://www.facebook.com/login/identify/?ctx=recover&ars=facebook_login&from_login_screen=0";
	Assert.assertEquals(actualresult,  expectedresult);
	
}


	
@AfterMethod
public void afterMethod() {
	System.out.println("aftermethod");
}

@AfterClass
public void afterclass() {
	System.out.println("afterclass");
	loginPage = null;
	forgotPassPage = null;
}
	
@AfterTest
public void afterTest() {
	System.out.println("after test class");
	driver.quit();
	driver = null;
	System.gc();
}
	
	
@AfterSuite
public void aftersuite() {
	System.out.println("after suite testclass");
}
	
	
	
	
	
		
	
}
