package br.com.xbrain.comando;

import br.com.xbrain.posicionamento.Direcao;
import br.com.xbrain.robo.Robo;

public class Virar extends TemplateComando{

	private final String prefixo = "virar";
	@Override
	public void executarComando(Robo robo, String comando) {
		comando = comando.replace("virar para", "");
		comando = comando.trim();
		
		switch(comando.toLowerCase()){
			case "esquerda":
							robo.setDirecao(Direcao.ESQUERDA);
							break;
			case "direita":
							robo.setDirecao(Direcao.DIREITA);
							break;
			case "cima":
							robo.setDirecao(Direcao.CIMA);
							break;
			case "baixo":
							robo.setDirecao(Direcao.BAIXO);	
							break;
			default:
							throw new IllegalArgumentException("Comando para virar incorreto!");
		}
		System.out.println(robo.getNome() + " está virando para "+ robo.getDirecao().toString());
	}

	@Override
	public String getPrefixoComando() {
		return prefixo;
	}
}
