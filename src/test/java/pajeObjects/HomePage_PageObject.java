package pajeObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage_PageObject extends BasePage{

	public HomePage_PageObject(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "//a[contains(text(),'Log Out')]")
	WebElement lnk_logout;
	
	public void clickLogout() {
		lnk_logout.click();
	}
}
