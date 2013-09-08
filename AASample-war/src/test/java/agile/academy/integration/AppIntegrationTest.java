package agile.academy.integration;

import static org.hamcrest.CoreMatchers.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


/**
 * 	Seleniumを使って足し算アプリのテストを行います。
 */
public class AppIntegrationTest {

	private static final String KEY_BASE_URL = "base_url";
	private static final String KEY_BROWSER_NAME = "browser_name";

	private WebDriver driver;

	@Before
	public void before() {
		driver = WebDriverFactory.createWebDriver(System.getProperty(KEY_BROWSER_NAME));
	}

	// 10 + 20 = 30 になることを確認
	@Test
	public void testAdd() throws Exception{
		driver.get(System.getProperty(KEY_BASE_URL));
		
		// 1つめの引数を入力
		WebElement addend = driver.findElement(By.name("addend"));
		addend.clear();
		addend.sendKeys("10");

		// 2つめの引数を入力
		WebElement augend = driver.findElement(By.name("augend"));
		augend.clear();
		augend.sendKeys("20");
		Thread.sleep(5000);
		// 計算実行
		WebElement submit = driver.findElement(By.id("button_calc"));
		submit.click();
		Thread.sleep(5000);
		// 結果の検証
		Assert.assertThat(driver.findElement(By.id("result")).getText(), is("30"));
	}

	@After
	public void after() {
		driver.quit();
	}
}
