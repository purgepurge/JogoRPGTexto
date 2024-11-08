package rpgtexto;

public class Ambiente {
	//atributos
	public String nome_Ambiente;
	public String descricao_Ambiente;
	
	//construtor
	
	public Ambiente(String nome_Ambiente, String descricao_Ambiente) {
		nome_Ambiente = this.nome_Ambiente;
		descricao_Ambiente = this.descricao_Ambiente;
	}
	
	public Ambiente() {}

	//getters and setters
	public String getNome_Ambiente() {
		return nome_Ambiente;
	}

	public void setNome_Ambiente(String nome_Ambiente) {
		this.nome_Ambiente = nome_Ambiente;
	}

	public String getDescricao_Ambiente() {
		return descricao_Ambiente;
	}

	public void setDescricao_Ambiente(String descricao_Ambiente) {
		this.descricao_Ambiente = descricao_Ambiente;
	}
	
	//metodos

}
