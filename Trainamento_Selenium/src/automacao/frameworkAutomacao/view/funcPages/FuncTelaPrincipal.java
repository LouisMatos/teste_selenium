package automacao.frameworkAutomacao.view.funcPages;

import automacao.frameworkAutomacao.view.pages.TelaPrincipal;

public class FuncTelaPrincipal extends TelaPrincipal{

	
	public void clicarLinkRodadaAnterior(){
		linkPontRodadaAnterior().click();
	}
	
	public void clicarBotaoFecharRodadaAnterior(){
		botaoFecharPontosRodadaAnterior().click();
	}
}
