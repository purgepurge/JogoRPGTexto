package SistemaAmbiente;

public class CasaAlquimista extends Ambiente {
	public CasaAlquimista() {//Cria um ambiente com sua descrição
		super("Casa do Alquimista","Você se aproxima de uma casa peculiar, situada na extremidade norte do vilarejo.\n\nDiferente das outras moradias simples de madeira e pedra, esta construção exala um ar de mistério e conhecimento antigo.\n\nAs paredes são cobertas por trepadeiras escuras, e pequenas runas estão entalhadas discretamente nas vigas da porta.\nao entrar, o cheiro forte de ervas secas, óleos essenciais e compostos químicos inunda o ambiente, paredes repletas de prateleiras.\n\nCada prateleira está abarrotada de vidros, frascos e potes contendo líquidos de cores vibrantes, pós estranhos e ingredientes misteriosos.\n\nNo centro da sala, há uma grande mesa de madeira coberta de livros empoeirados, pergaminhos abertos e instrumentos de alquimia, como um almofariz e pilão, tubos de\nensaio e um pequeno forno de destilação.\n\nUm caldeirão borbulha suavemente em um canto, liberando uma fina fumaça esverdeada que parece formar figuras efêmeras no ar antes de desaparecer.\n\nEm um canto, empilhadas, estão várias ervas secas e raízes, algumas reconhecíveis, outras completamente alienígenas.\n\nPendurados no teto por fios finos, pequenos amuletos e talismãs balançam suavemente com a brisa. \n\nO alquimista, que reside nesta casa, é um misto de cientista e místico.\n\nSeus olhos, escondidos por trás de óculos redondos e embaçados, transbordam de curiosidade e um toque de cansaço.\n\nEle fala em tons baixos, como se estivesse sempre refletindo sobre algo importante.\n");
	}

	@Override
	public void exibirDescricao() {//Printa a descrição no console
		System.out.println(descricao_Ambiente);
	}
	
	public void interagir() {
		
	}
}
