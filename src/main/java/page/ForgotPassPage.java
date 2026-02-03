package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPassPage {

	
	// variable declaration
	
		@FindBy (xpath = "//table//div") 
		private WebElement TextMessage;
		
		
		@FindBy (xpath = "//input[@id='identify_email']") 
		private WebElement emailPhone;
		
		@FindBy (xpath = "//a[text()='Cancel']") 
		private WebElement cancelButton;
		
		@FindBy (xpath = "//button[@id='did_submit']") 
		private WebElement searchButton;
		
		//div[@class='_9nq2 marginBottom16px']
		
		//variable initialization
		
		public ForgotPassPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		
		// variable use
		public String getTextMessage() {
		String text =	TextMessage.getText();
		return text;
		}
		
		public void sendemailPhone() {
			emailPhone.sendKeys("vickychamp71@gmail.com");
		}
		
		public void cancelButtonClick() {
			cancelButton.click();
		}
		
		
		public void searchButtonclick() {
			searchButton.click();
			
		}
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
