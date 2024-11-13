package SistemaAmbiente;

public class Taverna extends Ambiente {
	// Cria um ambiente e sua descrição
    public Taverna() {
        super("Taverna", "Você entra na taverna da Aldeia Verdejante, uma taverna simples mas bastante aconchegante, uma lareira de pedra em formato retangular queima no centro da Taverna, mesas espalhadas ao redor e somente alguns homens que pelas vestes parecem camponeses sentados molhando a garganta após um dia de trabalho. O taberneiro, percebendo seu semblante cansado da viagem, aproxima-se com um sorriso.");
    }

    @Override
    public void exibirDescricao() {//Printa a descrição no console.
        System.out.println(descricao_Ambiente);
    }

    @Override
    public void interagir() {}
}
