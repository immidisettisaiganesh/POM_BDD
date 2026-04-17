package pajeObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage_PageObject extends BasePage{

	public LoginPage_PageObject(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//input[@name='username']")
	WebElement txt_username;
	
	public void setUserName(String uname) {
		txt_username.sendKeys(uname);
	}
	
	@FindBy(xpath = "//input[@name='password']")
	WebElement txt_password;
	
	public void setPassword(String pass) {
		txt_password.sendKeys(pass);
	}
	
	@FindBy(xpath = "//input[@type='submit']")
	WebElement btn_login;
	
	public void clickLogin() {
		btn_login.click();
	}
}
