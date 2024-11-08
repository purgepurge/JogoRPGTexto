package SistemaInventario;

public class Pocao extends Item{
	
	//atributos
	
	public int restauracao_Pocao;
	public int quantidade_Pocao;
	
	//construtor
	
	public Pocao(String nome_Item,String descricao_Item, int restauracao) {
		restauracao = this.restauracao_Pocao;
		nome_Item = this.nome_Item;
		descricao_Item = this.descricao_Item;
	}
	
	public Pocao() {}
	
	//getters and setters
	
	public int getRestauracao() {
		return restauracao_Pocao;
	}

	public void setRestauracao(int restauracao) {
		this.restauracao_Pocao = restauracao;
	}
	
	//metodos
	
	public void beberPocao(int vida_Personagem, int vidamax_Personagem) {
		vida_Personagem += restauracao_Pocao;
		if (vida_Personagem > vidamax_Personagem) {
			vida_Personagem = vidamax_Personagem;
			}
		System.out.println("você restaurou: "+restauracao_Pocao+ "sua vida atual é: "+vida_Personagem);
		
	}
}
