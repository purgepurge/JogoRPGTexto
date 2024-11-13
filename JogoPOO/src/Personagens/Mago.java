package Personagens;

import java.util.Scanner;

import SistemaInventario.Arma;
import SistemaInventario.Armadura;
import SistemaInventario.Inventario;

public class Mago extends Personagem {
	
	public Mago(String nome_Personagem,int vida_Personagem,int vidamax_Personagem, Inventario inventario_Personagem,int nivel_Personagem){
		this.nome_Personagem = nome_Personagem;
		this.vida_Personagem = vida_Personagem;
		this.vidamax_Personagem = vidamax_Personagem;
		this.inventario_Personagem = inventario_Personagem;
		this.nivel_Personagem = nivel_Personagem;
		this.scanner = new Scanner(System.in);
		this.classe_Personagem = "Mago";
		this.arma = new Arma("Arma Inicial","Arma básica, utilizada pelos membros da guilda", 5);
		this.armadura =new Armadura("Armadura Inicial","Armadura básica, utilizada pelos membros da guilda", 10);
	}
	
	public void usarBolaDeFogo() {
		arma.dano = 2*arma.dano;
		System.out.println("Você conjura uma bola de fogo utilizando seu foco arcano e a dispara em seu alvo");
		
	}
	
	public void usarRecuperacaoArcana() {
		vida_Personagem += (1/4) * vidamax_Personagem;
		if (vida_Personagem > vidamax_Personagem) {
			vida_Personagem = vidamax_Personagem;
		}
		System.out.println("Você conjura um escudo arcano, sua vida atual: "+vida_Personagem+" e a quantidade de escudo: ");

	}
	
	public int listarMagias() {
		System.out.println("Lista de magias");
		System.out.println("1 - Escudo Arcano");
		System.out.println("2 - Bola de Fogo");
		System.out.println("qual magia você quer usar?");
		int escolhaMagia = scanner.nextInt();
		if (escolhaMagia == 1) {
			usarRecuperacaoArcana();
		} else {
			usarBolaDeFogo();
		}
		return escolhaMagia;
	}
	
}
