package SistemaInventario;

public class Inventario {
	//atributos
	public Item[] item;
	
	//construtor
	
	public Inventario (Item[] item) {
		item = this.item;
	}
	
	public Inventario () {}

	//getters and setters
	public Item[] getItem() {
		return item;
	}

	public void setItem(Item[] item) {
		this.item = item;
	}

	//metodos
	
	
}
