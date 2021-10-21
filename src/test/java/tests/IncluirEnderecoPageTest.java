package tests;

import org.junit.After;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.IncluirEnderecoPage;
import utils.Utils;

public class IncluirEnderecoPageTest {
	
	private WebDriver driver;
	private IncluirEnderecoPage incluirEnderecoPage;
	private Utils util;
	
	@Before
	public void inicializa() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		incluirEnderecoPage = new IncluirEnderecoPage(driver);
		util = new Utils(driver);
	}
	

	@Test
	public void incluirNovoEndereco() {
		incluirEnderecoPage.incluirEndereco();
		util.esperaExplicitaPorPath("//*[@class=\"last_item alternate_item box\"]/li/h3");
		String validaTexto = util.getTextByPath("//*[@class=\"last_item alternate_item box\"]/li/h3");
		Assert.assertEquals("MY ADDRESS", validaTexto);
		
	}
	
	@After
	public void quit() {
		driver.quit();
	}

}
