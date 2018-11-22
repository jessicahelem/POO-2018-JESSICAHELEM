package App;

import javax.swing.JOptionPane;

import Negocios.Processos;

public class appTrello {
	
	public static void main(String[] args) {
		
		Processos processo = new Processos();
		
		
		  int opcao = 1;
	        
	        while (opcao != 0){
	            opcao = Integer.valueOf(JOptionPane.showInputDialog(null,processo.menu1()));
	            if (processo.statusLogar){
	            	//opcao = Integer.valueOf(JOptionPane.showInputDialog(null,processo.menu1()));          	
	            	
	            	while(opcao !=0) {
	            	  	opcao =Integer.valueOf(JOptionPane.showInputDialog(null,processo.menu2()));
		                switch (opcao) {
		                    case 1:
		                    	String tituloDoQuadro = JOptionPane.showInputDialog(null,"Titulo: ");
		                    	boolean privacidade = Boolean.valueOf(JOptionPane.showInputDialog("Digite true para privado ou false para público: ")); 
		                    	processo.cadastrarQuadro(tituloDoQuadro,privacidade);
		                        break;
		                    case 2:
		                    	processo.getQuadrosCadastrados();
		                       processo.listarQuadros();
		                        break;
		                    case 3:
		                        processo.listarQuadros();
		                        int indice = Integer.valueOf(JOptionPane.showInputDialog(null,"Número do quadro: "));
		                    	processo.selecionarQuadro(indice);
		                        opcao = Integer.valueOf(JOptionPane.showInputDialog(processo.menu3()));    
		                }  
	            	}}}}}