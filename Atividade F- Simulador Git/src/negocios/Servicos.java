package negocios;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import model.Repositorio;

	public class Servicos {
		
	public static ArrayList<Repositorio>repositorios=new ArrayList<Repositorio>();
		
		
		public static void listarRepositorios() {
			for (int i=0;i<repositorios.size();i++) {
				JOptionPane.showMessageDialog(null,"Nome: "+repositorios.get(i).getNome());
				
				
			}
		
	}public static void menuRepositorio() {
		JOptionPane.showMessageDialog(null, ">> Simulador Git <<\n 1 - Criar Repositório\n2 - Acessar Repositório\n3 - Listar Repositórios\n 0 - Sair ");
	}
	
}
