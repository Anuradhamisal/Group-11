package maven1package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import pages.Loginpage;

public class Testclass1 {
	public static void main (String[] args) {
		 System.setProperty("webdriver.chrome.driver", "F:\\\\Testing class 2023\\\\chromedriver-win64\\\\chromedriver.exe");
		// if code having any driver problem -driver related issue
		ChromeOptions options = new ChromeOptions(); 
		options.addArguments("--remove-allow-origins=*");
	    WebDriver driver = new ChromeDriver();
		
	    driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//1.POM class object created
		//2.POM class non Static variables declared / WebElement declared
		//3.Constructor code Execute-Initialization of variable / Initialization(find) of WebElement
		
		Loginpage loginpage =new Loginpage (driver);
		loginpage.sendUserName();
		loginpage.sendpassword();	
		loginpage.clickOnLoginPage();
		
	}

}
