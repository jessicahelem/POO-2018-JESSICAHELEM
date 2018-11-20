package Model;

import java.util.ArrayList;

import model.Arquivo;

public class Quadro {
	public String tituloTema;
	public ArrayList<Lista>listas= new ArrayList<>();



	public Quadro(String tituloTema,ArrayList<Lista>listas) {
		this.tituloTema=tituloTema;
		this.listas=listas;
	}
	public void addLista(Lista lista) {
		listas.add(lista);

	}	

	public Lista buscarCard(Card card) {
		for (int i = 0; i <listas.size(); i++) {
			if(listas.get(i).getCards().contains(card)) {
				return listas.get(i);
			}
		}
		return null;
	}

	public void moverCard(Card nomeDoCard,Lista destino) {
		//		for(int i = 0; i<listas.size();i++){
		//			if (listas.contains(nomeDoCard)) {
		//				for (int j=0;j<nomeDaLista.size();j++) {
		//					nomeDaLista.add(j, nomeDoCard);
		//			
		Lista origem = this.buscarCard(nomeDoCard);
		if (origem != null) {
			int index = origem.getCards().indexOf(nomeDoCard);
			origem.getCards().remove(index);
			destino.getCards().add(nomeDoCard);
		}		
	}
	public void copiarCard(Card nomeDoCard,Lista destino) {
		Lista origem = this.buscarCard(nomeDoCard);
		if (origem != null) {
			Card card1 = new Card(nomeDoCard); 
			destino.getCards().add(card1);
		}
	}
}

