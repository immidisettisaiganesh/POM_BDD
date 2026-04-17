package stepDefinitions;

import org.testng.Assert;

import Hooks.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pajeObjects.HomePage_PageObject;
import pajeObjects.LoginPage_PageObject;

public class ParaBankStepDefinations {

	LoginPage_PageObject login = new LoginPage_PageObject(DriverManager.getDriver());
	HomePage_PageObject home = new HomePage_PageObject(DriverManager.getDriver());

	@Given("user is navigating to Login Page")
	public void user_is_navigating_to_login_page() {
		DriverManager.getDriver().get("https://parabank.parasoft.com/parabank/index.html");
	}

//	@When("user is entered UserName and password")
//	public void user_is_entered_user_name_and_password() {
//		login.setUserName("saigani");
//		login.setPassword("sai123");
//	}

	@When("user is entered {string} and {string}")
	public void user_is_entered_and(String uname, String pass) {
		login.setUserName(uname);
		login.setPassword(pass);
	}

	@And("click on login button")
	public void click_on_login_button() {
		login.clickLogin();
	}

	@Then("display account Overview page")
	public void display_account_overview_page() {
		Assert.assertEquals(DriverManager.getDriver().getTitle(), "ParaBank | Accounts Overview");
	}

	@And("logout the application")
	public void logout_the_application() {
		home.clickLogout();
	}

	@And("close the application")
	public void close_the_application() {
		DriverManager.getDriver().quit();
	}

}
