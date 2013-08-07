package agile.academy.integration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class WebDriverFactory {

	public static WebDriver createWebDriver(String browserName) {

		if ("firefox".equals(browserName)) {
			return new FirefoxDriver();
		} else if ("chrome".equals(browserName)) {
			return new ChromeDriver();
		} else if ("htmlunit".equals(browserName)) {
			return new HtmlUnitDriver();
		} else {
			throw new IllegalArgumentException(String.format(
					"Browser %s is not supported. Please set 'firefox', 'chrome', or 'htmlunit'", browserName));
		}

	}

}
