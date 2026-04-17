package Hooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class DriverManager {

	private static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();

	@Before
	public void initDriver() {
		driver.set(new ChromeDriver());
	}

	public static WebDriver getDriver() {
		return driver.get();
	}

	@After
	public void closeDriver() {
		driver.remove();
	}
}
