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
	
	public void clickPorPath(String path_campo) {
		
		driver.findElement(By.xpath(path_campo)).click();
	}
	
	public String getTextByPath(String path_campo) {
		
		return driver.findElement(By.xpath(path_campo)).getText();
	}
	
	public String getTextById(String id_campo) {
		
		return driver.findElement(By.id(id_campo)).getText();
	}
	
	public String getTextByCss(String css_campo) {
		
		return driver.findElement(By.cssSelector(css_campo)).getText();
	}

	public void esperaExplicitaPorId(String id_campo) {
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id(id_campo)));
	}
	
	public void esperaExplicitaPorCss(String css_campo) {
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(css_campo)));
	}
	
	public void esperaExplicitaPorPath(String path_campo) {
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(path_campo)));
	}

}
