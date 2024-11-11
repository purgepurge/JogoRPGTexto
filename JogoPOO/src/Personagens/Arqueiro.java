package Personagens;

import java.util.Scanner;

import SistemaInventario.Inventario;

public class Arqueiro extends Personagem {
	
	public Arqueiro(String nome_Personagem,int vida_Personagem,int vidamax_Personagem, Inventario[] inventario_Personagem,int nivel_Personagem){
		nome_Personagem = this.nome_Personagem;
		vida_Personagem = this.vida_Personagem;
		vidamax_Personagem = this.vidamax_Personagem;
		inventario_Personagem = this.inventario_Personagem;
		nivel_Personagem = this.nivel_Personagem;
		this.scanner = new Scanner(System.in);
	}
	
	public Arqueiro() {}
	
	public static void usarMarcaDoCacador() {
		
	} 
	
	public void usarPrimeirosSocorros() {
		vida_Personagem += (1/4) * vida_Personagem;
		if (vida_Personagem > vidamax_Personagem) {
			vida_Personagem = vidamax_Personagem;
		}
	}
	
	public void listarMagias() {
		System.out.println("Lista de magias");
		System.out.println("1 - Marca do cacador");
		System.out.println("2 - Primeiros Socorros");
		System.out.println("qual magia você quer usar?");
		int escolhaMagia = scanner.nextInt();
		if (escolhaMagia == 1) {
			usarMarcaDoCacador();
		} else {
			usarPrimeirosSocorros();
		}
	}

	@Override
	public void usarMagia() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void causarDano() {
		// TODO Auto-generated method stub
		
	}

}
