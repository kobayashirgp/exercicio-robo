package br.com.xbrain.interpreter;


import br.com.xbrain.comando.Comando;
import br.com.xbrain.robo.Robo;

public class Interpretador {
	
	private Comando acao;
	private Robo robo;
	
	public Interpretador(Comando acao, Robo robo) {
		this.acao = acao;
		this.robo = robo;
	}
	public void receberComando(String comandoTotal){	
		String[] comandos = comandoTotal.split(" e ");
		
		for(String comando: comandos){			
			acao.executar(robo, comando);	
		}
	
	}
	public Comando getAcao() {
		return acao;
	}
	public void setAcao(Comando acao) {
		this.acao = acao;
	}
	public Robo getRobo() {
		return robo;
	}
	public void setRobo(Robo robo) {
		this.robo = robo;
	}		
}
