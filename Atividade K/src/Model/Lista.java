package Model;

import java.util.ArrayList;

public class Lista {
	
	public ArrayList<Card>cards= new ArrayList<>();
	public String tituloLista;
	
	public Lista(String titulo) {
		this.tituloLista = titulo;
		
	}
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
				return "Card não encontrado";
			
		}
		return "Operação finalizada";
		
		
	}
	
	public void buscarCard() {
		
	}
	public ArrayList<Card> getCards() {
		return cards;
	}
	public void setCards(ArrayList<Card> cards) {
		this.cards = cards;
	}
	public String getTituloLista() {
		return tituloLista;
	}
	public void setTituloLista(String tituloLista) {
		this.tituloLista = tituloLista;
	}
	
}
