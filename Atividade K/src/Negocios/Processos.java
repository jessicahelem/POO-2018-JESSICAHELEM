package Negocios;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import Model.User;
import Model.Quadro;
import Model.Lista;
import Model.Card;
import Model.Comentario;
import Model.Etiquetas;
import Model.Log;

public class Processos {
    public  boolean logadoStatus= false;
	private ArrayList<User> usuarios = new ArrayList<>();
    private ArrayList<Log> logs = new ArrayList<>();
    private  ArrayList<Quadro> quadros = new ArrayList<>();
    public ArrayList<Card> cards = new ArrayList<>();
    public int usuarioSelecionado = 0;
    public int posicao=0;
    
    //METODOS DE NEGOCIO PARA GERENCIAR O USER.
    public boolean cadastrarUsuario(String nome, String login, String senha){
        if (nome.trim().length() == 0 || login.trim().length() == 0 || senha.trim().length() == 0) {
            return false;
        }
        User usuario = new User(nome, login, senha);
        this.usuarios.add(usuario);
        return true;
    }
    
    
    public boolean selecionarUsuario(int indice){
        if (indice < 0 || indice >= usuarios.size()){
            return false;
        }
        this.usuarioSelecionado = indice;
        return true;
    }
    
    
    public boolean login(String idLogin, String senha){
        for (int i = 0; i < usuarios.size(); i++){
            if (usuarios.get(i).login(idLogin, senha)){
                selecionarUsuario(i);
                return true;
            }
        }
        return false;
    }

    
    public ArrayList<User> getUsuariosCadastrados() {
        return usuarios;
    }
    
    
    public User getUsuarioSelecionado(){
        return this.usuarios.get(usuarioSelecionado);
    }
    
    
    public void cadastrarQuadro(String titulo){
        
        
        usuarios.get(usuarioSelecionado).quadros.add((new Quadro(titulo)));
        
       String log = " >> O quadro" + titulo + "foi adicionado";
        gerarLog(log);
        
    }
    
    
    private int getIndiceDeUsuarioPorLogin(String login){
        for (int i = 0; i < usuarios.size(); i++){
            if (usuarios.get(i).getLogin().equals(login)){
                return i;
            }
        }
        return -1;
    }
    
    
    public ArrayList<Quadro> getQuadrosCadastrados(){
        return usuarios.get(usuarioSelecionado).getQuadros();
    }
    
    
    public Quadro selecionarQuadro(String titulo){
    	for(int i = 0; i < this.quadros.size();i++) {
			if(this.quadros.get(i).titulo.equals(titulo)) 
				return this.quadros.get(i);
		}
		
    	return null;
    	
    }
    
    
    public boolean cadastrarTarefa(String titulo){
        if (titulo.trim().length() == 0){
            return false;
        }
        Lista lista = new Lista(titulo);
        usuarios.get(usuarioSelecionado).getQuadroSelecionado().cadastrarTarefa(lista);
        String log = ">> A tarefa " + titulo+ " foi adicionada";
        gerarLog(log);
        return true;
    }
    
    
    public ArrayList<Lista> getTarefasCadastradas(){
        return usuarios.get(usuarioSelecionado).getQuadroSelecionado().getTarefas();
    }
    
    
    public boolean selecionarTarefa(int indice){
        return usuarios.get(usuarioSelecionado).getQuadroSelecionado().alternarTarefa(indice);        
    }
    
    
    public boolean cadastrarCartao(String titulo){
        if (titulo.trim().length() == 0){
            return false;
        }
        Card card = new Card(titulo);
        usuarios.get(usuarioSelecionado).getQuadroSelecionado().getTarefaSelecionada().cadastrarCartao(card);
        String log = ">> O cartão " + titulo + "foi adicionado";
        gerarLog(log);
        return true;
    }
    
    
    public ArrayList<Card> getCartoesCadastrados(){
        return usuarios.get(usuarioSelecionado).getQuadroSelecionado().getTarefaSelecionada().getCartoes();
    }
    
    
    public boolean selecionarCartao(int indice){
        return usuarios.get(usuarioSelecionado).getQuadroSelecionado().getTarefaSelecionada().alternarCartao(indice);        
    }
    
    
    public void moverCartao(int tarefa, int cartao){
        usuarios.get(usuarioSelecionado).getQuadroSelecionado().moverCartao(tarefa, cartao);
        String log = ">> O Card " + usuarios.get(usuarioSelecionado).getQuadroSelecionado().getTarefaSelecionada().getCartaoSelecionado().getTitulo() + "foi movido";
        gerarLog(log);
    }
    
    public boolean adicionarDescricaoAoCartao(String descricao){
        if (descricao.trim().length() == 0){
            return false;
        }
        usuarios.get(usuarioSelecionado).getQuadroSelecionado().getTarefaSelecionada().getCartaoSelecionado().adicionarDescricao(descricao);
        String log = ">> A descricao <\n" + descricao + 
                ">foi adicioana no card: " + usuarios.get(usuarioSelecionado).getQuadroSelecionado().getTarefaSelecionada().getCartaoSelecionado().getTitulo();
        gerarLog(log);
        return true;
    }
    
