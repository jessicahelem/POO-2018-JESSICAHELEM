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
		JOptionPane.showMessageDialog(null, ">> Simulador Git <<\n 1 - Criar Reposit�rio\n2 - Acessar Reposit�rio\n3 - Listar Reposit�rios\n 0 - Sair ");
	}
	
}
