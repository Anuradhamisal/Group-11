package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
  
	//variable -private
	@FindBy (xpath ="// input[@id='email'][1]")
    private WebElement username;
	
	@FindBy (xpath ="//input[@type='password'][1]")
    private WebElement password;
	
	@FindBy (xpath ="//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy'][1]")
    private WebElement longinButton;
	
//	@FindBy (xpath ="//input[@type='password'][1]")
//    private WebElement forgetPasswordLink;
	
//	@FindBy (xpath ="//input[@type='password'][1]")
//  private WebElement createNewAccountButton;
	
	
	//Constructor- public
	
	public Loginpage(WebDriver driver)
	{
	// To Find Element
	PageFactory.initElements(driver, this);
	
	}
	
	//Method -public
	
	public void sendUserName() {
		username.sendKeys("anuradhamisal17@gmail.com");
	}
	
	public void sendpassword() {
		password.sendKeys("Anuradha@2911");
	}
	
	public void clickOnLoginPage() {
		longinButton.click();
	}
	 
//	public void signIn() {
//		username.sendKeys("anuradhamisal17@gmail.com");
//		password.sendKeys("Anuradha@2911");
//		longinButton.click();
//	}
	
	
	
	
	
	
	
	
	
}
