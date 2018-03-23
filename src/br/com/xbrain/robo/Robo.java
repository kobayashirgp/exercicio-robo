package br.com.xbrain.robo;

import br.com.xbrain.posicionamento.Direcao;
import br.com.xbrain.posicionamento.Posicao;

public abstract class Robo {

	private Posicao posicao;
	private String nome;
	
	public Robo(Posicao posicao) {
		this.posicao = posicao;
	}
	public Posicao getPosicao() {
		return posicao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setPosicao(Posicao posicao) {
		this.posicao = posicao;
	}
	public Direcao getDirecao(){
		return this.posicao.getDirecao();
	}
	public void setDirecao(Direcao direcao){	
		this.posicao.setDirecao(direcao);	
	}
	public int getPosicaoHorizontal(){
		return this.getPosicao().getHorizontal();
	}
	public int getPosicaoVertical(){
		return this.getPosicao().getVertical();
	}
	public void setPosicaoHorizontal(int horizontal){	
		this.posicao.setHorizontal(horizontal);		
	}
	public void setPosicaoVertical(int vertical){		
		this.posicao.setVertical(vertical);		
	}	
}
