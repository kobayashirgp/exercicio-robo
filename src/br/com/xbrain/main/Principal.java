package br.com.xbrain.main;

import java.util.Scanner;

import br.com.xbrain.comando.Comando;
import br.com.xbrain.comando.Mover;
import br.com.xbrain.comando.Virar;
import br.com.xbrain.interpreter.Interpretador;
import br.com.xbrain.posicionamento.PosicaoImpl;
import br.com.xbrain.robo.Robo;
import br.com.xbrain.robo.RoboEd;

public class Principal {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("Obs. A orientação do robô não é a mesma que orientação do plano de visão do usuário");
		
		Comando comando1 = new Mover();
		
		Comando comando2 = new Virar();
		
		Robo robo = new RoboEd(new PosicaoImpl());	
		
		comando1.setProximo(comando2);
		
		Interpretador interpretador = new Interpretador(comando1,robo);
		
		Scanner scanner = new Scanner(System.in);
		
		while(true){		
			exibirEspacoPlano(robo);
		    System.out.println("Entre com o comando: ");   
		    String comando = scanner.nextLine().toLowerCase();	   
		    if(!comando.isEmpty())
		    	interpretador.receberComando(comando);    
		}		
	}

	private static void exibirEspacoPlano(Robo robo) {
		String console;
		for(int i= 0; i <10 ; i++){
			for(int j= 0; j < 10 ; j++){		
				 console = robo.getPosicao().getHorizontal() == j && robo.getPosicao().getVertical() == i ? " X " : " - ";
				 System.out.print(console);
			}
			System.out.println("");
		}
	}
}
