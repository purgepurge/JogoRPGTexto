package Personagens;

import SistemaInventario.Arma;
import SistemaInventario.Inventario;

public class Guerreiro extends Personagem{
	
	public Guerreiro(String nome_Personagem,int vida_Personagem,int vidamax_Personagem, Inventario[] inventario_Personagem,int nivel_Personagem){
		nome_Personagem = this.nome_Personagem;
		vida_Personagem = this.vida_Personagem;
		vidamax_Personagem = this.vidamax_Personagem;
		inventario_Personagem = this.inventario_Personagem;
		nivel_Personagem = this.nivel_Personagem;
	}
	
	
	public void usarRespiroDeVida() {
		vida_Personagem += (1/4) * vidamax_Personagem;
		System.out.println("você respira profundamente e sente uma sensação de renovo, vida atual: "+ vida_Personagem);
	}
	
	public void usarAtaqueBrutal(Arma arma) {
		arma.dano = 2*arma.dano;
		System.out.println("você realiza um ataque devastador utilizando toda a força do seu corpo, seu ataque causou o dobro de dano: "+ arma.dano);
		
	}


	public void usarMagia() {
		// TODO Auto-generated method stub
		
	}
	

}
