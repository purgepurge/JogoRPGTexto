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
		
		Inventario inventario = new Inventario();
		
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
		System.out.println("o taberneiro puxa a cadeira e se senta");
		System.out.println("Taberneiro: bem, se você não se importa gostaria de perguntar algumas coisas, pelas suas vestes vejo que não é um viajante comum,qual guilda você pertence?");
		System.out.println("1- Guilda Dos Guerreiros");
		System.out.println("2- Círculo dos Magos");
		System.out.println("3- Irmandade dos Exploradores (Ladino)");
		System.out.println("4- Legião dos Arqueiros");
		int escholaDialogo = scanner.nextInt();
		scanner.nextLine();
		if (escolhaDialogo == 1) {
			System.out.println("Guerreiros, suspeitei pelo seu porte fisico");
			System.out.println("e qual o seu nome?");
			String nomeJogador = scanner.nextLine();
			Guerreiro jogador = new Guerreiro(nomeJogador,18,18,inventario,1);
			jogador.exibirStatus();
		} else if (escolhaDialogo == 2) {
			System.out.println("Você faz parte do Círculo então, perdão minha ignorancia, devia ter notado seu foco arcano que você carrega");
			System.out.println("e qual o seu nome?");
			String nomeJogador = scanner.nextLine();
			Mago jogador = new Mago(nomeJogador,15,15,inventario,1);
			jogador.exibirStatus();
		} else if (escolhaDialogo == 3) {
			System.out.println("Um membro da irmandade, vocês são bem misteriosos");
			System.out.println("e qual o seu nome?");
			String nomeJogador = scanner.nextLine();
			Ladino jogador = new Ladino(nomeJogador,15,15,inventario,1);
			jogador.exibirStatus();
		}else {
			System.out.println("Taberneiro: um membro da Legião, melhores atiradores de todo o reino");
			System.out.println("Taberneiro: e qual o seu nome?");
			String nomeJogador = scanner.nextLine();
			Arqueiro jogador = new Arqueiro(nomeJogador,16,16,inventario,1);
			jogador.exibirStatus();
		}
		System.out.println("Taberneiro: então já que você faz parte de uma guilda você provavelmente ouviu falar do problema que enfrentamos no nosso vilarejo, veio nos ajudar?");
		System.out.println("1 - Isso, fui encarregado da missão de investigar o que está acontecendo de estranho nessa região");
		System.out.println("2 - (Mentir) para falar a verdade eu estou retornando de uma missão e tive que fazer um desvio por essa região");
		int escolhaDialogo1 = scanner.nextInt();
		scanner.nextLine();
		if (escolhaDialogo1 == 1) {
			System.out.println("Taberneiro: ótimo, abençoada seja a luz, as coisas por aqui estão ficando piores a cada dia");	
		}else {
			System.out.println("Taberneiro: então eu te peço, leve esta mensagem para seus superiores, ou se possível fique um pouco e nos ajude, o vilarejo está mal das pernas, mas podemos pagar se juntamos os restos das nossas economias");
		}
		System.out.println("Taberneiro: a 1 mês atrás uma terrível maldição assolou essa região, tudo que plantamos no solo acabou morrendo, até o próprio bosque que deu nome a esse vilarejo está aos poucos definhando, por conta disso só temos o que sobrou da ultima colheita nos armazéns, em algumas semanas precisaremos começar a racionar antes da chegada do inverno e ainda tenho minhas duvidas se conseguiremos ter o suficiente para todo o inverno.");
		if (Personagem.testesAmbiente() >= 10) {
			System.out.println("você passou no teste de natureza!");
			System.out.println("o inverno esse ano está previsto para começar no próximo mês, ao que tudo indica será um bem rigoroso já que no ano passado foi um inverno muito rápido");
		} else { System.out.println("Você falhou no teste de natureza");}
		
		System.out.println("Taberneiro: Alguns druidas chegaram semana passada, mas eles só nos ignoram, não nos dão nenhuma informação, temos um alquimista no vilarejo que pegou amostra dos solos, mas até então nada novo, lhe peço novamente que nos ajude");
		System.out.println("1- Ajudarei, assim que amanhecer, pois esta hora da noite não é sábio andar nesses bosques e provavelmente o alquimista deve estar descansando.");
		System.out.println("Infelizmente não posso fazer nada, mas levarei a mensagem a meus superiores");
		int escolhaDialogo2 = scanner.nextInt();
		scanner.nextLine();
		if (escolhaDialogo2 == 1) {
			System.out.println("Taberneiro= ótimo!!, vou deixar você descansar, aventureiro");
		}else {
			System.out.println("Você percebe o semblante da quebra de expectativa no rosto do taberneiro");
			System.out.println("Taberneiro: ah, ok, sem problemas, vou deixar você descansar, assim que você quiser pode ir para cama");
		}
		System.out.println("o taberneiro se levanta e vai em direção a cozinha, alguns poucos minutos você repara o silêncio que ficou ao redor, as únicas coisas que você consegue ouvir é o fogo crepitando no salão principal");
		System.out.println("o sono dessa vez veio rápido, você até estranha, sem sonhos, um momento você estava desacelerando seus pensamentos e no outro o quarto já está claro com a luz do sol, ao se levantar e olhar pela janela você percebe que há algo de estranho no amanhecer, o dia está nublado, com uma aparência de clima pesado, como você chegou a noite não tinha reparado, mas ao olhar no bosque ao contrario do que o nome sugere a vegetação está com um verde escuro, frio e com tom mórbido, mais um pouco e invés de bosque poderia ser reconhecido como pântano");
		
	}
}
