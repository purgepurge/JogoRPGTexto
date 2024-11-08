package SistemaInventario;

public class Armadura extends Item {
	
	//Atributos
	
	public int defesa;
	public String tipo;
	
	//Construtor
	
	public Armadura(String nome_Item, String descricao_Item ,int defesa, String tipo) {
		nome_Item = this.nome_Item;
		descricao_Item = this.descricao_Item;
		defesa = this.defesa;
		tipo = this.tipo;
	}
	
	public Armadura() {}
	
	//Getters and Setters

	public int getDefesa() {
		return defesa;
	}

	public void setDefesa(int defesa) {
		this.defesa = defesa;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	//Metodos

}
