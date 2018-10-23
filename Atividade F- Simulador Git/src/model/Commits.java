package model;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Commits {
	
	public String comentario = "";
	public int contArquivos = 0;
	public ArrayList<Arquivo>commits = new ArrayList<>();
	
	public Commits(String comentario) {
		this.comentario=comentario;
		this.contArquivos=contArquivos;
		this.commits=commits;
		
	}
	
	public void Mostrarcommits(Arquivo file) {
		
		JOptionPane.showMessageDialog(null, " "+comentario+"\n "+contArquivos+"\n "+commits);
		
	}
	
	
	

}
