package model;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Arquivo {
	public String nome;
	public ArrayList<Mudancas>mudancas=new ArrayList<Mudancas>();
	public static boolean trackedFile=false;
	public String conteudo=" ";
	

	public Arquivo(String nome) {
		this.nome=nome;
		this.mudancas=mudancas;
		this.trackedFile=trackedFile;
		this.conteudo=conteudo;
	}
	public void editarArquivo(String arquivo) {
		conteudo="nova linha"+arquivo;
		trackedFile=true;
		JOptionPane.showMessageDialog(null, "Arquivo editado com sucesso!");
		
	}public void addArquivoStageZone(){
		
		
	}
	public void mostrarConteudo() {
		for (int i=0;i<)
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
	public boolean isTrackedFile() {
		return trackedFile;
	}
	public void setTrackedFile(boolean trackedFile) {
		this.trackedFile = trackedFile;
	}
	public ArrayList<String> getLinhas() {
		return linhas;
	}
	public void setLinhas(ArrayList<String> linhas) {
		this.linhas = linhas;
	}

	
}
