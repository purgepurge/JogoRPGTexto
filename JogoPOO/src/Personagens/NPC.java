package Personagens;

public class NPC extends Personagem{
	
	public String dialogos_NPC[];
	
	public NPC(String nome_NPC, String[] dialogos_NPC) {
		nome_NPC = this.nome_Personagem;
		dialogos_NPC = this.dialogos_NPC;
	}
	
	public NPC() {}


	public String[] getDialogos_NPC() {
		return dialogos_NPC;
	}

	public void setDialogos_NPC(String[] dialogos_NPC) {
		this.dialogos_NPC = dialogos_NPC;
	}


	@Override
	public int listarMagias() {
		return vida_Personagem;
		// TODO Auto-generated method stub
		
	}
	
	//metodos

}
