package model;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Repositorio {

	public String nome;
	public ArrayList<Arquivo>untrackedFiles=new ArrayList<Arquivo>();
	public ArrayList<Arquivo>trackedFiles=new ArrayList<Arquivo>();
	public ArrayList<Arquivo>stageArea=new ArrayList<Arquivo>();
	public ArrayList<Mudancas>mudancas;
	public ArrayList<Commits>commits;
	public boolean arquivoModificado=true;
	public static boolean untrackedFile=true;
	public String conteudo=" ";

public Repositorio(String nome) {
	this.nome=nome;
	this.commits=commits;
	this.arquivoModificado=arquivoModificado;
	this.trackedFiles=trackedFiles;
	this.untrackedFiles=untrackedFiles;
	}



public void adicionarArquivos(Arquivo file) {
	
	trackedFiles.add(file);
	stageArea.add(file);
	JOptionPane.showMessageDialog(null, "Arquivo adicionado com sucesso!");
				
			
}
	
public void editarArquivo() {
	
	conteudo="nova linha"+"\n";
	untrackedFile=false;
	JOptionPane.showMessageDialog(null, "Arquivo editado com sucesso!");
	
}
public void mostrarConteudo() {
	JOptionPane.showMessageDialog(null," "+conteudo);
}

public void removerArquivosUntracked(Arquivo file) {
	for (int i = 0;i<untrackedFiles.size();i++) {
		if (untrackedFiles.get(i).getNome().equals(file.getNome())) {
			untrackedFiles.remove(file);
			JOptionPane.showMessageDialog(null,"Arquivo removido com sucesso!");
			
		}
	}
}

public void removerArquivosTracked(Arquivo fileName) {
	for (int i = 0;i<trackedFiles.size();i++) {
		if (trackedFiles.get(i).getNome().equals(fileName.getNome())) {
			trackedFiles.remove(fileName);
			JOptionPane.showMessageDialog(null,"Arquivo removido com sucesso!");
		}else{
			JOptionPane.showMessageDialog(null,"Arquivo não encontrado, por favor verifique o nome do arquivo.");
		}
		
			
		}
	}

public void buscarArquivo(Arquivo file) {
	for (int i=0;i<trackedFiles.size();i++) {
		if(trackedFiles.contains(file)) {
			JOptionPane.showMessageDialog(null,"Nome:"+trackedFiles.get(i).getNome());
		}else {
			JOptionPane.showMessageDialog(null,"Arquivo não encontrado!");
		}
	}
	
}

public void adicionarNaStageArea(Arquivo file) {
	for (int i=0;i<stageArea.size();i++) {
		stageArea.add(file);
		JOptionPane.showMessageDialog(null, "Arquivo adicionado na Stage Area!");
		
	}
}
public void renomearArquivo(Arquivo file) {
	for (int i=0;i<trackedFiles.size();i++) {
		trackedFiles.remove(file);
		JOptionPane.showMessageDialog(null, "Arquivo renomeado com sucesso!");
	}
}


public String getNome() {
	return nome;
}


public void setNome(String nome) {
	this.nome = nome;
}


public ArrayList<Arquivo> getUntrackedFiles() {
	return untrackedFiles;
}


public void setUntrackedFiles(ArrayList<Arquivo> untrackedFiles) {
	this.untrackedFiles = untrackedFiles;
}


public ArrayList<Arquivo> getTrackedFiles() {
	return trackedFiles;
}


public void setTrackedFiles(ArrayList<Arquivo> trackedFiles) {
	this.trackedFiles = trackedFiles;
}


public ArrayList<Arquivo> getStageArea() {
	return stageArea;
}


public void setStageArea(ArrayList<Arquivo> stageArea) {
	this.stageArea = stageArea;
}


public ArrayList<Mudancas> getMudancas() {
	return mudancas;
}


public void setMudancas(ArrayList<Mudancas> mudancas) {
	this.mudancas = mudancas;
}


public ArrayList<Commits> getCommits() {
	return commits;
}


public void setCommits(ArrayList<Commits> commits) {
	this.commits = commits;
}


public boolean isArquivoModificado() {
	return arquivoModificado;
}


public void setArquivoModificado(boolean arquivoModificado) {
	this.arquivoModificado = arquivoModificado;
}

}