package Negocios;

import java.util.ArrayList;

import Model.Card;
import Model.Lista;

public class controleQuadro {
	public Lista lista;
	public ArrayList<Lista>listas;
	
	public Lista getLista(String nome) {
		for(int i = 0; i < listas.size();i++)
			if(listas.get(i).tituloLista.equals(nome))
				return listas.get(i);
		
			return null;
	}
	//menus	
	public String menu1() {
		return ">> App Trello << \n1 - Adicionar nome para o quadro \n 2 - Adicionar uma lista";
	}

}


