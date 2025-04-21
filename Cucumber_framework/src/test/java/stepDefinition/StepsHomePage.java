package stepDefinition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import pages.HomePage_PF;

public class StepsHomePage {
	
	WebDriver driver = null ;
	HomePage_PF homePage ;
	
	@Then("check Menu Items")
	public void check_menu_items() {

	homePage = new HomePage_PF(driver) ;
	
	homePage.getMenuItems();
		
	}

	
	

}
