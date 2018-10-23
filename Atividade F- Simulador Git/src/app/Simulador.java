package app;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import model.Arquivo;
import model.Repositorio;
import negocios.Servicos;

public class Simulador {
	public static void main(String[]args) {
		
		Repositorio repositorio1 =new Repositorio("Repositorio 1");
		Repositorio repositorio2 =new Repositorio("Repositorio 2");
		Arquivo arquivo1 = new Arquivo("arquivo.txt");
		Arquivo arquivo2= new Arquivo("Arquivo2.txt");
		
		
		
		repositorio1.adicionarArquivos(arquivo1);
		repositorio2.adicionarArquivos(arquivo2);
		repositorio1.buscarArquivo(arquivo1);
		Servicos.listarRepositorios();
		repositorio1.removerArquivosTracked(arquivo1);
		repositorio2.buscarArquivo(arquivo2);
		
		
		
	}
}
