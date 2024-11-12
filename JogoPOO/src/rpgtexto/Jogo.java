package rpgtexto;

import Personagens.Guerreiro;

import java.util.Scanner;

import Personagens.Arqueiro;
import Personagens.Ladino;
import Personagens.Mago;
import Personagens.NPC;
import Personagens.Personagem;
import SistemaAmbiente.Taverna;
import SistemaAmbiente.Ambiente;
import SistemaDeCombate.Combate;
import SistemaDeCombate.Inimigo;
import SistemaInventario.Arma;
import SistemaInventario.Armadura;
import SistemaInventario.Inventario;
import SistemaInventario.Item;
import SistemaInventario.Pocao;




public class Jogo {
	

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Ambiente.prologo();
		Ambiente taverna = new Taverna();
		
		taverna.exibirDescricao();
		System.out.println("Taberneiro: Seja bem vindo! que bom ver um rosto novo por essas bandas, se quiser tenho quartos vagos com uma cama confortável ou se quiser comer e beber alguma coisa antes.");
		System.out.println("1 - Aceito a refeição");
		System.out.println("2 - Quero um quarto");
		int escolhaDialogo = scanner.nextInt();
		if (escolhaDialogo == 1) {
			System.out.println("Enquanto você se senta na mesa, o taberneiro vai em direção a cozinha, você começa a reparar mais as outras pessoas, você percebe que elas tem um 				semblante triste ou abatidas, aparentemente as coisas não andam muito boas nesse vilarejo, poucos minutos depois o taberneiro retorna com uma bandeja");
			System.out.println("Taberneiro: Aqui a especialidade da casa, Guisado de Pato");
			System.out.println("O prato faz jus ao seu nome, você consegue ver os vegetais e os pedaços de pato no caldo do guisado, e após a primeira colherada você já consegue sentir suas forças se renovando, afinal até então fazia dias que você só comia ração de viagem, já até sentia saudade de uma comida de verdade");
		}else {
			System.out.println("Taberneiro: Claro, vejo que o cansaço está maior do que a fome, venha vou lhe mostrar o caminho");
			System.out.println("Você se dirige a um pequeno quarto, está mais limpo do que você esperava, você repara que tem uma mesa simples com uma vela acesa e uma cadeira, você coloca sua mochila nela, a cama bem humilde forrada com peles e feita de feno, não é muito, mas bem melhor do que dormir no chão na floresta tendo que se proteger de insetos, você repara na janela que tem em cima da cama e ver que é uma noite de lua cheia");
			System.out.println("Taberneiro: Sei que você está sem fome, mas vou deixar como agrado por ser o primeiro visitante do vilarejo a algumas semanas");
			System.out.println("você repara que o taberneiro colocou alguns bolos de maçã na mesa ao lado da vela");	
		}
	}

}
