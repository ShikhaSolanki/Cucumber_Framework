package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CommonMethods {
	
	WebDriver Driver ; 
	
	
	public CommonMethods(WebDriver driver) {
		this.Driver = driver ;
		PageFactory.initElements(driver, this);
		
	}
	
	public void open_Chrome_Browser() {
		
		System.out.println("--Open The Chrome Browser--");
		String projectPath = System.getProperty("user.dir") ;
		System.getProperty("Webdrive.chrome.driver", projectPath + "src/test/resources/drivers/chromedriver") ;

		
	}

}
