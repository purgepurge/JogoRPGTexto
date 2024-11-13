package SistemaAmbiente;

public abstract class Ambiente {
    protected String nome_Ambiente;
    protected String descricao_Ambiente;

    public Ambiente(String nome, String descricao) {
        this.nome_Ambiente = nome;
        this.descricao_Ambiente = descricao;
    }

    // Método abstrato para exibir descrição (será implementado pelas subclasses)
    public abstract void exibirDescricao();

    // Método para interagir com o ambiente (opcional para subclasses)
    public void interagir() {
        System.out.println("Não há nada para interagir aqui.");
    }
    
    public static void prologo() {//Printa o Prologo do jogo
    	System.out.println("Há muito tempo, a Aldeia Verdejante era conhecida por suas colheitas abundantes e pela vitalidade de suas florestas. O pequeno vilarejo, situado ao pé de antigas colinas, vivia em harmonia com o misterioso Bosque Verdejante, um lugar sagrado onde os aldeões buscavam proteção e sustento.");
    	System.out.println("No entanto, nos últimos meses, algo mudou. As árvores começaram a secar, o solo se tornou infértil, e os animais, outrora abundantes, desapareceram. Os aldeões tentaram rezar para os antigos deuses do bosque, mas o silêncio foi a única resposta que receberam. Medo e desespero cresceram, e rumores de uma maldição começaram a se espalhar.");
    	System.out.println("Você é um aventureiro, enviado por sua guilda com a missão de descobrir o que está havendo com o vilarejo.");
    	System.out.println("Após longos dias de viagem , você finalmente chega na Aldeia, imediatamente você se direciona para a Taverna para encher a barriga e ter o merecido descanso.");
    }
}

