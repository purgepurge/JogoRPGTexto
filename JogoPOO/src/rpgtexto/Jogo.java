package rpgtexto;

import Personagens.Guerreiro;
import java.util.Scanner;
import Personagens.Arqueiro;
import Personagens.Ladino;
import Personagens.Mago;
import Personagens.Personagem;
import SistemaAmbiente.Taverna;
import SistemaAmbiente.Ambiente;
import SistemaAmbiente.CasaAlquimista;
import SistemaDeCombate.Combate;
import SistemaDeCombate.Inimigo;
import SistemaInventario.Arma;
import SistemaInventario.Armadura;
import SistemaInventario.Inventario;
import SistemaInventario.Pocao;

public class Jogo {
	public static void main(String[] args) {
		
		Inventario inventario = new Inventario();
		Personagem jogador = null;
		Pocao pocao = new Pocao("poção pequena","poção simples, para ferimentos leves", 6);
		Scanner scanner = new Scanner(System.in);
		//Prologo
		Ambiente.prologo();
		//Inicio do primeiro Ato, introdução ao vilarejo e criação do personagem
		Ambiente taverna = new Taverna();
		taverna.exibirDescricao();
		System.out.println("Taberneiro: Seja bem vindo! que bom ver um rosto novo por essas bandas, se quiser tenho quartos vagos com uma cama confortável ou se quiser comer e beber alguma coisa\nantes.\n");
		System.out.println("1 - Aceito a refeição");
		System.out.println("2 - Quero um quarto");
		int escolhaDialogo0 = scanner.nextInt();
		if (escolhaDialogo0 == 1) {
			System.out.println("Enquanto você se senta na mesa, o taberneiro vai em direção a cozinha, você começa a reparar mais as outras pessoas, você percebe que elas tem um semblante triste ou\nabatidas, aparentemente as coisas não andam muito boas nesse vilarejo, poucos minutos depois o taberneiro retorna com uma bandeja\n");
			System.out.println("Taberneiro: Aqui a especialidade da casa, Guisado de Pato\n");
			System.out.println("O prato faz jus ao seu nome, você consegue ver os vegetais e os pedaços de pato no caldo do guisado, e após a primeira colherada você já consegue sentir suas forças se\nrenovando, afinal até então fazia dias que você só comia ração de viagem, já até sentia saudade de uma comida de verdade\n");
		}else {
			System.out.println("Taberneiro: Claro, vejo que o cansaço está maior do que a fome, venha vou lhe mostrar o caminho\n");
			System.out.println("Você se dirige a um pequeno quarto, está mais limpo do que você esperava, você repara que tem uma mesa simples com uma vela acesa e uma cadeira, você coloca sua mochila\nnela, a cama bem humilde forrada com peles e feita de feno, não é muito, mas bem melhor do que dormir no chão na floresta tendo que se proteger de insetos, você repara na janela que tem em cima da cama e ver que é uma noite de lua cheia\n");
			System.out.println("Taberneiro: Sei que você está sem fome, mas vou deixar como agrado por ser o primeiro visitante do vilarejo a algumas semanas\n");
			System.out.println("você repara que o taberneiro colocou alguns bolos de maçã na mesa ao lado da vela\n");	
		}
		//criação do personagem a partir da escolha da classe
		System.out.println("o taberneiro puxa a cadeira e se senta\n");
		System.out.println("Taberneiro: bem, se você não se importa gostaria de perguntar algumas coisas, pelas suas vestes vejo que não é um viajante comum,qual guilda você pertence?\n");
		System.out.println("1- Guilda Dos Guerreiros");
		System.out.println("2- Círculo dos Magos");
		System.out.println("3- Irmandade dos Exploradores (Ladino)");
		System.out.println("4- Legião dos Arqueiros");
		int escolhaDialogo1 = scanner.nextInt();
		scanner.nextLine();
		if (escolhaDialogo1 == 1) {
			System.out.println("Guerreiros, suspeitei pelo seu porte fisico\n");
			System.out.println("e qual o seu nome?");
			String nomeJogador = scanner.nextLine();
			System.out.println("");
			jogador = new Guerreiro(nomeJogador,18,18,inventario,1);
			jogador.exibirStatus();
			System.out.println("");
		} else if (escolhaDialogo1 == 2) {
			System.out.println("Você faz parte do Círculo então, perdão minha ignorancia, devia ter notado seu foco arcano que você carrega\n");
			System.out.println("e qual o seu nome?");
			String nomeJogador = scanner.nextLine();
			System.out.println("");
			jogador = new Mago(nomeJogador,15,15,inventario,1);
			jogador.exibirStatus();
			System.out.println("");
		} else if (escolhaDialogo1 == 3) {
			System.out.println("Um membro da irmandade, vocês são bem misteriosos\n");
			System.out.println("e qual o seu nome?");
			String nomeJogador = scanner.nextLine();
			System.out.println("");
			jogador = new Ladino(nomeJogador,15,15,inventario,1);
			jogador.exibirStatus();
			System.out.println("");
		}else {
			System.out.println("Taberneiro: um membro da Legião, melhores atiradores de todo o reino\n");
			System.out.println("Taberneiro: e qual o seu nome?");
			String nomeJogador = scanner.nextLine();
			System.out.println("");
			jogador = new Arqueiro(nomeJogador,16,16,inventario,1);
			jogador.exibirStatus();
			System.out.println("");
		}
		System.out.println("Taberneiro: então já que você faz parte de uma guilda você provavelmente ouviu falar do problema que enfrentamos no nosso vilarejo, veio nos ajudar?\n");
		System.out.println("1 - Isso, fui encarregado da missão de investigar o que está acontecendo de estranho nessa região");
		System.out.println("2 - (Mentir) para falar a verdade eu estou retornando de uma missão e tive que fazer um desvio por essa região");
		int escolhaDialogo2 = scanner.nextInt();
		scanner.nextLine();
		if (escolhaDialogo2 == 1) {
			System.out.println("Taberneiro: ótimo, abençoada seja a luz, as coisas por aqui estão ficando piores a cada dia\n");	
		}else {
			System.out.println("Taberneiro: então eu te peço, leve esta mensagem para seus superiores, ou se possível fique um pouco e nos ajude, o vilarejo está mal das pernas, mas podemos pagar se \njuntamos os restos das nossas economias\n");
		}
		System.out.println("Taberneiro: a 1 mês atrás uma terrível maldição assolou essa região, tudo que plantamos no solo acabou morrendo, até o próprio bosque que deu nome a esse vilarejo está\naos poucos definhando, por conta disso só temos o que sobrou da ultima colheita nos armazéns, em algumas semanas precisaremos começar a racionar antes da chegada do\ninverno e ainda tenho minhas duvidas se conseguiremos ter o suficiente para todo o inverno.\n");
		System.out.println("-----Teste de Natureza!-----");
		int resultadoTeste1 = Personagem.testesAmbiente();
		if (resultadoTeste1 >= 10) {
			System.out.println("você passou no teste de natureza! "+resultadoTeste1+"/10\n");
			System.out.println("o inverno esse ano está previsto para começar no próximo mês, ao que tudo indica será um bem rigoroso já que no ano passado foi um inverno muito rápido\n");
		} else { 
			System.out.println("Você falhou no teste de natureza! "+resultadoTeste1+"10\n");
		}
		System.out.println("Taberneiro: Alguns druidas chegaram semana passada, mas eles só nos ignoram, não nos dão nenhuma informação, temos um alquimista no vilarejo que pegou amostra dos solos,\nmas até então nada novo, ele mora na parte norte do vilarejo, lhe peço novamente que nos ajude\n");
		System.out.println("1- Ajudarei, assim que amanhecer, pois esta hora da noite não é sábio andar nesses bosques e provavelmente o alquimista deve estar descansando.");
		System.out.println("2- Infelizmente não posso fazer nada, mas levarei a mensagem a meus superiores");
		int escolhaDialogo3 = scanner.nextInt();
		scanner.nextLine();
		if (escolhaDialogo3 == 1) {
			System.out.println("Taberneiro= ótimo!!, vou deixar você descansar, aventureiro\n");
		}else {
			System.out.println("Você percebe o semblante da quebra de expectativa no rosto do taberneiro\n");
			System.out.println("Taberneiro: ah, ok, sem problemas, vou deixar você descansar, assim que você quiser pode ir para cama\n");
		}
		System.out.println("o taberneiro se levanta e vai em direção a cozinha, alguns poucos minutos você repara o silêncio que ficou ao redor, as únicas coisas que você consegue ouvir é o fogo\ncrepitando no salão principal\n");
		System.out.println("o sono dessa vez veio rápido, você até estranha, sem sonhos, um momento você estava desacelerando seus pensamentos e no outro o quarto já está claro com a luz do sol,\nao se levantar e olhar pela janela você percebe que há algo de estranho no amanhecer, o dia está nublado, com uma aparência de clima pesado, como você chegou a noite\nnão tinha reparado, mas ao olhar no bosque ao contrario do que o nome sugere a vegetação está com um verde escuro, frio e com tom mórbido, mais um pouco e invés de\nbosque poderia ser reconhecido como pântano\n");
		System.out.println("você pega suas coisas e sai do quarto, a lareira no centro da taverna já está apagada, o taverneiro aparentemente está na cozinha ou no seu quarto ainda, você se dirige\nao balcão e deixa algumas moedas de ouro para pagar pela comida e pelo quarto e se prepara para sair da taverna\n");
		System.out.println("1 - Ir para a casa do alquimista");
		System.out.println("2 - Ir de encontro aos druidas (não implementado ainda)");
		System.out.println("3 - Ir embora do vilarejo");
		int escolhaDialogo4 = scanner.nextInt();
		scanner.nextLine();
		if (escolhaDialogo4 == 1) {
			// 2 Ato parte A
			System.out.println("você se dirige até a parte norte do vilarejo para se encontra com o alquimista, seguindo as direções do Taberneiro, com o clima pesado do dia você nota que o vilarejo\nestá transmitindo um baixo astral, mas quando os aldeões notam que você é um aventureiro alguns conseguem demostrar um pouco de esperança.\n");
			System.out.println("-----Teste de Percepção dificuldade 10!/n");
			int resultadoTeste2 = Personagem.testesAmbiente();
			if (resultadoTeste2 >= 10) {
				System.out.println("Você passou no teste de percepção!"+resultadoTeste2+"/10\n");
				System.out.println("porém você também percebeu que alguns aldeões estão te encarando de forma estranha e sussurrando entre si e eles não aparentam ter uma boa intenção.\n");
			}else {
				System.out.println("Você falhou no teste de percepção!"+resultadoTeste2+"/10\n");
			}
			System.out.println("você tem 2 opções de caminho, pode ir pela praça principal que é o caminho mais longo, ou pode tentar ir pelo beco entre 2 casas para cortar caminho\n");
			System.out.println("1- Ir pela praça central");
			System.out.println("2- Ir pelo beco");
			int escolhaDialogo5 = scanner.nextInt();
			scanner.nextLine();
			if (escolhaDialogo5 == 1) {
				System.out.println("Você decide ir pela praça central, mesmo estando de dia a praça está pouca movimentada, provavelmente devido a situação que o vilarejo se encontra.\n");
				System.out.println("Logo após a praça você consegue avistar de longe um armazém que provavelmente está armazenado os suprimentos que restaram para durar o inverno, ao se aproximar você\npercebe uma movimentação estranha, a tranca parece ter sido arrombada e você consegue ouvir barulhos do lado de dentro.\n");
				System.out.println("Ao abrir a porta lentamente você percebe um homem de estatura media colocando alimentos dentro de um saco, porém ele parece está muito nervoso e não aparenta ser o\nresponsável pelo armazém.\n");
				System.out.println("O homem percebeu a sua presença e ao deixar a sacola cair, puxa uma adaga e aponta em sua direção.\n");
				System.out.println("Bandido: Eu vi você ai cretino, nunca ouviu falar que a curiosidade matou o gato? Agora não posso deixar você ir embora e me denunciar\n");
				System.out.println("1- Roubar comida do vilarejo em uma situações dessa, deveria se envergonhar");
				System.out.println("2- Se você deixar o que está roubando no chão, largar essa adaga e ir embora eu não vou contar aos responsáveis e você vai ter uma chance de redenção.");
				int escolhaDialogo6 = scanner.nextInt();
				scanner.nextLine();
				if (escolhaDialogo6 == 1) {
					System.out.println("Bandido: Inventaram isso de racionar comida invés de procurarem um jeito de resolver isso, agora tenho uma mulher doente e 1 filha para alimentar, mesmo abrindo\nmão da minha porção não vai dar conta, então vim aqui pegar mais para estocar\n");
				}else {
					System.out.println("Bandido: Inventaram isso de racionar comida invés de procurarem um jeito de resolver isso, agora tenho uma mulher doente e 1 filha para alimentar, mesmo abrindo\nmão da minha porção não vai dar conta, então vim aqui pegar mais para estocar\n");
				}
				System.out.println("Bandido: não vou embora e nem vou deixar você sair daqui!");
				Inimigo bandido1 = new Inimigo ("Bandido",20,20,3,6,"Humanoide");
				Combate combate1 = new Combate (jogador, bandido1);
				combate1.iniciarCombate(jogador, bandido1);
				if (jogador.getVida_Personagem() <=0) {System.out.println("--------------------Gamer Over--------------------");}
				System.out.println("\nO bandido cai bastante ferido, mas vivo\n");
				System.out.println("1- Vá embora daqui e nunca mais tente roubar novamente, talvez o proximo não tenha misericordia");
				System.out.println("2- Arrastar ele para fora do armazém e expor para a população");
				int escolhaDialogo7 = scanner.nextInt();
				scanner.nextLine();
				if (escolhaDialogo7 == 1) {
					System.out.println("Bandido: Obrigado pela misericordia senhor, não sei onde estava com a cabeça\n");
					System.out.println("O bandido sai bastante machucado do Armazém, deixando a adaga e os pertences que tentou roubar\n");
				}else {
					System.out.println("Você arrasta o bandido para fora do armazém, o som da briga chamou atenção de algumas pessoas, você coloca o bandido no chão e explica todo o ocorrido\n");
					System.out.println("Os aldeões pegam o bandido e prometem levar ele até as autoridades do vilarejo para ele receber a devida punição\n");
				}
				System.out.println("Você volta a seguir caminho até a casa do alquimista\n");
			}else {
				System.out.println("Você segue pelo beco que aparenta está calmo e deserto, quando você começa a atravessar percebe que na verdade está sendo seguido.\n");
				System.out.println("Você não sabe dizer de onde veio, mas atrás de você aparece um homem mal encarado empunhando uma adaga em cada mão, logo atrás de você mais 2 homens fazem uma barreira impedindo de sair.\n");
				System.out.println("Bandido: um viajante por aqui, vejo que você faz parte de uma guilda, então sempre deve viajar para missões, que tal você compartilhar um pouco desse seu ouro, ai podemos deixar você passear em paz pela cidade\n");
				System.out.println("1- Não vou pagar pedágio para bandidos.");
				System.out.println("2- Que tal fazemos o seguinte: Você me deixa passar e eu vou fingir que não vi vocês.");
				System.out.println("3- Um inseto como você que se aproveita da situação difícil que o vilarejo está passando querendo me intimidar?");
				int escolhaDialogo8 = scanner.nextInt();
				scanner.nextLine();
				if (escolhaDialogo8 == 1) {
					System.out.println("Bandido: Tentamos fazer isso de forma civilizada, então vou tomar a força!\n");
				}else if (escolhaDialogo8 == 2) {
					System.out.println("Bandido: Uma oferta muito fraca, afinal precisamos de ouro para conseguir sobreviver por aqui, então que tal pegar a força?\n");
				}else {
					System.out.println("Bandido: huahuahua, o viajante quer dar uma de bravo, de herói, vou lhe ensinar como as coisas funcionam por aqui\n");
				}
				Inimigo bandido1 = new Inimigo("Bandido",20,20,3,6,"Humanoide");
				Combate combate1 = new Combate (jogador, bandido1);
				combate1.iniciarCombate(jogador, bandido1);
				if (jogador.getVida_Personagem() <=0) {System.out.println("--------------------Gamer Over--------------------");}
				System.out.println("\nO brutamontes cai no chão desacordado, quando você olha para trás os que estavam impedindo a passagem sairam correndo quando viram o resultado\n");
				System.out.println("Você deixa o bandido no chão desacordado mesmo e continua seu trajeto até a casa do alquimista\n");	
			}
			Ambiente casadoalquimista = new CasaAlquimista();
			casadoalquimista.exibirDescricao();
			System.out.println("Sem levantar o olhar, ele percebe sua presença.\n");
			System.out.println("Alquimista: Ah, aventureiro... seja bem-vindo. Desculpe a bagunça, como pode ver, estou... ocupado.\n");
			System.out.println("Ele gesticula vagamente para a mesa, onde várias amostras de solo estão dispostas. Algumas estão cobertas por uma camada escura, quase negra, enquanto outras ainda\nmantêm tons esverdeados, mas todas parecem levemente estranhas, como se algo vital tivesse sido drenado delas.\n");
			System.out.println("Alquimista: Você veio atrás de respostas, imagino. Eu também. Algo terrível está acontecendo com nosso bosque... Veja isto\n");
			System.out.println("Ele pega uma das amostras mais escuras e a segura à luz.\n");
			System.out.println("Alquimista: Esta é do coração do bosque, onde as árvores já morreram e o solo se tornou tão infértil quanto areia do deserto. As plantas que cresciam lá...\n\nestão desaparecendo, como se sugadas por uma força invisível. E quanto mais adentro no bosque, pior fica. É quase como se... algo estivesse drenando a energia vital da terra.\n");
			System.out.println("Ele franze a testa e pega outra amostra, comparando-a.\n");
			System.out.println("Alquimista: Curiosamente, os primeiros sinais de deterioração começaram a se intensificar perto das ruínas élficas antigas, localizadas bem no centro do bosque,\nelas sempre foram cercadas de mistérios, mas agora... parecem ser o foco dessa corrupção. As amostras do solo próximas a essas ruínas são as piores que já vi.\n");
			System.out.println("Ele se inclina mais perto de você, os olhos brilhando com uma mistura de preocupação e curiosidade.\n");
			System.out.println("Alquimista: A verdade, aventureiro, é que estou lidando com algo além do meu entendimento. O que quer que esteja causando isso... não é natural. Não consigo detectar\nnenhum elemento tóxico ou substância mortal. Não... É algo mais profundo, algo... místico. Magia antiga, talvez?\n");
			boolean conversaAlquimista = true;
			while (conversaAlquimista) {
				System.out.println("1- Essas ruínas... O que sabe sobre elas?");
				System.out.println("2- Você mencionou magia antiga... Acha que pode ser algo relacionado à magia sombria?");
				System.out.println("3- Se precisar, posso explorar mais o bosque e trazer informações ou amostras das ruínas.");
				System.out.println("4- Obrigado, já sei de tudo que precisava saber");
				int escolhaDialogo9 = scanner.nextInt();
				scanner.nextLine();
				switch (escolhaDialogo9) {
                case 1:
                    System.out.println("Alquimista: Pouco, infelizmente... Elas sempre foram cercadas de mistérios.\n");
                    break;

                case 2:
                    System.out.println("Alquimista: É uma hipótese... Mas magia sombria seria um presságio terrível.\n");
                    break;

                case 3:
                    System.out.println("Alquimista: Se está disposto a correr esse risco, eu agradeço. Mas cuidado... Algo sombrio ronda aquelas ruínas.\n");
                    break;

                case 4:
                    System.out.println("Alquimista: Se precisar de mais alguma coisa, estarei por aqui. Boa sorte, aventureiro.\n");
                    conversaAlquimista = false; // Encerra o loop
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
				}
			}
			System.out.println("O Alquimista lhe entrega algumas poções de cura.\n");
			inventario.adicionarItem(pocao);
			inventario.exibirInventario();
			System.out.println("\nComo provavelemente algo muito sombrio está lhe esperando naquelas ruinas você vai precisar disso mais do que eu\n");
			System.out.println("O Alquimista lhe entrega um tipo especial de runa\n");
			System.out.println("Alquimista: Passe ela na sua arma e armadura, que ela deixara o material mais resistente para enfretar os desafios que viram\n");
			Arma arma2;
			if (jogador.getClasse_Personagem().equals("Guerreiro")) {
				arma2 = new Arma("Claymore +1", "Sua antiga Claymore agora com metal reforçado",6);
			}else if (jogador.getClasse_Personagem().equals("Arqueiro")) {
				arma2 = new Arma("Arco +1","Seu Arco agora com madeira reforçada",6);
			}else if (jogador.getClasse_Personagem().equals("Mago")) {
				arma2 = new Arma("Foco Arcano +1","Seu Foco Arcano agora com mais mana",6);
			}else {
				arma2 = new Arma("Adaga +1","Sua Adaga agora com metal reforçado",6);
			}
			Armadura armadura2 = new Armadura("Armadura +1","Sua Antiga armadura agora com material reforçado",11);
			jogador.equiparArma(arma2);
			jogador.equiparArmadura(armadura2);
			jogador.exibirStatus();
			System.out.println("\nVocê agradece ao alquimista e o deixa continuar seus trabalhos, agora seu proximo objetivo já é claro, investigar as ruinas antigas no centro do bosque!\n");
		}else if (escolhaDialogo4 == 2) {
			// 2 Ato parte B
		}else {
			// Final C
			System.out.println("Mesmo após os apelos do Taberneiro você pensa consigo mesmo, 'não sou esse tipo de heroi'\n");
			System.out.println("Sem olhar para trás, você se afasta de um destino que nunca será seu. Os dias passam, e o nome Bosque Verdejante logo se torna apenas uma memória distante. O vilarejo, no entanto, não terá a mesma sorte.\n");
			System.out.println("Com o passar do tempo, histórias de um bosque amaldiçoado e de uma aldeia esquecida se espalham pelas terras. Nenhum herói se apresentou para enfrentar o mal, e o bosque acabou sendo consumido por completo.\n");
			System.out.println("Você segue seu caminho, mas algo permanece dentro de você—a pergunta silenciosa do \"E se?\".");
			System.out.println("--------------Final C - Caminho do Exilio -------------- ");
		}
		scanner.close();
	}
}
