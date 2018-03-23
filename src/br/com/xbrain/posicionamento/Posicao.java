package br.com.xbrain.posicionamento;

public interface Posicao {

	int getHorizontal();

	void setHorizontal(int horizontal);

	int getVertical();

	void setVertical(int vertical);

	Direcao getDirecao();

	void setDirecao(Direcao direcao);

}