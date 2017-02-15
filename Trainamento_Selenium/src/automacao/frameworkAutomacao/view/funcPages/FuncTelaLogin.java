package automacao.frameworkAutomacao.view.funcPages;

import automacao.frameworkAutomacao.view.pages.TelaLogin;

public class FuncTelaLogin extends TelaLogin{
	
	public void clicarBotaoLogin(){
		botaoLogin().click();
	}
	
	public void digitarCaixaDeTextoEmail(String email){
		caixaDeTextoEmail().sendKeys(email);
	}
	
	public void digitarCaixaDeTextoSenha(String senha){
		caixaDeTextoSenha().sendKeys(senha);
	}
	
	public void clicarBotaoEntrar(){
		botaoEntrar().click();
	}
	
	
	
}
