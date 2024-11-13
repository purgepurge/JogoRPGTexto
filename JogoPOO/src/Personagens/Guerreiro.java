package Personagens;

import java.util.Scanner;

import SistemaInventario.Arma;
import SistemaInventario.Armadura;
import SistemaInventario.Inventario;

public class Guerreiro extends Personagem{
	//Construtor
	public Guerreiro(String nome_Personagem,int vida_Personagem,int vidamax_Personagem, Inventario inventario_Personagem,int nivel_Personagem){
		this.nome_Personagem = nome_Personagem;
		this.vida_Personagem = vida_Personagem;
		this.vidamax_Personagem = vidamax_Personagem;
		this.inventario_Personagem = inventario_Personagem;
		this.nivel_Personagem = nivel_Personagem;
		this.scanner = new Scanner(System.in);
		this.classe_Personagem = "Guerreiro";
		this.arma = new Arma("Arma Inicial","Arma básica, utilizada pelos membros da guilda", 5);
		this.armadura =new Armadura("Armadura Inicial","Armadura básica, utilizada pelos membros da guilda", 10);
	}
	
	//Metodos
	public void usarRespiroDeVida() {//Magia de cura
		vida_Personagem += (1/4) * vidamax_Personagem;
		if (vida_Personagem > vidamax_Personagem) {
			vida_Personagem = vidamax_Personagem;
		}
		System.out.println("você respira profundamente e sente uma sensação de renovo, vida atual: "+ vida_Personagem);
	}
	
	public void usarAtaqueBrutal() {//Magia de dano
		arma.dano = 2*arma.dano;
		System.out.println("você se prepara para usar ataque devastador com toda a força do seu corpo");
		
	}
	
	public int listarMagias() {//Listar magias disponiveis
		System.out.println("Lista de magias");
		System.out.println("1 - Respiro de Vida");
		System.out.println("2 - Ataque Brutal");
		System.out.println("qual magia você quer usar?");
		int escolhaMagia = scanner.nextInt();
		if (escolhaMagia == 1) {
			usarRespiroDeVida();
		} else {
			usarAtaqueBrutal();
		}
		return escolhaMagia;
	}
	
}
