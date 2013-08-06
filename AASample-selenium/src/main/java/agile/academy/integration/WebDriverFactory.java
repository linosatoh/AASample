package agile.academy.integration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class WebDriverFactory {

	public static WebDriver createWebDriver(String browserName) {
		switch (browserName) {
		case "firefox":
			return new FirefoxDriver();
		case "chrome":
			return new ChromeDriver();
		case "htmlunit":
			return new HtmlUnitDriver();
		default:
			throw new IllegalArgumentException(String.format(
					"Browser %s is not supported. Please set 'firefox', 'chrome', or 'htmlunit'", browserName));
		}
	}

}
