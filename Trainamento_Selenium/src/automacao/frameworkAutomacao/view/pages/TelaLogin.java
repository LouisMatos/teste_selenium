package automacao.frameworkAutomacao.view.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import automacao.frameworkAutomacao.FirefoxContext;

public class TelaLogin extends FirefoxContext{
	
	private WebElement botao;
	
	private WebElement caixaDeTexto;
	
	private WebElement link;
	
	public WebElement botaoLogin(){
		botao = getDriver().findElement(By.xpath(".//*[@id='login_nav']/ul/li[2]/a"));
		return botao;
	}
	
	public WebElement caixaDeTextoEmail(){
		caixaDeTexto = getDriver().findElement(By.xpath("html/body/div[7]/div/div/div/div/div/section/form/fieldset/label[1]/input"));
		return caixaDeTexto;
	}
	
	public WebElement caixaDeTextoSenha(){
		caixaDeTexto = getDriver().findElement(By.xpath("html/body/div[7]/div/div/div/div/div/section/form/fieldset/label[2]/input"));
		return caixaDeTexto;
	}
	
	public WebElement botaoEntrar(){
		botao = getDriver().findElement(By.xpath("html/body/div[7]/div/div/div/div/div/section/form/fieldset/p/button"));
		return botao;
	}
	
	
	
}
