package Model;

import java.util.ArrayList;

public class Lista {
	
	public ArrayList<Card>cards= new ArrayList<>();
	public String tituloLista;
	
	
		//Criador
		//status(public, private)
		
	public void	addCard(Card card){
			cards.add(card);
		}
	
	public void arquivarCard(Card card) {
		
	}
	public void restaurarCard(Card card) {
		
	}
	public String excluirCard(Card card) {
		for(int i = 0; i < cards.size(); i++) {
			if(cards.contains(card)) {
				cards.remove(card);
				
			}
			else if(cards.contains(card))
				return "Card n�o encontrado";
			
		}
		return "Opera��o finalizada";
		
		
	}
	
	public void buscarCard() {
		
	}
	
}
