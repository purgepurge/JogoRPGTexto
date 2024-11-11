package Personagens;

import java.util.Scanner;

import SistemaInventario.Arma;
import SistemaInventario.Inventario;
import SistemaInventario.Pocao;

public abstract class Personagem {
	
	//atributos
	
	public String nome_Personagem; //define o nome do personagem
	public String classe_Personagem;//define a classe do personagem
	public int vida_Personagem;//define a vida do personagem
	public int vidamax_Personagem;//define a vida maxima do personagem
	public Inventario[] inventario_Personagem = new Inventario[20]; // inventorio do personagem
	public int nivel_Personagem;// nivel do personagem
	public Arma arma = new Arma("Arma Inicial","Arma básica, utilizada pelos membros de uma guilda de classe", 3);
	public Scanner scanner;
	
	
	
	//construtores
	
	public Personagem(String nome_Personagem, String classe_Personagem, int vida_Personagem,int vidamax_Personagem, Inventario[] inventario_Personagem, int nivel_Personagem) {
		nome_Personagem = this.nome_Personagem;
		classe_Personagem = this.classe_Personagem;
		vida_Personagem = this.vida_Personagem;
		vidamax_Personagem = this.vidamax_Personagem;
		inventario_Personagem = this.inventario_Personagem;
		nivel_Personagem = this.nivel_Personagem;
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

	public Inventario[] getInventario_Personagem() {
		return inventario_Personagem;
	}

	public void setInventario_Personagem(Inventario[] inventario_Personagem) {
		this.inventario_Personagem = inventario_Personagem;
	}
	
	//metodos
	
	public abstract void usarMagia(); //metodo abstrato que vai ser usado para as classes filhas utilizarem magia
	
	public void exibirStatus() { //metodo que mostra informações do personagem
		System.out.println("Nome: "+ nome_Personagem);
		System.out.println("Classe: "+ classe_Personagem);
		System.out.println("Vida atual: "+ vida_Personagem);
		System.out.println("Nivel: "+ nivel_Personagem);
		
	}
	
	public void receberDano (int forca_Inimigo) {// metodo para fazer o personagem jogavel receber dano do inimigo
		vida_Personagem -= forca_Inimigo;
		if (vida_Personagem < 0)  vida_Personagem = 0;
		System.out.println(nome_Personagem + " recebeu " + forca_Inimigo + " de dano. Vida restante: " + vida_Personagem);
		
	}
	
	public void listarInventario() {
		for (Inventario item : inventario_Personagem ) {
			System.out.println(item);
		}
	}

	public abstract void listarMagias();

	public abstract void causarDano();

	
	

}
