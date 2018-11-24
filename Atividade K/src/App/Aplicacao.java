package App;
import javax.swing.JOptionPane;

import Negocios.Processo;

public class Aplicacao {
	
	public static void main(String[] args) {
		
		Processo processo = new Processo();

		int option1 = Integer.parseInt((JOptionPane.showInputDialog(processo.menu1())));
		
		while(option1 != 0) {
			switch(option1) {
			case 1:
				String usuario = JOptionPane.showInputDialog(null,"Usu�rio: ");
				String senha=JOptionPane.showInputDialog(null,"Senha: ");
			    if (processo.login(usuario, senha)){
			    	JOptionPane.showMessageDialog(null,"Bem-Vindo!");
			    	int option2 = Integer.parseInt((JOptionPane.showInputDialog(processo.menu2())));
			    	while(option2 != 0) {
						switch(option2) {
						case 1:
							String tituloDoQuadro= JOptionPane.showInputDialog(null,"Insira um nome para seu quadro: ");
							processo.cadastrarQuadro(tituloDoQuadro);
							JOptionPane.showMessageDialog(null,"Quadro criado com sucesso!");
							option2 = Integer.parseInt((JOptionPane.showInputDialog(processo.menu2())));
						case 2:
							 JOptionPane.showMessageDialog(null,processo.listarQuadros());
						
							 option2 = Integer.parseInt(JOptionPane.showInputDialog(processo.menu2()));
							 break;
						case 3:
							 JOptionPane.showMessageDialog(null,processo.listarQuadros());
							 String opcao =JOptionPane.showInputDialog("T�tulo do quadro que deseja: ");
						       processo.selecionarQuadro(opcao);
						       JOptionPane.showMessageDialog(null,"Entrou...!");
						       
						       int option3 = Integer.parseInt(JOptionPane.showInputDialog(processo.menu3()));
						       while(option3 != 0) {
									switch(option3) {
									case 1:
										String tarefa=JOptionPane.showInputDialog("Tarefa: ");
										processo.cadastrarTarefa(tarefa);
										option3= Integer.parseInt(JOptionPane.showInputDialog(processo.menu3()));
									case 2:
										JOptionPane.showMessageDialog(null,processo.listarTarefas());
										
										option3= Integer.parseInt(JOptionPane.showInputDialog(processo.menu3()));
										break;
									case 3:
										JOptionPane.showMessageDialog(null,processo.listarTarefas());
										int opc =  Integer.parseInt(JOptionPane.showInputDialog("N�mero da tarefa: "));
										if(processo.selecionarTarefa(opc-1)) {
											JOptionPane.showMessageDialog(null,"Entrou...!");
											  int option4 = Integer.parseInt(JOptionPane.showInputDialog(processo.menu4()));
										       while(option4 != 0) {
													switch(option4) {
													//add um card
													case 1:
														String nomeDoCard= JOptionPane.showInputDialog("Nome do card: ");
														 processo.cadastrarCartao(nomeDoCard);
														 option4 = Integer.parseInt(JOptionPane.showInputDialog(processo.menu4()));
														 
													//listar card
													case 2:
														processo.listagemListaCartoes();
														 option4 = Integer.parseInt(JOptionPane.showInputDialog(processo.menu4()));
													case 3:
														
														 int op=  Integer.parseInt(JOptionPane.showInputDialog(null,"Op��o:"));
														 processo.selecionarCartao(op);
														  int option5 = Integer.parseInt(JOptionPane.showInputDialog(processo.menu5()));
														  while(option5 != 0) {
																switch(option5) {
																case 1:
																	String descricao = JOptionPane.showInputDialog(null,"Descri��o:");
																	processo.adicionarDescricao(descricao);
																	 option5 = Integer.parseInt(JOptionPane.showInputDialog(processo.menu5()));
																case 2:
																	String comentario = JOptionPane.showInputDialog(null,"Comet�rio:");
																	processo.adicionarComentario(comentario);
																	 option5 = Integer.parseInt(JOptionPane.showInputDialog(processo.menu5()));
																case 3:
																	String titulo = JOptionPane.showInputDialog(null,"Etiqueta: ");
																	String cor = JOptionPane.showInputDialog(null,"Cor: ");
																	processo.adicionarEtiqueta(titulo, cor);
																case 4:
																	int op1 =  Integer.parseInt(JOptionPane.showInputDialog(null,"Op��o:"));
																	processo.selecionarTarefa(op1);
																}
														 
														
														
														
														
										       }
														
											
										}
										
										 
									}
						      
						}
						}
			    	}
			    }
			    }
			    }
			    	
		         else {
		        	JOptionPane.showMessageDialog(null,"Ops!Voc� n�o foi localizado!");
		        	option1 = Integer.parseInt((JOptionPane.showInputDialog(processo.menu1())));
					
		} break;

			
				

			case 2:
				String nome1 = JOptionPane.showInputDialog(null,"Nome: ");
				String usuario1=JOptionPane.showInputDialog(null,"Usu�rio: ");
				String senha1= JOptionPane.showInputDialog(null,"Senha: ");
				if (processo.cadastrarUser(nome1, usuario1, senha1)){
					JOptionPane.showMessageDialog(null, nome1 + " Voc� foi cadastrado(a)!");
					
					option1 = Integer.parseInt((JOptionPane.showInputDialog(processo.menu1())));
		        } else {
		        	JOptionPane.showMessageDialog(null,"Ops! Tente novamente!");
		        	option1 = Integer.parseInt((JOptionPane.showInputDialog(processo.menu1())));
		
		        }
				
			
				break;
			case 3:
				break;
			
		
				
					
			
	}
}
			
	
	}

	
}