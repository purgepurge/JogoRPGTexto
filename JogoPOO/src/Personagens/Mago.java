package Personagens;

import SistemaInventario.Arma;
import SistemaInventario.Inventario;

public class Mago extends Personagem {
	
	public Mago(String nome_Personagem,int vida_Personagem,int vidamax_Personagem, Inventario[] inventario_Personagem,int nivel_Personagem){
		nome_Personagem = this.nome_Personagem;
		vida_Personagem = this.vida_Personagem;
		vidamax_Personagem = this.vidamax_Personagem;
		inventario_Personagem = this.inventario_Personagem;
		nivel_Personagem = this.nivel_Personagem;
	}
	
	public static void usarBolaDeFogo(Arma arma) {
		arma.dano = 2*arma.dano;
		System.out.println("Você conjura uma bola de fogo utilizando seu foco arcano e a dispara em seu alvo, causando: "+arma.dano+" de dano");
		
	}
	
	public void usarEscudoArcano() {
		int escudoArcano = (1/4) * vidamax_Personagem;
		System.out.println("Você conjura um escudo arcano, sua vida atual: "+vida_Personagem+" e a quantidade de escudo: "+escudoArcano);

		}
	

	@Override
	public void usarMagia() {
		// TODO Auto-generated method stub
		
	}

}
