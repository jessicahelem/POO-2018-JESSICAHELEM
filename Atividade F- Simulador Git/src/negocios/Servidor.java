package negocios;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import model.Repositorio;

	public class Servidor {
		
	public static ArrayList<Repositorio>repositorios=new ArrayList<Repositorio>();
		
		
		
	
	
	public Repositorio abirRepositorio(String nome) {
		for(int i = 0; i < repositorios.size();i++)
			if(repositorios.get(i).nome.equals(nome))
				return repositorios.get(i);
		
			return null;
}
	
	public void listarRepositorios() {
			for (int i=0;i<repositorios.size();i++) {
				JOptionPane.showMessageDialog(null,"Nome: "+repositorios.get(i).getNome());
				
				
			}
		
	}public String menuPrincipal() {
		return ">> Simulador Git <<\n 1 - Criar Repositório\n2 - Acessar Repositório\n3 - Listar Repositórios\n 0 - Sair";
		
	}
	
	
	public String menuArquivo() {
		return "1 - Criar Arquivo\n2 - Listar Arquivos Untrackeds\n2 - Listar Arquivos Trackeds\n4 - Editar Arquivos\n 5 - Remover Arquivos\n6 - Reset\n 0 - Sair ";
	}
	
	public void listarRepositorios(Servidor servidor){
		for (int i=0;i<servidor.repositorios.size();i++) {
			JOptionPane.showMessageDialog(null, "Nome: "+servidor.repositorios.get(i).getNome());
			
		}
	}public void listarArquivosUntracked(Repositorio repositorio) {
		for (int i=0;i<repositorio.untrackedFiles.size();i++) {
			JOptionPane.showMessageDialog(null,"Arquivo: "+repositorio.untrackedFiles.get(i).getNome()+"Status: "+repositorio.untrackedFiles.get(i).getMudancas());
			
		}
	}
	public void listarArquivosTracked(Repositorio repositorio) {
		for (int i=0;i<repositorio.trackedFiles.size();i++) {
			JOptionPane.showMessageDialog(null,"Arquivo: "+repositorio.trackedFiles.get(i).getNome()+"Status: "+repositorio.trackedFiles.get(i).getMudancas());
			
		}
	}
	
	
}