    public boolean adicionarComentarioAoCartao(String comentario){
        if (comentario.trim().length() == 0){
            return false;
        }
        Comentario c = new Comentario(usuarios.get(usuarioSelecionado), comentario);
        usuarios.get(usuarioSelecionado).getQuadroSelecionado().getTarefaSelecionada().getCartaoSelecionado().adicionarComentario(c);
        String log = " >> O Comentario adicionado: \n" + comentario + 
                "adicioana ao cartao: " + usuarios.get(usuarioSelecionado).getQuadroSelecionado().getTarefaSelecionada().getCartaoSelecionado().getTitulo();
        gerarLog(log);
        return true;
    }
    
    
    
    public boolean adicionarEtiquetaAoCartao(String titulo, String cor){
    	if (cor.trim().length() == 0 || titulo.trim().length() == 0){
    		return false;
    	}
    	Etiquetas etiqueta = new Etiquetas(titulo, cor);
    	usuarios.get(usuarioSelecionado).getQuadroSelecionado().getTarefaSelecionada().getCartaoSelecionado().adicionarEtiqueta(etiqueta);
    	String log = "Nova etiqueta adicionada: \n" + titulo + 
    			"adicioana ao cartao: " + usuarios.get(usuarioSelecionado).getQuadroSelecionado().getTarefaSelecionada().getCartaoSelecionado().getTitulo();
    	gerarLog(log);
    	return true;
    }
    
    private void gerarLog(String descricao){
        Log log = new Log(descricao);
        this.logs.add(log);
    }
    public String listarTarefas(){
        ArrayList<Lista> tarefas = getTarefasCadastradas();
        if (tarefas.isEmpty()){
             return "Nenhum registro localizado!";
        }
        for (int i = 0; i < tarefas.size(); i++){
            return i+1 + "-"+ tarefas.get(i).getTitulo();
        }
		return null;
}
    public ArrayList<Log> getLog(){
        return logs;
    }
    public String menu1() {
    	return     "SEJA BEM VINDO - TRELLAR \n"
           	 + "1 - Login\n" //se clicar nessa opçao vem o formaulario de LOGIN.
             + "2 - Cadastrar Usuario\n" //se clicar nessa opçao vem o formaulario de cadastro.
             + "0 - Finalizar"; //sai.;
    }
    public String menu2() {
    	return  "  1 -  Criar Novo Quadro\n" //se clicar nessa opçao vem o formaulario NOVO QUADRO.
                + "2 -  Meus Quadros - Listar Quadros\n" //tela com a lista.
                + "3 -  Selecionar Quadro\n"
                + "0 -  Voltar";
    }
    public String menu3() {
    	return "   1 - Cadastrar tarefa\n" //se clicar nessa opçao vem o formaulario NOVO cadastrar tarefa.
    			+ "2 -  Listar tarefas\n" // listas tarefas. 
        		+ "3 -  Selecionar tarefa\n"
        		+ "0 -  Voltar";
    }
    public String menu4() {
    	return "   1 -  Adicionar Card\n"
                + "2 -  Listar Cards\n"      
                + "3 -  Selecionar Cards\n"
                + "0 -  Voltar";
    }
    public String menu5() {
    	  return  "1 - Adicionar descrição ao card\n"
                + "2 - Adicionar comentario ao cartao\n"
                + "3 - Adicionar etiqueta ao cartao\n"
                + "4 - Alternar cartao para outra tarefa\n"
                + "0 - Voltar";
    }
    
   
       
            
       
    
    
    public void logoff(){
        setLogadoStatus(false);
        selecionarUsuario(0);
    }


	public boolean isLogadoStatus() {
		return logadoStatus;
	}


	public boolean setLogadoStatus(boolean logadoStatus) {
		return this.logadoStatus = logadoStatus;
	}

	public String listarQuadros(){
		//ArrayList<Quadro> quadros = getQuadrosCadastrados();
		String quadros = "";
		
			for (int i = 0; i < this.quadros.size();i++){
				quadros= ">> "+i+1+" Quadro: "+  this.quadros.get(i).titulo;
			}
			return quadros; 
		
	}

	public void listagemCompletaDeCartoes(){
	
		if (cards.isEmpty()){
			   JOptionPane.showMessageDialog(null,"Não há Cards!");
			        }
			        for (int i = 0; i < cards.size(); i++){ 
			        	JOptionPane.showMessageDialog(null," Card"+ i+1);
			        	JOptionPane.showMessageDialog(null,">> Titulo - \n"+ cards.get(i).getTitulo());
			        	JOptionPane.showMessageDialog(null,">> Descricao - \n"+cards.get(i).getDescricao());
			            
			        	JOptionPane.showMessageDialog(null,"  > Comentario(s) Feito(s): ");
			            for (int j = 0; j < cards.get(i).getComentarios().size(); j++){
			                System.out.printf("\t -"+ cards.get(i).getComentarios().get(j).getComentario()+" - \n"+cards.get(i).getComentarios().get(j).getDataHora());
			            }
			            
			            JOptionPane.showMessageDialog(null,"  > Etiqueta(s) Aplicada(s): ");
			            for (int j = 0; j < cards.get(i).getEtiquetas().size(); j++){
			                JOptionPane.showMessageDialog(null,"\t - "+cards.get(i).getEtiquetas().get(j).getTitulo()+" - \n"+cards.get(i).getEtiquetas().get(j).getCor());
			            }
			}
	
	}

	

 	
}	


	





    