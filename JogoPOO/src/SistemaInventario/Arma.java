package SistemaInventario;

public class Arma extends Item{
	
	//atributos
	
	public double dano; //dano da arma
	
	//construtor
	
	public Arma(String nome_Item, String descricao_Item, double dano) {
		this.nome_Item = nome_Item;
		this.descricao_Item = descricao_Item;
		this.dano = dano;
	}
	
	public Arma() {}

	//getters and setters
	
	public double getDano() {
		return dano;
	}

	public void setDano(double dano) {
		this.dano = dano;
	}

}
