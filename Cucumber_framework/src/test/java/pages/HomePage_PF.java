package pages;

import java.util.List;

import org.junit.rules.Timeout;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_PF {
	
	WebDriver Driver ; 
	
	@FindBy(xpath="//nav/ul/li[contains(@class,'menu')]")
	List<WebElement> menu_items ;
	
	@FindBy(xpath = "//section[@class='modalMain tcnFooter']/span[@class='commonModal__close']")
	WebElement close_loginPopUp ;
	
	
	
	
	public HomePage_PF(WebDriver driver) {
		this.Driver = driver ;
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	
	
	public void getMenuItems () {
		
		Driver.manage().timeouts().implicitlyWait(10, Timeout.seconds(0)) ; 
		
		String menu = "" ;
		
		int i ; 
		
		for ( i = 0 ; i < menu_items.size() ; i++) {
			
			menu = menu_items.get(i).getText() ;
			System.out.println(menu);
		}
		
		
	}
	
	

}
