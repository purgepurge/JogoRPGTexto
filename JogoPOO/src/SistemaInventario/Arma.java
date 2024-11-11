package SistemaInventario;

public class Arma extends Item{
	
	//atributos
	
	public int dano;
	
	//construtor
	
	public Arma(String nome_Item, String descricao_Item, int dano) {
		nome_Item = this.nome_Item;
		descricao_Item = this.descricao_Item;
		dano = this.dano;
	}
	
	public Arma() {}

	//getters and setters
	
	public int getDano() {
		return dano;
	}

	public void setDano(int dano) {
		this.dano = dano;
	}

	
	
	//metodo

}
