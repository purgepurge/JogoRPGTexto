package SistemaInventario;

public class Arma extends Item{
	
	//atributos
	
	public int dano; //dano da arma
	
	//construtor
	
	public Arma(String nome_Item, String descricao_Item, int dano) {
		this.nome_Item = nome_Item;
		this.descricao_Item = descricao_Item;
		this.dano = dano;
	}
	
	public Arma() {}

	//getters and setters
	
	public int getDano() {
		return dano;
	}

	public void setDano(int dano) {
		this.dano = dano;
	}

}
