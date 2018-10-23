package model;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Arquivo {
	public String nome;
	public ArrayList<Mudancas>mudancas=new ArrayList<Mudancas>();
	
	

	public Arquivo(String nome) {
		this.nome=nome;
		this.mudancas=mudancas;
		
	}
	public void addArquivoStageZone(){
		
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public ArrayList<Mudancas> getMudancas() {
		return mudancas;
	}
	public void setMudancas(ArrayList<Mudancas> mudancas) {
		this.mudancas = mudancas;
	}
	
	


	
}
