package SistemaInventario;

public abstract class Item {
	//atributos
	protected String nome_Item;
	protected String descricao_Item;
	
	//construtor
	
	public Item(String nome_Item, String descricao_Item) {
		this.nome_Item = nome_Item;
		this.descricao_Item = descricao_Item;
	}
	
	public Item() {}

	//Getters and Setters
	
	public String getNome_Item() {
		return nome_Item;
	}

	public void setNome_Item(String nome_Item) {
		this.nome_Item = nome_Item;
	}

	public String getDescricao_Item() {
		return descricao_Item;
	}

	public void setDescricao_Item(String descricao_Item) {
		this.descricao_Item = descricao_Item;
	}
	
	//metodos
	

}
