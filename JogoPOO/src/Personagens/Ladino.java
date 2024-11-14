package Personagens;

import java.util.Scanner;

import SistemaInventario.Arma;
import SistemaInventario.Armadura;
import SistemaInventario.Inventario;

public class Ladino extends Personagem{
	//Construtor
	public Ladino(String nome_Personagem,int vida_Personagem,int vidamax_Personagem, Inventario inventario_Personagem,int nivel_Personagem){
		this.nome_Personagem = nome_Personagem;
		this.vida_Personagem = vida_Personagem;
		this.vidamax_Personagem = vidamax_Personagem;
		this.inventario_Personagem = inventario_Personagem;
		this.nivel_Personagem = nivel_Personagem;
		this.scanner = new Scanner(System.in);
		this.classe_Personagem = "Ladino";
		this.arma = new Arma("Adaga Inicial","Arma básica, utilizada pelos membros da guilda", 5);
		this.armadura =new Armadura("Armadura Inicial","Armadura básica, utilizada pelos membros da guilda", 10);
	}
	
	//Metodos
	public void usarGolpeDasSombras() {//Magia de dano
		arma.dano = 2*arma.dano;
		System.out.println("você se cobre em sombras e desfere um ataque rápido e mortal nas costas do seu alvo");
	}
	
	public void usarFrascoRubro() {//Magia de cura
		vida_Personagem += (1/4) * vidamax_Personagem;
		if (vida_Personagem > vidamax_Personagem) {
			vida_Personagem = vidamax_Personagem;
		}
		System.out.println("Você utiliza da sua agilidade e seus reflexos aguçados para aumentar suas chance de esquivar, sua defesa atual: " + armadura.defesa);
	}

	public int listarMagias() { // Listar magias disponiveis
		System.out.println("Lista de magias");
		System.out.println("1 - Frasco Rubro");
		System.out.println("2 - Golpe das Sombras");
		System.out.println("qual magia você quer usar?");
		int escolhaMagia = scanner.nextInt();
		if (escolhaMagia == 1) {
			usarFrascoRubro();
		} else {
			usarGolpeDasSombras();
		}
		return escolhaMagia;
	}
	

}
