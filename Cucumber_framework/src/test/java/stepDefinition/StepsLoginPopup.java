package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.en.*;
import pages.LoginPopUp_PF;

public class StepsLoginPopup  {
	
	

	WebDriver driver = null ;
	LoginPopUp_PF loginPopUp ;
	
	
	

	
	@Given("Navigate to MMT Homepage")
	public void navigate_to_mmt_homepage() {
	
		driver = new ChromeDriver() ;
		driver.manage().window().maximize();	
		
		
	driver.get("https://www.makemytrip.com/");
	
	
	
	}
	
	@And("Login Popup Appears")
	public void login_popup_appears() {
	
	loginPopUp = new LoginPopUp_PF(driver) ;
	
	System.out.println("Login Window is Open :" +loginPopUp.login_popup() );
	
	
	}
	@Then("Check for Mobile Number Field")
	public void check_for_mobile_number_field() {

		loginPopUp = new LoginPopUp_PF(driver) ;
		
		loginPopUp.field_Moblie_No() ;
	
	
	}

	
	@After
	@And("close Login Popup")
	public void close_login_popup() {
		
		System.out.println("--Closing the Browser--");

		driver.close();
		driver.quit();
	
	}


	
	
	
}
