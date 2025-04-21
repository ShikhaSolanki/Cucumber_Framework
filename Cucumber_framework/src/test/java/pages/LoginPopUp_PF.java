package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPopUp_PF {

	
	WebDriver Driver ; 
	
	@FindBy(xpath = "//section[@class='modalMain tcnFooter']")
	WebElement login_Popup ;
	
	@FindBy(xpath = "//div/input[@placeholder='Enter Mobile Number']")
	WebElement mobile_number ;
	
	
	public LoginPopUp_PF(WebDriver driver) {
		this.Driver = driver ;
		PageFactory.initElements(driver, this);
		
	}
	
	public boolean login_popup() {
		
		Driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS) ;
		
		boolean loginBlock = login_Popup.isDisplayed() ;
		
		return loginBlock ; 
	}
	
	public boolean field_Moblie_No() {
		
		boolean field_Mob = mobile_number.isDisplayed();
		
		if(field_Mob = true) {
			
			mobile_number.sendKeys("1234567890");
			
		}else {
			
			System.out.println("mobile number field is not visible");
			
		}
		
		return field_Mob ;
		
	}
	
	
}
