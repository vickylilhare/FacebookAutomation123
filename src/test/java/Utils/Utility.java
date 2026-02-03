package Utils;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {

	
	
	


	public static void captureScreenShot(WebDriver driver) throws InterruptedException, IOException{
		 for(int i = 1; i<10; i++)
			{
	    	  Date d = new Date();
	          String FileName = d.toString().replace(":", "_");//.replace(" ", "_") ;

	           TakesScreenshot ts = ( TakesScreenshot)driver;
	 
              File src = ts.getScreenshotAs(OutputType.FILE);
              File dest = new File("C:\\Users\\vicky\\OneDrive\\Pictures\\seleniumss\\test"+ FileName +"jpg");
	           FileHandler.copy(src, dest); 
	           Thread.sleep(2000);
	           
		}
	      
			
	}
	
	
	
	
		
	
}

	
	
	
	
	
	

