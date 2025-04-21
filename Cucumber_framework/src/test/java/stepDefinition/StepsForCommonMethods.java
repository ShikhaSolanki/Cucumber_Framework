package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import pages.CommonMethods;
import pages.LoginPopUp_PF;

public class StepsForCommonMethods {

	WebDriver driver = null ;
	LoginPopUp_PF loginPopUp ;
	CommonMethods common_Methods ;
	
	@Before
	@Given("Open Chrome browser")
	public void open_chrome_browser() {
		
		common_Methods = new CommonMethods(driver);
		
		
	}
	
	


	
	
	
	
	
	
	
}
