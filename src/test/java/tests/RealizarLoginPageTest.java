package tests;

import org.junit.After;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.RealizarLoginPage;
import utils.Utils;

public class RealizarLoginPageTest {
	
	private WebDriver driver;
	private RealizarLoginPage realizarLoginPage;
	private Utils util;
	
	@Before
	public void inicializa() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		realizarLoginPage = new RealizarLoginPage(driver);
		util = new Utils(driver);
	}
	
	@Test
	public void realizarlogin() {
		realizarLoginPage.RealizarLogin();
		util.esperaExplicitaPorCss("a[title='Orders'] span");
		String validaTexto = util.getTextByCss("a[title='Orders'] span");
		Assert.assertEquals("ORDER HISTORY AND DETAILS", validaTexto);
	}
	
	@After
	public void quit() {
		driver.quit();
	}

}
