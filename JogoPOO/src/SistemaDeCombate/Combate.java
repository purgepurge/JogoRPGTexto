package SistemaDeCombate;

import java.util.Random;
import java.util.Scanner;

import SistemaInventario.Pocao;
import Personagens.Personagem;
import SistemaInventario.Armadura;

public class Combate {
	
	//Atributos
	
	public Personagem jogador;//Jogador que vai está envolvido no combate
	public Inimigo inimigo;//Inimigo que vai está envolvido no combate
	public Scanner scanner;
	
	//Construtores
	
	public Combate(Personagem jogador, Inimigo inimigo) {
		this.jogador =jogador;
		this.inimigo =inimigo;
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
	
	public int rolarDado (int max) {//Rola um dado d20
		Random random = new Random();
        return random.nextInt(max) + 1;
	}
	
	public void causarDanojogador(Personagem jogador, Inimigo inimigo) {//Metodo para fazer o jogador causar dano
		inimigo.vida_Personagem -= jogador.arma.dano;
		System.out.println("Você causou: "+jogador.arma.dano+" de dano!");
	}
	
	public void causarDanoinimigo(Personagem jogador, Inimigo inimigo) {//Metodo para fazer o inimigo causar dano
		jogador.vida_Personagem -= inimigo.forca_Inimigo;
		System.out.println("O "+inimigo.nome_Personagem+" causou: "+inimigo.forca_Inimigo+" de dano!");
	}
		
	
	public void iniciarCombate (Personagem jogador, Inimigo inimigo) {//Metodo que inicia o combate
		System.out.println("O combate começa entre " + jogador.nome_Personagem + " e " + inimigo.nome_Personagem + "!");

        while (jogador.vida_Personagem > 0 && inimigo.vida_Personagem > 0) {//Condição para o combate continuar acontecendo
            // turno do jogador
            System.out.println("\n--- Turno de " + jogador.nome_Personagem +" Vida atual: "+jogador.vida_Personagem+"/"+jogador.vidamax_Personagem+" ---");
            System.out.println("1. Atacar");
            System.out.println("2. Usar Magia");
            System.out.println("3. Usar uma poção");
            System.out.println("Escolha sua ação:");
            int escolha = scanner.nextInt();
            if (escolha == 1) {
            	int resultado = rolarDado(20);
            	if (resultado > inimigo.defesa_Inimigo) {//condição para saber se o golpe irá acertar ou errar
            		System.out.println("Você acertou o inimigo");
            		causarDanojogador(jogador, inimigo);
            	}else {
            		System.out.println("Você erra o ataque");
            	}
            } else if (escolha == 2) {            	
            	if (jogador.listarMagias() ==2) {//Listar as magias, caso seja uma magia ofensiva, irá causar dano
            		causarDanojogador(jogador,inimigo);
            		jogador.arma.dano = 0.5 * jogador.arma.dano;
            	}
            } else {
            	Pocao.beberPocao(jogador.getVida_Personagem(), jogador.vidamax_Personagem);//Metodo para beber uma poção
            }
            if (inimigo.getVida_Personagem() <= 0) {//Checar se o inimigo foi derrotado
            	System.out.println(inimigo.nome_Personagem + " foi derrotado!");
            	break;
            }
            //turno do inimigo
            System.out.println("\n--- Turno de " + inimigo.nome_Personagem +" vida atual: "+inimigo.vida_Personagem+"/"+inimigo.vidamax_Personagem+" ---");
            System.out.println("o "+inimigo.nome_Personagem+" prepara para atacar");
            int resultado = rolarDado(20);
            if (resultado > jogador.armadura.defesa) {
        		System.out.println("O Inimigo acertou o ataque");
        		causarDanoinimigo(jogador, inimigo);
        	}else {
        		System.out.println("o Inimigo erra o ataque");
        	}
            if (jogador.vida_Personagem <= 0) {//Checar se o jogador foi derrotado
            	System.out.println(jogador.nome_Personagem+" foi derrotado!");
            	break;
            }
            
            
        }

	}
}
