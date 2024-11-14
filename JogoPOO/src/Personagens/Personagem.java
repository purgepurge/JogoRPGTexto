package Personagens;

import java.util.Scanner;

import SistemaInventario.Arma;
import SistemaInventario.Armadura;
import SistemaInventario.Inventario;
import SistemaInventario.Pocao;

public abstract class Personagem {
	
	//atributos
	
	protected String nome_Personagem; //define o nome do personagem
	protected String classe_Personagem;//define a classe do personagem
	public int vida_Personagem;//define a vida do personagem
	protected int vidamax_Personagem;//define a vida maxima do personagem
	protected Inventario inventario_Personagem = new Inventario(); // inventorio do personagem
	protected int nivel_Personagem;// nivel do personagem
	protected Arma arma;//Objeto que indica a arma equipada no personagem
	protected Armadura armadura;//Objeto que indica a Armadura equipada no personagem
	protected Scanner scanner;
	
	
	
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
		if (vida_Personagem >= 0) {
	        this.vida_Personagem = vida_Personagem;
	    } else {
	        System.out.println("A vida não pode ser negativa!");
	    }
	}

	public Inventario getInventario_Personagem() {
		return inventario_Personagem;
	}

	public void setInventario_Personagem(Inventario inventario_Personagem) {
		this.inventario_Personagem = inventario_Personagem;
	}
		
	public int getVidamax_Personagem() {
		return vidamax_Personagem;
	}

	public void setVidamax_Personagem(int vidamax_Personagem) {
		this.vidamax_Personagem = vidamax_Personagem;
	}

	public int getNivel_Personagem() {
		return nivel_Personagem;
	}

	public void setNivel_Personagem(int nivel_Personagem) {
		this.nivel_Personagem = nivel_Personagem;
	}

	public Arma getArma() {
		return arma;
	}

	public void equiparArma(Arma arma) {
		this.arma = arma;
	}

	public Armadura getArmadura() {
		return armadura;
	}

	public void equiparArmadura(Armadura armadura) {
		this.armadura = armadura;
	}

	public Scanner getScanner() {
		return scanner;
	}

	public void setScanner(Scanner scanner) {
		this.scanner = scanner;
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
		
	
	public static int testesAmbiente () {//Metodo que serve para o personagem fazer rolagem de dados (testes de percepção, natureza, agilidade etc.)
		int resultadoTeste = (int) (Math.random() * 20) + 1; // Gera um número entre 1 e 20
		return resultadoTeste;
	}
	

	public abstract int listarMagias();//Metodo abstrato que suas classes filhas usaram para listar magias

	

	
	

}
