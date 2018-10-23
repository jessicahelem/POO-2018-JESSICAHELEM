package app;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import model.Arquivo;
import model.Repositorio;
import negocios.Servidor;

public class Simulador {
	public static void main(String[]args) {
		
		
		
		
		
		
	Servidor servidor= new Servidor();
	
	
	int op= Integer.valueOf(JOptionPane.showInputDialog(servidor.menuPrincipal())); 
	
	while(op!=0) {
		if (op==1) {
			String nomeRepositorio = JOptionPane.showInputDialog("Insira o nome do seu repositório: ");
			String  descricao= JOptionPane.showInputDialog("Insira uma descrição no repositorio: ");
			servidor.repositorios.add(new Repositorio(nomeRepositorio,descricao));
			JOptionPane.showMessageDialog(null, "Repositorio: " + nomeRepositorio+"\nDescricao: "+descricao +"\nRepostório criado com sucesso!");
			 op= Integer.valueOf(JOptionPane.showInputDialog(servidor.menuPrincipal())); 
		}
		else if(op==2) {
			String nomeRep =  JOptionPane.showInputDialog("Insira o nome do seu repositório: ");
			if (nomeRep==null )
			servidor.abirRepositorio(nomeRep);
			 op= Integer.valueOf(JOptionPane.showInputDialog(servidor.menuPrincipal())); 
			 
		}

		
		else if (op==3) {
			servidor.listarRepositorios();
			op= Integer.valueOf(JOptionPane.showInputDialog(servidor.menuPrincipal()));
		}
		else if(op==0) {
			break;
		}
		}
	int op2=Integer.valueOf(JOptionPane.showInputDialog(servidor.menuArquivo())); 
	while(op2!=0) {
		if(op==1) {
			
			String nomeArquivo= JOptionPane.showInputDialog("Insira o nome do seu repositório: ");
			
			JOptionPane.showMessageDialog(null, "Arquivo adicionado com sucesso!");
			
		}
		
	}
	}
}
		
		
		
	

