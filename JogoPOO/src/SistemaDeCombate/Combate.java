package SistemaDeCombate;

import Personagens.Personagem;

public class Combate {
	
	//Atributos
	
	public Personagem jogador;
	public Inimigo inimigo;
	
	//Construtores
	
	public Combate(Personagem jogador, Inimigo inimigo) {
		jogador = this.jogador;
		inimigo = this.inimigo;
	}
	
	public Combate() {}
	
	//Getters and Setters
	
	public Personagem getJogador() {
		return jogador;
	}

	public void setJogador(Personagem jogador) {
		this.jogador = jogador;
	}

	public Inimigo getInimigo() {
		return inimigo;
	}

	public void setInimigo(Inimigo inimigo) {
		this.inimigo = inimigo;
	}
	
	//Metodos

}
