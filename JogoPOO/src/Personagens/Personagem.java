package Personagens;

import java.util.Scanner;

import SistemaInventario.Arma;
import SistemaInventario.Armadura;
import SistemaInventario.Inventario;
import SistemaInventario.Pocao;

public abstract class Personagem {
	
	//atributos
	
	public String nome_Personagem; //define o nome do personagem
	public String classe_Personagem;//define a classe do personagem
	public int vida_Personagem;//define a vida do personagem
	public int vidamax_Personagem;//define a vida maxima do personagem
	public Inventario inventario_Personagem = new Inventario(); // inventorio do personagem
	public int nivel_Personagem;// nivel do personagem
	public Arma arma;
	public Armadura armadura;
	public Scanner scanner;
	
	
	
	//construtores
	
	public Personagem(String nome_Personagem, String classe_Personagem, int vida_Personagem,int vidamax_Personagem, Inventario inventario_Personagem, int nivel_Personagem) {
		this.nome_Personagem = nome_Personagem;
		this.classe_Personagem = classe_Personagem;
		this.vida_Personagem = vida_Personagem;
		this.vidamax_Personagem = vidamax_Personagem;
		this.inventario_Personagem = inventario_Personagem;
		this.nivel_Personagem = nivel_Personagem;
		this.arma = new Arma("Arma Inicial","Arma básica, utilizada pelos membros da guilda", 3);
		this.armadura = new Armadura("Armadura Inicial","Armadura básica, utilizada pelos membros da guilda", 10); 
	}
	
	public Personagem() {}

	//getters and setters
	
	public String getNome_Personagem() {
		return nome_Personagem;
	}

	public void setNome_Personagem(String nome_Personagem) {
		this.nome_Personagem = nome_Personagem;
	}

	public String getClasse_Personagem() {
		return classe_Personagem;
	}

	public void setClasse_Personagem(String classe_Personagem) {
		this.classe_Personagem = classe_Personagem;
	}

	public int getVida_Personagem() {
		return vida_Personagem;
	}

	public void setVida_Personagem(int vida_Personagem) {
		this.vida_Personagem = vida_Personagem;
	}

	public Inventario getInventario_Personagem() {
		return inventario_Personagem;
	}

	public void setInventario_Personagem(Inventario inventario_Personagem) {
		this.inventario_Personagem = inventario_Personagem;
	}
	
	//metodos
	
	public void exibirStatus() { //metodo que mostra informações do personagem
		System.out.println("Nome: "+ nome_Personagem);
		System.out.println("Classe: "+ classe_Personagem);
		System.out.println("Vida atual: "+ vida_Personagem);
		System.out.println("Nivel: "+ nivel_Personagem);
		System.out.println("Arma atual: "+arma.getNome_Item());
		System.out.println("Armadura atual: "+armadura.getNome_Item());
		
	}
		
	
	public static int testesAmbiente () {
		int resultadoTeste = (int) (Math.random() * 20) + 1; // Gera um número entre 1 e 20
		return resultadoTeste;
	}
	

	public abstract int listarMagias();

	

	
	

}
