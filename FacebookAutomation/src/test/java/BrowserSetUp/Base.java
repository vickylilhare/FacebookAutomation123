package BrowserSetUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {

	 //static ChromeDriver driver;
	
	public static WebDriver openchrombrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vicky\\OneDrive\\Documents\\chrome driver\\chromedriver-win32 (1)\\chromedriver-win32\\chromedriver.exe");

		ChromeOptions ops =new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
	 
		WebDriver driver = new ChromeDriver(ops);
		 return driver;
	}
	
	public static WebDriver openfirebox()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\vicky\\selenium library\\geckodriver-v0.32.2-win32\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		return driver;
	}
	
	public static WebDriver openedge()
	{
		System.setProperty("webdriver.edge.driver", "C:\\vicky\\selenium library\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		return driver;
	}
	
	
	
	
	
}
