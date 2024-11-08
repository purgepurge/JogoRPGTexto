package Personagens;

import SistemaInventario.Inventario;

public class Arqueiro extends Personagem {
	
	public Arqueiro(String nome_Personagem,int vida_Personagem,int vidamax_Personagem, Inventario[] inventario_Personagem,int nivel_Personagem){
		nome_Personagem = this.nome_Personagem;
		vida_Personagem = this.vida_Personagem;
		vidamax_Personagem = this.vidamax_Personagem;
		inventario_Personagem = this.inventario_Personagem;
		nivel_Personagem = this.nivel_Personagem;
	}
	
	public Arqueiro() {}
	
	public static void usarMarcaDoCacador() {
		
	}
	
	public static void usarPrimeirosSocorros() {
		
	}

	@Override
	public void usarMagia() {
		// TODO Auto-generated method stub
		
	}

}
