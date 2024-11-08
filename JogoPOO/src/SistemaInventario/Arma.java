package SistemaInventario;

public class Arma extends Item{
	
	//atributos
	
	public int dano;
	public String alcance;
	
	//construtor
	
	public Arma(String nome_Item, String descricao_Item, int dano, String alcance) {
		nome_Item = this.nome_Item;
		descricao_Item = this.descricao_Item;
		dano = this.dano;
		alcance = this.alcance;
	}
	
	public Arma() {}

	//getters and setters
	
	public int getDano() {
		return dano;
	}

	public void setDano(int dano) {
		this.dano = dano;
	}

	public String getAlcance() {
		return alcance;
	}

	public void setAlcance(String alcance) {
		this.alcance = alcance;
	}
	
	//metodo

}
