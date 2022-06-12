package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Login {
	
	WebDriver driver;
	
	//All required WebElements:
	@FindBy(id="email")
	WebElement userNameField;
	
	@FindBy(id="pass")
	WebElement passwordField;
	
	@FindBy(xpath = "//button[@name='login']")
	WebElement loginButton;
	
	/////////////////////////////////////////////////////////////////////////////
	
	public Login(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//All Methods to operate on WebElements:
	public void loginWithCred(String userName, String password)
	{
		//driver.findElement(By.id("email")).sendKeys(userName);
		userNameField.sendKeys(userName);
		
		//driver.findElement(By.id("pass")).sendKeys(password);
		passwordField.sendKeys(password);
		
		
		loginButton.click();
		
	}

}
