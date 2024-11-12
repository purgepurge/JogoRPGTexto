package SistemaInventario;

public class Armadura extends Item {
	
	//Atributos
	
	public int defesa;
	
	//Construtor
	
	public Armadura(String nome_Item, String descricao_Item ,int defesa) {
		nome_Item = this.nome_Item;
		descricao_Item = this.descricao_Item;
		defesa = this.defesa;
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
