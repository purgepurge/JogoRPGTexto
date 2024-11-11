package SistemaDeCombate;

import Personagens.Personagem;

public class Inimigo extends Personagem{
	
	public int forca_Inimigo;
	public int defesa_Inimigo;
	
	public Inimigo(String nome_Inimigo,int vida_Inimigo,int vidamax_Inimigo, int forca_Inimigo, int defesa_Inimigo) {
		nome_Inimigo = this.nome_Personagem;
		vida_Inimigo = this.vida_Personagem;
		vidamax_Inimigo = this.vidamax_Personagem;
		forca_Inimigo = this.forca_Inimigo;
		defesa_Inimigo = this.defesa_Inimigo;
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
	public void usarMagia() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listarMagias() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void causarDano() {
		// TODO Auto-generated method stub
		
	}
	
	

}
