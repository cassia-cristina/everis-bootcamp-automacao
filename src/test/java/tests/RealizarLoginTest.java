package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import utils.Utils;

public class RealizarLoginTest {

	private ChromeDriver driver;
	private Utils util;

	@Before
	public void inicializa() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		util = new Utils(driver);
	}

	@Test
	public void logar() {

		driver.get("http://automationpractice.com/index.php");

		driver.findElement(By.cssSelector("#header > div.nav > div > div > nav > div.header_user_info > a")).click();
		driver.findElement(By.id("email")).sendKeys("everisbootcamp@qabeginner.com");
		driver.findElement(By.id("passwd")).sendKeys("QA@everis213");
		driver.findElement(By.name("SubmitLogin")).click();
		util.esperaExplicitaPorCss("a[title='Orders'] span");
	}

	@After
	public void afterCenario() {
		if (driver != null) {
			driver.close();
			driver.quit();
			driver = null;
		}
	}

}
