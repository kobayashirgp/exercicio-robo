package br.com.xbrain.tests;

import org.junit.Before;
import org.junit.Test;

import br.com.xbrain.comando.Comando;
import br.com.xbrain.comando.Mover;
import br.com.xbrain.comando.Virar;
import br.com.xbrain.interpreter.Interpretador;
import br.com.xbrain.posicionamento.PosicaoImpl;
import br.com.xbrain.robo.Robo;
import br.com.xbrain.robo.RoboEd;

public class ComandoTest {

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
	@Test(expected=NumberFormatException.class)
	public void receberParametroIncorretoNoComandoMover(){
		
		interpretador.receberComando("andar duas casas");
	}
	@Test(expected=IllegalArgumentException.class)
	public void receberParametroIncorretoNoComandoVirar(){
		
		interpretador.receberComando("virar para rua");
	}
	
}
