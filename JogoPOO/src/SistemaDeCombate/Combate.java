package SistemaDeCombate;

import java.util.Random;
import java.util.Scanner;

import SistemaInventario.Pocao;
import Personagens.Personagem;
import SistemaInventario.Armadura;

public class Combate {
	
	//Atributos
	
	public Personagem jogador;
	public Inimigo inimigo;
	public Scanner scanner;
	
	//Construtores
	
	public Combate(Personagem jogador, Inimigo inimigo) {
		jogador = this.jogador;
		inimigo = this.inimigo;
		this.scanner = new Scanner(System.in);
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
	
	public int rolarDado (int max) {
		Random random = new Random();
        return random.nextInt(max) + 1;
	}
	
	public int causarDano() {
		return 0;
		
	}
	
	public void iniciarCombate (Personagem jogador, Inimigo inimigo) {
		System.out.println("O combate começa entre " + jogador.nome_Personagem + " e " + inimigo.nome_Personagem + "!");

        while (jogador.vida_Personagem > 0 && inimigo.vida_Personagem > 0) {
            // turno do jogador
            System.out.println("\n--- Turno de " + jogador.nome_Personagem + " ---");
            System.out.println("1. Atacar");
            System.out.println("2. Usar Magia");
            System.out.println("3. Usar uma poção");
            System.out.println("Escolha sua ação:");
            int escolha = scanner.nextInt();
            if (escolha == 1) {
            	int resultado = rolarDado(20);
            	if (resultado > inimigo.defesa_Inimigo) {
            		System.out.println("Você acertou o inimigo");
            		causarDano();
            	}else {
            		System.out.println("Você erra o ataque");
            	}
            } else if (escolha == 2) {
            	
            } else {
            	Pocao.beberPocao(jogador.vida_Personagem, jogador.vidamax_Personagem);
            }
            if (inimigo.vida_Personagem <= 0) {
            	System.out.println(inimigo.nome_Personagem + " foi derrotado!");
            	break;
            }
            System.out.println("\n--- Turno de " + inimigo.nome_Personagem + " ---");
        }

	}
}
