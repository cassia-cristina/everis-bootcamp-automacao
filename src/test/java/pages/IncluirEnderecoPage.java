package pages;

import org.openqa.selenium.WebDriver;


import utils.Utils;

public class IncluirEnderecoPage {
	
	private Utils util;
	private RealizarLoginPage realizarLoginPage;
	
	public IncluirEnderecoPage(WebDriver driver) {
		util = new Utils(driver);
		realizarLoginPage = new RealizarLoginPage(driver);
	}
	
	public void incluirEndereco() {
		
		realizarLoginPage.RealizarLogin();
		
		util.clickPorPath("//a[@title=\"Addresses\"]");
		util.clickPorPath("//*[@id=\"center_column\"]/div[2]/a");
		util.preencheCampoPorId("address1", "Street test, 444");		
		util.preencheCampoPorId("city", "Hara");		
		util.preencheCampoPorId("id_state", "Ohio");		
		util.preencheCampoPorId("postcode", "96999");		
		util.preencheCampoPorId("id_country", "United States");
		util.preencheCampoPorId("phone", "55555555");
		util.preencheCampoPorId("phone_mobile", "9999999998");
		util.clickPorId("submitAddress");
		
	}

}
