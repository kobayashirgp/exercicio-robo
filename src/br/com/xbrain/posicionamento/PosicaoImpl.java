package br.com.xbrain.posicionamento;


public class PosicaoImpl implements Posicao {
	
	private final int maxHorizontal = 9;
	private final int maxVertical = 9;
	private final int minHorizontal = 0;
	private final int minVertical = 0;
	
	private int horizontal = 0;
	private int vertical = 0;
	
	private Direcao direcao = Direcao.CIMA;
	
	@Override
	public int getHorizontal() {
		return horizontal;
	}

	@Override
	public void setHorizontal(int horizontal) {		
		if(horizontal > maxHorizontal)
			this.horizontal = 0;
		else if (horizontal < minHorizontal) 
			this.horizontal = 9;
		else
			this.horizontal = horizontal;	
	}
	
	@Override
	public int getVertical() {
		return vertical;
	}
	
	@Override
	public void setVertical(int vertical) {	
		if(vertical > maxVertical)
			this.vertical= 0;
		else if (vertical < minVertical) 
			this.vertical = 9;
		else
			this.vertical = vertical;		
	}
	
	@Override
	public Direcao getDirecao() {
		return this.direcao;
	}
	
	@Override
	public void setDirecao(Direcao direcao) {
		this.direcao = direcao;
	}
	
}
