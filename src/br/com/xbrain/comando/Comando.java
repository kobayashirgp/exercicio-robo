package br.com.xbrain.comando;

import br.com.xbrain.robo.Robo;

public interface Comando {
	
	void executar(Robo robo,String comando);
	void setProximo(Comando comando);
}
