package br.com.xbrain.tests;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Before;
import org.junit.Test;

import br.com.xbrain.comando.Comando;
import br.com.xbrain.comando.Mover;
import br.com.xbrain.comando.Virar;
import br.com.xbrain.interpreter.Interpretador;
import br.com.xbrain.posicionamento.Direcao;
import br.com.xbrain.posicionamento.PosicaoImpl;
import br.com.xbrain.robo.Robo;
import br.com.xbrain.robo.RoboEd;

public class InterpretadorTest {

	private Interpretador interpretador;
	private Comando comando;
	private Robo robo;
	
	@Before
	public void criaAmbiente(){
		this.comando = new Mover();
		this.comando.setProximo(new Virar());
		this.robo = new RoboEd(new PosicaoImpl());
		this.interpretador = new Interpretador(comando, robo);
	}
	@Test
	public void receberComando(){
		robo.setDirecao(Direcao.DIREITA);
		interpretador.receberComando("andar 5 casas");
		
		assertThat(robo.getPosicaoHorizontal(),equalTo(5));
		assertThat(robo.getPosicaoVertical(),equalTo(0));
	}
	@Test
	public void receberMultiplosComandos(){
		robo.setDirecao(Direcao.CIMA);
		interpretador.receberComando("andar 2 casas e virar para esquerda e andar 2 casas");
		
		assertThat(robo.getPosicaoHorizontal(),equalTo(2));
		assertThat(robo.getPosicaoVertical(),equalTo(2));
	}
	@Test
	public void receberComandoErrado(){
		
		interpretador.receberComando("correr 2 casas e rodar para esquerda e correr 2 casas");
		
		assertThat(robo.getPosicaoHorizontal(),equalTo(0));
		assertThat(robo.getPosicaoVertical(),equalTo(0));
	}
	
}
