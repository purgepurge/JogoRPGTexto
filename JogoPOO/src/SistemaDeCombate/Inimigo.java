package SistemaDeCombate;

import Personagens.Personagem;

public class Inimigo extends Personagem{
	
	public int forca_Inimigo;//o quanto o inimigo vai causar de dano
	public int defesa_Inimigo;//a quantidade de defesa que a rolagem de dados precisa comparar para saber se acerta ou erra
	
	public Inimigo(String nome_Inimigo,int vida_Inimigo,int vidamax_Inimigo, int forca_Inimigo, int defesa_Inimigo,String tipo_Inimigo) {
		this.nome_Personagem = nome_Inimigo;
		this.vida_Personagem = vida_Inimigo;
		this.vidamax_Personagem = vidamax_Inimigo;
		this.forca_Inimigo = forca_Inimigo;
		this.defesa_Inimigo = defesa_Inimigo;
		this.classe_Personagem = tipo_Inimigo;
		this.nivel_Personagem = 1;
	}
	
	public Inimigo() {}

	public int getForca() {
		return forca_Inimigo;
	}

	public void setForca(int forca_Inimigo) {
		this.forca_Inimigo = forca_Inimigo;
	}

	public int getDefesa() {
		return defesa_Inimigo;
	}

	public void setDefesa(int defesa_Inimigo) {
		this.defesa_Inimigo = defesa_Inimigo;
	}


	@Override
	public int listarMagias() {
		return forca_Inimigo;
	}
	
	
	

}
