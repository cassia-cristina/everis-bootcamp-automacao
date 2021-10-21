package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utils {
	private WebDriver driver;
	private WebDriverWait wait;

	public Utils(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 5);
	}

	public void preencheCampoPorId(String id_campo, String value) {

		driver.findElement(By.id(id_campo)).sendKeys(value);
	}
	
	public void preencheCampoPorCss(String id_campo, String value) {

		driver.findElement(By.cssSelector(id_campo)).sendKeys(value);
	}

	public void clickPorCss(String css_campo) {

		driver.findElement(By.cssSelector(css_campo)).click();
	}

	public void clickPorNome(String name_campo) {

		driver.findElement(By.name(name_campo)).click();
	}

	public void clickPorId(String id_campo) {

		driver.findElement(By.id(id_campo)).click();
	}

	public void esperaExplicitaPorId(String element) {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id(element)));
	}
	
	public void esperaExplicitaPorCss(String element) {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(element)));
	}

}
