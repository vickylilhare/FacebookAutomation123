package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateAcc {

	
//	
//	@FindBy (xpath = "//input[@id='u_3_b_b1']") 
//	private WebElement FirstName;
//	
//	
	@FindBy (xpath = "//input[@aria-label='Surname']") 
	private WebElement SurName;
	
//	@FindBy (xpath = "//input[@id='u_3_g_is']") 
//	private WebElement EmailOrMobile;
//	
//	@FindBy (xpath = "//input[@id='password_step_input']") 
//	private WebElement NewPass;
//	
	
	@FindBy (xpath = "//select[@id='day']") 
	private WebElement Day;
	
//	@FindBy (xpath = "//select[@id='month']") 
//	private WebElement Month;
//	
//	
//	@FindBy (xpath = "//select[@id='year']") 
//	private WebElement Year;
//	
//
//	@FindBy (xpath = "//input[@id='u_3_4_u5']") 
//	private WebElement Female;
//	
//	@FindBy (xpath = "//input[@id='u_3_5_7Q']") 
//	private WebElement Male;
//	
//	@FindBy (xpath = "//input[@id='u_3_6_5l']") 
//	private WebElement Costom;
//	
	
	
	//variable initialization
	
	public CreateAcc(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	// variable use
//	public void sendFirstName() {
//	FirstName.sendKeys("vicky");
//	}
//	
	public void sendSurname() {
		SurName.sendKeys("lilhare");
	}
//	
//	public void SendEmailOrMobile() {
//		EmailOrMobile.sendKeys("vky@gmail.com");
//	}
//	
//	
//	public void SendNewPass() {
//		NewPass.sendKeys("vickylive");
//	}
	
//	
	public void selectDay() {
		Select s = new Select(Day);
		
   s.selectByIndex(4);
		
		
	}
	
	
//	public void selectMonth() {
//        Select s = new Select(Day);
//		 s.selectByIndex(4);
//		
//	}
//	
//	
//	public void selectYear() {
//    Select s = new Select(Day);
//		
//	    s.selectByIndex(4);
//	}
//	
//	
//	public void selectFemale() {
//		Female.click();
//	}
//	
//	
//	public void selectMale() {
//		Male.click();
//	}
//	
//	public void selectCostom() {
//		Costom.click();
//	}
//	
	
//	Select s = new Select(month);
//	
//    s.selectByIndex(4);
//	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
