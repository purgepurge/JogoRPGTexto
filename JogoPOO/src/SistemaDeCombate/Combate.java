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
		inimigo.setVida_Personagem(inimigo.getVida_Personagem() - jogador.getArma().dano);
		System.out.println("Você causou: "+jogador.getArma().dano+" de dano!");
	}
	
	public void causarDanoinimigo(Personagem jogador, Inimigo inimigo) {//Metodo para fazer o inimigo causar dano
		jogador.setVida_Personagem(jogador.getVida_Personagem() - inimigo.getForca_Inimigo());
		System.out.println("O "+inimigo.getNome_Personagem()+" causou: "+inimigo.getForca_Inimigo()+" de dano!");
	}
		
	
	public void iniciarCombate (Personagem jogador, Inimigo inimigo) {//Metodo que inicia o combate
		System.out.println("O combate começa entre " + jogador.getNome_Personagem() + " e " + inimigo.getNome_Personagem() + "!");

        while (jogador.getVida_Personagem() > 0 && inimigo.getVida_Personagem() > 0) {//Condição para o combate continuar acontecendo
            // turno do jogador
            System.out.println("\n--- Turno de " + jogador.getNome_Personagem() +" Vida atual: "+jogador.getVida_Personagem()+"/"+jogador.getVidamax_Personagem()+" ---");
            System.out.println("1. Atacar");
            System.out.println("2. Usar Magia");
            System.out.println("3. Usar uma poção");
            System.out.println("Escolha sua ação:");
            int escolha = scanner.nextInt();
            if (escolha == 1) {
            	int resultado = rolarDado(20);
            	if (resultado > inimigo.getDefesa_Inimigo()) {//condição para saber se o golpe irá acertar ou errar
            		System.out.println("Você acertou o inimigo");
            		causarDanojogador(jogador, inimigo);
            	}else {
            		System.out.println("Você erra o ataque");
            	}
            } else if (escolha == 2) {            	
            	if (jogador.listarMagias() ==2) {//Listar as magias, caso seja uma magia ofensiva, irá causar dano
            		causarDanojogador(jogador,inimigo);
            		jogador.getArma().dano = 0.5 * jogador.getArma().dano;
            	}
            } else {
            	Pocao.beberPocao(jogador.getVida_Personagem(), jogador.getVidamax_Personagem());//Metodo para beber uma poção
            }
            if (inimigo.getVida_Personagem() <= 0) {//Checar se o inimigo foi derrotado
            	System.out.println(inimigo.getNome_Personagem() + " foi derrotado!");
            	break;
            }
            //turno do inimigo
            System.out.println("\n--- Turno de " + inimigo.getNome_Personagem() +" vida atual: "+inimigo.getVida_Personagem()+"/"+inimigo.getVidamax_Personagem()+" ---");
            System.out.println("o "+inimigo.getNome_Personagem()+" prepara para atacar");
            int resultado = rolarDado(20);
            if (resultado > jogador.getArmadura().defesa) {
        		System.out.println("O Inimigo acertou o ataque");
        		causarDanoinimigo(jogador, inimigo);
        	}else {
        		System.out.println("o Inimigo erra o ataque");
        	}
            if (jogador.getVida_Personagem() <= 0) {//Checar se o jogador foi derrotado
            	System.out.println(jogador.getNome_Personagem()+" foi derrotado!");
            	break;
            }
            
            
        }

	}
}
