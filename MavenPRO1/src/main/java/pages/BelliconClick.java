package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BelliconClick {

	@FindBy (xpath ="//a[contains(@aria-label,'Notifications')]")
    private WebElement bellicon;
	
	@FindBy (xpath ="//span[text()=\\\"You might like \\\"][1]")
    private WebElement clickonnotification;
	
	@FindBy (xpath ="//div[@role='main']")
    private WebElement frameclick;
	
	
	//Constructor- public
	
		public BelliconClick(WebDriver driver)
		{
		// To Find Element
		PageFactory.initElements(driver, this);
		
		}
	
		//Method -public
		
     public void clickOnBellicon() {
    	 bellicon.click();
		}
		
     public void clickOnFirstNotification() {
    	 clickonnotification.click();
		}
	
     
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
