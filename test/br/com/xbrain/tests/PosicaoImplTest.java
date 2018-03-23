package br.com.xbrain.tests;

import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import br.com.xbrain.comando.Comando;
import br.com.xbrain.comando.Mover;
import br.com.xbrain.posicionamento.Direcao;
import br.com.xbrain.posicionamento.Posicao;
import br.com.xbrain.posicionamento.PosicaoImpl;
import br.com.xbrain.robo.Robo;
import br.com.xbrain.robo.RoboEd;

public class PosicaoImplTest {

	private Posicao posicao;
	private Comando comando;
	private Robo robo;
	@Before()
	public void criaAmbiente(){
		this.posicao = new PosicaoImpl();
		this.robo  = new RoboEd(this.posicao);	
		this.comando = new Mover();
	}
	@Test
	public void deveInicializarPosicaoComParametrosDefault(){
		assertThat(posicao.getDirecao(),equalTo(Direcao.CIMA));
		assertThat(posicao.getHorizontal(),equalTo(0));
		assertThat(posicao.getVertical(),equalTo(0));
	}
	@Test
	public void verificarPlanoCircularHorizontalDaMatriz(){
		
		robo.getPosicao().setDirecao(Direcao.DIREITA);
		comando.executar(robo, "andar 10 casas");
			
		assertThat(robo.getPosicaoHorizontal(),equalTo(0));	
		
	}
	@Test
	public void verificarPlanoCircularVerticalDaMatriz(){

		robo.getPosicao().setDirecao(Direcao.ESQUERDA);
		comando.executar(robo, "andar 10 casas");
			
		assertThat(robo.getPosicaoVertical(),equalTo(0));	
		
	}
	@Test
	public void verificarMudancaDeDirecao(){
		robo.getPosicao().setDirecao(Direcao.BAIXO);
		assertThat(robo.getDirecao(),equalTo(Direcao.BAIXO));
		robo.getPosicao().setDirecao(Direcao.ESQUERDA);
		assertThat(robo.getDirecao(),equalTo(Direcao.ESQUERDA));	
		robo.getPosicao().setDirecao(Direcao.DIREITA);
		assertThat(robo.getDirecao(),equalTo(Direcao.DIREITA));	
		robo.getPosicao().setDirecao(Direcao.CIMA);
		assertThat(robo.getDirecao(),equalTo(Direcao.CIMA));	
	}
	
}
