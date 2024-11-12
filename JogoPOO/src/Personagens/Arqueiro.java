package Personagens;

import java.util.Scanner;

import SistemaInventario.Inventario;

public class Arqueiro extends Personagem {
	
	public Arqueiro(String nome_Personagem,int vida_Personagem,int vidamax_Personagem, Inventario inventario_Personagem,int nivel_Personagem){
		nome_Personagem = this.nome_Personagem;
		vida_Personagem = this.vida_Personagem;
		vidamax_Personagem = this.vidamax_Personagem;
		inventario_Personagem = this.inventario_Personagem;
		nivel_Personagem = this.nivel_Personagem;
		this.scanner = new Scanner(System.in);
	}
	
	public Arqueiro() {}
	
	public void usarTiroPreciso() {
		arma.dano = 2* arma.dano;
		System.out.println("Você puxa seu arco e concentra no ponto fraco do inimigo");
		
	} 
	
	public void usarPrimeirosSocorros() {
		vida_Personagem += (1/4) * vida_Personagem;
		if (vida_Personagem > vidamax_Personagem) {
			vida_Personagem = vidamax_Personagem;
		}
	}
	
	public int listarMagias() {
		System.out.println("Lista de magias");
		System.out.println("1 - Primeiros Socorros");
		System.out.println("2 - Tiro Preciso");
		System.out.println("qual magia você quer usar?");
		int escolhaMagia = scanner.nextInt();
		if (escolhaMagia == 1) {
			usarPrimeirosSocorros();
		} else {
			usarTiroPreciso();
		}
		return escolhaMagia;
	}


	

}
