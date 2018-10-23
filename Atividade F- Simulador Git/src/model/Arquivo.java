package model;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Arquivo {
	public String nome;
	public ArrayList<String>mudancas=new ArrayList<>();
	public boolean untracked= true;
	public String conteudo="";
	public String status="";
	
	

	public Arquivo(String nome) {
		this.nome=nome;
		this.mudancas=mudancas;
		this.untracked=untracked;
		
	}
	public void addArquivos(){
		this.untracked=false;
		
		
	}
	public void reset() {
		this.status="Reset";
	}
	public void editarArquivo(String novaLinha) {
		
		conteudo=" "+"\n";
		this.mudancas.add(novaLinha);
		this.status="Arquivo editado";
		
		
	}
	public void  commit() {
		this.status="Commited";
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public ArrayList<String> getMudancas() {
		return mudancas;
	}
	public void setMudancas(ArrayList<String>mudancas) {
		this.mudancas = mudancas;
	}
	
	


	
}
