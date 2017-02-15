package automacao.frameworkAutomacao.view.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import automacao.frameworkAutomacao.FirefoxContext;

public class TelaPrincipal extends FirefoxContext{
	
	private WebElement link;

	private WebElement botao;
	
	public WebElement linkPontRodadaAnterior(){
		link = getDriver().findElement(By.xpath("html/body/section[3]/div[1]/div/div/div[1]/a"));
		return link;
	}

	public WebElement botaoFecharPontosRodadaAnterior(){
		botao = getDriver().findElement(By.xpath("html/body/div[6]/div/div/a"));		
		return botao;
	}
}
