package Personagens;

import java.util.Scanner;

import SistemaInventario.Inventario;

public class Guerreiro extends Personagem{
	
	public Guerreiro(String nome_Personagem,int vida_Personagem,int vidamax_Personagem, Inventario inventario_Personagem,int nivel_Personagem){
		this.nome_Personagem = nome_Personagem;
		this.vida_Personagem = vida_Personagem;
		this.vidamax_Personagem = vidamax_Personagem;
		this.inventario_Personagem = inventario_Personagem;
		this.nivel_Personagem = nivel_Personagem;
		this.scanner = new Scanner(System.in);
		this.classe_Personagem = "Guerreiro";
	}
	
	
	public void usarRespiroDeVida() {
		vida_Personagem += (1/4) * vidamax_Personagem;
		if (vida_Personagem > vidamax_Personagem) {
			vida_Personagem = vidamax_Personagem;
		}
		System.out.println("você respira profundamente e sente uma sensação de renovo, vida atual: "+ vida_Personagem);
	}
	
	public void usarAtaqueBrutal() {
		arma.dano = 2*arma.dano;
		System.out.println("você se prepara para usar ataque devastador com toda a força do seu corpo");
		
	}
	
	public int listarMagias() {
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
