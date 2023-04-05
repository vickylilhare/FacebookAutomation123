package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	// variable declaration
	
	@FindBy (xpath = "//input[@id='email']") 
	private WebElement userName;
	
	
	@FindBy (xpath = "//input[@id='pass']") 
	private WebElement passWord;
	
		
	@FindBy (xpath = "//button[@type='submit']") 
	private WebElement submitButton;
	
	@FindBy (xpath = "//a[text()='Forgotten password?']") 
	private WebElement forgotPass;
	
	
	
	@FindBy (xpath = "//a[text()='Create new account']") 
	private WebElement createAcc;	
	
	//variable initialization
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	// variable use
	public void sendUserName() {
		userName.sendKeys("vicky@gmail.com");
	}
	
	public void sendPassword() {
		passWord.sendKeys("154644");
	}
	
	public void submitUserButton() {
		submitButton.click();
	}
	
	
	public void forgotUserPass() {
		forgotPass.click();
	}
	
	
     public void creatUserAcc() {
		createAcc.click();
	  }
	
	
	
	
	
	
	
	
	
}
