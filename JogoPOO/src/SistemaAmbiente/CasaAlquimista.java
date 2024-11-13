package SistemaAmbiente;

public class CasaAlquimista extends Ambiente {
	public CasaAlquimista() {//Cria um ambiente com sua descrição
		super("Casa do Alquimista","Você se aproxima de uma casa peculiar, situada na extremidade norte do vilarejo. Diferente das outras moradias simples de madeira e pedra, esta construção exala um ar de mistério e conhecimento antigo. As paredes são cobertas por trepadeiras escuras, e pequenas runas estão entalhadas discretamente nas vigas da porta.\n Ao entrar, o cheiro forte de ervas secas, óleos essenciais e compostos químicos inunda o ambiente, paredes repletas de prateleiras. Cada prateleira está abarrotada de vidros, frascos e potes contendo líquidos de cores vibrantes, pós estranhos e ingredientes misteriosos.\n No centro da sala, há uma grande mesa de madeira coberta de livros empoeirados, pergaminhos abertos e instrumentos de alquimia, como um almofariz e pilão, tubos de ensaio e um pequeno forno de destilação. Um caldeirão borbulha suavemente em um canto, liberando uma fina fumaça esverdeada que parece formar figuras efêmeras no ar antes de desaparecer.\n Em um canto, empilhadas, estão várias ervas secas e raízes, algumas reconhecíveis, outras completamente alienígenas. Pendurados no teto por fios finos, pequenos amuletos e talismãs balançam suavemente com a brisa \n O alquimista, que reside nesta casa, é um misto de cientista e místico. Seus olhos, escondidos por trás de óculos redondos e embaçados, transbordam de curiosidade e um toque de cansaço. Ele fala em tons baixos, como se estivesse sempre refletindo sobre algo importante.");
	}

	@Override
	public void exibirDescricao() {//Printa a descrição no console
		System.out.println(descricao_Ambiente);
	}
	
	public void interagir() {
		
	}
}
