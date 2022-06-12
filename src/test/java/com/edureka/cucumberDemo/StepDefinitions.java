package com.edureka.cucumberDemo;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Login;

import org.junit.jupiter.api.Assertions.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDefinitions {

	WebDriver driver;
	String browser = "chrome";
	String url = "https://www.facebook.com";

	@Before
	public void setup() {
		String CurrDir = System.getProperty("user.dir");

		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", CurrDir + "\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		else

		{
			System.out.println("Valid browser is not provided");
			System.exit(0);
		}

		if (url != "") {
			driver.get(url);

		}

		else
			driver.get("about:blank");
	}
	
	@After
	public void tearDown()
	{
		driver.quit();
	}

	@Given("I am on the login page")
	public void i_am_on_the_login_page() {
		
		driver.navigate().to(url);
	}

	@When("I enter {string} & {string}")
	public void i_enter(String userName, String password) {
		
		Login loginObj = new Login(driver);
		loginObj.loginWithCred(userName, password);
	}

	@Then("I should successfuly login")
	public void i_should_successfuly_login() {
		System.out.println("Logged in successfuly");
	}

}
