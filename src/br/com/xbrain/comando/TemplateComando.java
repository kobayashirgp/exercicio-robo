package br.com.xbrain.comando;

import br.com.xbrain.robo.Robo;

public abstract class TemplateComando implements Comando{

	private Comando proximo;
	
	@Override
	public void executar(Robo robo, String comando) {
		if(verificarComandoValido(comando)){
			executarComando(robo,comando);
		}else{
			executarProximoComando(robo,comando);
		}
	}

	@Override
	public void setProximo(Comando proximo) {
		this.proximo = proximo;
	}
	public void executarProximoComando(Robo robo,String comando){
		if(this.proximo != null)
			this.proximo.executar(robo, comando);
	}
	private boolean verificarComandoValido(String comando) {		
		return comando.toLowerCase().startsWith(getPrefixoComando());
	}
	public abstract void executarComando(Robo robo, String comando);
	
	public abstract String getPrefixoComando();
}
