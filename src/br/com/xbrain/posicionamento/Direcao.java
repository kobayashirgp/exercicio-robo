package br.com.xbrain.posicionamento;

public enum Direcao {

	ESQUERDA(0, "Esquerda"),
	DIREITA(1, "Direita"),
	CIMA(2, "Cima"),
	BAIXO(3 , "Baixo");
	
	private int valor;
	private String direcao;
	
	Direcao(int valor, String direcao){
		this.valor = valor;
		this.direcao = direcao;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public String toString() {
		return direcao;
	}

	public void setDirecao(String direcao) {
		this.direcao = direcao;
	}
	
	
}
