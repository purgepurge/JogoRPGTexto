package SistemaInventario;

public class Pocao extends Item{
	
	//atributos
	
	public static int restauracao_Pocao;
	public int quantidade_Pocao;
	
	//construtor
	
	public Pocao(String nome_Item,String descricao_Item, int restauracao) {
		Pocao.restauracao_Pocao = restauracao;
		this.nome_Item = nome_Item;
		this.descricao_Item = descricao_Item;
	}
	
	public Pocao() {}
	
	//getters and setters
	
	public int getRestauracao() {
		return restauracao_Pocao;
	}

	public void setRestauracao(int restauracao) {
		Pocao.restauracao_Pocao = restauracao;
	}
	
	//metodos
	
	public static void beberPocao(int vida_Personagem, int vidamax_Personagem) {
		vida_Personagem += restauracao_Pocao;
		if (vida_Personagem > vidamax_Personagem) {
			vida_Personagem = vidamax_Personagem;
			}
		System.out.println("você restaurou: "+restauracao_Pocao+ "sua vida atual é: "+vida_Personagem);
		
	}
}
