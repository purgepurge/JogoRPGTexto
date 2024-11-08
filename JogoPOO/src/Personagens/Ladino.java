package Personagens;

import SistemaInventario.Armadura;
import SistemaInventario.Inventario;

public class Ladino extends Personagem{
	
	public Ladino(String nome_Personagem,int vida_Personagem,int vidamax_Personagem, Inventario[] inventario_Personagem,int nivel_Personagem){
		nome_Personagem = this.nome_Personagem;
		vida_Personagem = this.vida_Personagem;
		vidamax_Personagem = this.vidamax_Personagem;
		inventario_Personagem = this.inventario_Personagem;
		nivel_Personagem = this.nivel_Personagem;
	}
	
	
	public static void usarGolpeDasSombras() {
		
	}
	
	public void usarEvasao(Armadura armadura) {
		armadura.defesa = 2 * armadura.defesa;
	}


	@Override
	public void usarMagia() {
		// TODO Auto-generated method stub
		
	}

}
