package br.com.xbrain.comando;

import br.com.xbrain.posicionamento.Direcao;
import br.com.xbrain.robo.Robo;

public class Mover extends TemplateComando{

	private final String prefixo = "andar";
	
	@Override
	public void executarComando(Robo robo, String comando) {
		int casas;
		comando = comando.replace("casas", "");
		comando = comando.replace("casa", "");
		comando = comando.replace("andar", "");	
		try{
			casas = Integer.valueOf(comando.trim());
		}catch(NumberFormatException e){
			throw new NumberFormatException("Não foi possível reconher o número inserido");
		}
		Direcao direcaoAtual = robo.getDirecao();
		for(int i = 0; i < casas ; i++){
			switch(direcaoAtual){
				case ESQUERDA:	robo.setPosicaoHorizontal(robo.getPosicaoHorizontal() +1);
								break;
				case DIREITA:	robo.setPosicaoHorizontal(robo.getPosicaoHorizontal() -1);
								break;
				case BAIXO:		robo.setPosicaoVertical(robo.getPosicaoVertical() -1);
								break;
				case CIMA:		robo.setPosicaoVertical(robo.getPosicaoVertical() +1);					
								break;
				default:
							throw new IllegalArgumentException("Comando para mover incorreto!");
								
			}
		}
		System.out.println(robo.getNome() + " está na posição H:"+ robo.getPosicaoHorizontal() + " V: " + robo.getPosicaoVertical());
	}

	@Override
	public String getPrefixoComando() {
		return prefixo;
	}
	
}
