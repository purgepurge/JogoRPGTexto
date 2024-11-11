package Personagens;

import java.util.Scanner;

import SistemaInventario.Arma;
import SistemaInventario.Armadura;
import SistemaInventario.Inventario;

public class Ladino extends Personagem{
	
	public Ladino(String nome_Personagem,int vida_Personagem,int vidamax_Personagem, Inventario[] inventario_Personagem,int nivel_Personagem){
		nome_Personagem = this.nome_Personagem;
		vida_Personagem = this.vida_Personagem;
		vidamax_Personagem = this.vidamax_Personagem;
		inventario_Personagem = this.inventario_Personagem;
		nivel_Personagem = this.nivel_Personagem;
		this.scanner = new Scanner(System.in);
	}
	
	
	public static void usarGolpeDasSombras(Arma arma) {
		arma.dano = 2*arma.dano;
		System.out.println("você se cobre em sombras e desfere um ataque rápido e mortal nas costas do seu alvo causando: " + arma.dano + " de dano");
	}
	
	public void usarEvasao(Armadura armadura) {
		armadura.defesa = (1/2) * armadura.defesa;
		System.out.println("Você utiliza da sua agilidade e seus reflexos aguçados para aumentar suas chance de esquivar, sua defesa atual: " + armadura.defesa);
	}

	public void listarMagias() {
		System.out.println("Lista de magias");
		System.out.println("1 - Golpe das Sombras");
		System.out.println("2 - Evasão");
		System.out.println("qual magia você quer usar?");
		int escolhaMagia = scanner.nextInt();
		if (escolhaMagia == 1) {
			usarGolpeDasSombras(null);
		} else {
			usarEvasao(null);
		}
	}
	
	
	@Override
	public void usarMagia() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void causarDano() {
		// TODO Auto-generated method stub
		
	}

}
