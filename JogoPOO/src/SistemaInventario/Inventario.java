package SistemaInventario;

public class Inventario {
	//atributos
	public Item[] item;
	private int quantidadeAtual;
	
	//construtor

	public Inventario () {
		this.item = new Item[20];
		this.quantidadeAtual = 0;
	}

	//getters and setters
	public Item[] getItem() {
		return item;
	}

	public void setItem(Item[] item) {
		this.item = item;
	}

	public int getQuantidadeAtual() {
		return quantidadeAtual;
	}

	public void setQuantidadeAtual(int quantidadeAtual) {
		this.quantidadeAtual = quantidadeAtual;
	}

	//Métodos
	
	// Método para adicionar um item ao inventário
    public void adicionarItem(Item item1) {
        if (quantidadeAtual < item.length) {
            item[quantidadeAtual] = item1;
            quantidadeAtual++;
            System.out.println(item1.getNome_Item() + " foi adicionado ao inventário.");
        } else {
            System.out.println("O inventário está cheio! Não é possível adicionar " + item1.getNome_Item() + ".");
        }
    }
    
    //Método para exibir os itens no inventário
    public void exibirInventario() {
        if (quantidadeAtual == 0) {
            System.out.println("O inventário está vazio.");
        } else {
            System.out.println("Itens no inventário:");
            for (int i = 0; i < quantidadeAtual; i++) {
                System.out.println((i + 1) + ". " + item[i].nome_Item + " - " + item[i].getDescricao_Item());
            }
        }
    }
    
    //Método para remover um item do inventário
    public void removerItem(int index) {
        if (index >= 0 && index < quantidadeAtual) {
            System.out.println(item[index].nome_Item + " foi removido do inventário.");
            // Move os itens para a esquerda no array
            for (int i = index; i < quantidadeAtual - 1; i++) {
                item[i] = item[i + 1];
            }
            item[quantidadeAtual - 1] = null; // Remove a referência no final
            quantidadeAtual--;
        } else {
            System.out.println("Índice inválido. Não foi possível remover o item.");
        }
    }

}
