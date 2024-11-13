package SistemaInventario;

public class Armadura extends Item {
	
	//Atributos
	
	public int defesa;
	
	//Construtor
	
	public Armadura(String nome_Item, String descricao_Item ,int defesa) {
		this.nome_Item = nome_Item;
		this.descricao_Item = descricao_Item;
		this.defesa = defesa;
	}
	
	public Armadura() {}
	
	//Getters and Setters

	public int getDefesa() {
		return defesa;
	}

	public void setDefesa(int defesa) {
		this.defesa = defesa;
	}

	
	//Metodos

}
