package automacao.casoDeTeste;

import org.junit.Test;

import automacao.frameworkAutomacao.FirefoxContext;
import automacao.frameworkAutomacao.view.funcPages.FuncTelaLogin;
import automacao.frameworkAutomacao.view.funcPages.FuncTelaPrincipal;

public class AutomacaoTeste extends FirefoxContext{
	
	FuncTelaLogin telaLogin = new FuncTelaLogin();
	FuncTelaPrincipal telaPrincipal = new FuncTelaPrincipal();
	
	@Test
	public void executarTeste() throws Exception{
		inputURL("http://www.timbeta.com.br");
		
		try{
			telaLogin.clicarBotaoLogin();
			
			telaLogin.digitarCaixaDeTextoEmail("luismatos000@gmail.com");
			
			telaLogin.digitarCaixaDeTextoSenha("");
			
			telaLogin.clicarBotaoEntrar();
			
			Thread.sleep(9000);
			
			telaPrincipal.clicarLinkRodadaAnterior();
			
			Thread.sleep(10000);
			
			telaPrincipal.clicarBotaoFecharRodadaAnterior();
			
			Thread.sleep(10000);
			
			telaPrincipal.clicarLinkRodadaAnterior();
			
	
		}catch(Exception e){
			throw new Exception(e.getMessage());
		}
		
	}
}
