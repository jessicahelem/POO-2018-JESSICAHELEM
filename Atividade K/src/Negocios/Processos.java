package Negocios;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import java.util.ArrayList;
import Model.User;
import Model.Quadro;
import Model.Lista;
import Model.Card;
import Model.Comentario;
import Model.Etiquetas;

import Model.Card;
import Model.Lista;

public class Processos {
	  /* Variaveis */
	public Quadro quadro;
	public ArrayList<Quadro> quadros = new ArrayList();
    private ArrayList<User> usuarios = new ArrayList<>();
    private int usuarioSelecionado = 0;
   public boolean statusLogar = false;
    
    public Quadro getQuadro(String nome) {
    	for(int i = 0; i < quadros.size();i++)
			if(quadros.get(i).titulo.equals(nome))
				return quadros.get(i);
		
			return null;
    }
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
    public String menu1() {
    	if (!statusLogar) {
	return "SEJA BEM VINDO - TRELLO \n"
           	 + "1 - Login\n"
             + "2 - Cadastrar Usuario\n"
             + "3 - Logoff";}
		return null;
		
    	
    }
    public String menu2() {
    	
		return "OPÇÕES PARA QUADROS \n"
           	 + "1 - Cadastrar Nova Lista/Tarefa\n"
             + "2 - Meus Quadros - Listar Quadros\n"
             + "3 - Selecionar um Quadro\n"
             + "0 - Finalizar";
    }
    public String menu3() {
    	
		return "OPÇÕES PARA LISTA/TAREFA \n"
                 + "1 -  Adicionar uma Lista/Tarefa \n"
                 + "2 -  Mostrar Minhas Listas/Tarefas\n"      
                 + "3 -  Selecionar uma Lista/Tarefa \n"
                 + "0 - Finalizar";
                  
        
    }
    public String menu4() {
    	return "OPÇÕES PARA CARDS \n"
                 + "1 -  Adicionar Card\n"
                 + "2 -  Listar Cards\n"      
                 + "3 -  Selecionar Cards\n"
                 + "0 - Finalizar";
    }
    public String menu5() {
    	return "OPÇÕES PARA UM CARD \n"
                + "1 - Adicionar descrição ao card\n"
                + "2 - Adicionar data de entrega ao cartao\n"
                + "3 - Adicionar comentario ao cartao\n"
                + "4 - Adicionar etiqueta ao cartao\n"
                + "5 - Mover Card para outra Lista/Tarefa\n"
                + "0 - Finalizar";
    }
    public void listarQuadros(Processos processo ){
     
      for (int i = 0; i < processo.quadros.size(); i++){
            JOptionPane.showInputDialog(null,"%d -"+ i+1 + "\n%s"+ processo.quadros.get(i).getTitulo());
        }
    }

    public boolean login(String login, String senha){
        for (int i = 0; i < usuarios.size(); i++){
            if (usuarios.get(i).login(login, senha)){
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
    
    
    public boolean cadastrarQuadro(String titulo,boolean privacidade){
        if (titulo.trim().length() == 0){
            return false;
        }
        Quadro quadro = new Quadro(titulo,privacidade);
        usuarios.get(usuarioSelecionado).cadastrarNovoQuadro(quadro);
        return true;
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
    
    
    public boolean selecionarQuadro(int indice){
        return usuarios.get(usuarioSelecionado).alternarQuadro(indice);        
    }
    
    
    public boolean cadastrarTarefa(String titulo){
        if (titulo.trim().length() == 0){
            return false;
        }
        Lista lista = new Lista(titulo);
        usuarios.get(usuarioSelecionado).getQuadroSelecionado().cadastrarTarefa(lista);
        return true;
    }
   public String listarQuadros(){
        
        String mostrarQuadros = "";
        if (!quadros.isEmpty()){
        	for (int i = 0; i < quadros.size(); i++){
                mostrarQuadros =  "%d" +i+1+"\n%s"+ quadros.get(i).getTitulo();
           
        }
        	}
        else {
        	
             mostrarQuadros = "Não existem quadros.";
        	}
        return mostrarQuadros;
}
  
   
   
   
   public ArrayList<Lista>getTarefasCadastradas(){
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
        return true;
    }
    
    
    public ArrayList<Card> getCartoesCadastrados(){
        return usuarios.get(usuarioSelecionado).getQuadroSelecionado().getTarefaSelecionada().getCartoes();
    }
    
    
    public boolean selecionarCartao(int indice){
        return usuarios.get(usuarioSelecionado).getQuadroSelecionado().getTarefaSelecionada().alternarCartao(indice);        
    }
    
    
    public boolean adicionarDescricaoAoCartao(String descricao){
        if (descricao.trim().length() == 0){
            return false;
        }
        usuarios.get(usuarioSelecionado).getQuadroSelecionado().getTarefaSelecionada().getCartaoSelecionado().adicionarDescricao(descricao);
        return true;
    }
    
    
    public boolean adicionarDataParaEntregaDoCartao(String data){
        if (data.trim().length() == 0){
            return false;
        }
        usuarios.get(usuarioSelecionado).getQuadroSelecionado().getTarefaSelecionada().getCartaoSelecionado().adicionarDataParaEntrega(data);
        return true;
    }
    
    
    public boolean adicionarComentarioAoCartao(String comentario){
        if (comentario.trim().length() == 0){
            return false;
        }
        Comentario c = new Comentario(usuarios.get(usuarioSelecionado), comentario);
        usuarios.get(usuarioSelecionado).getQuadroSelecionado().getTarefaSelecionada().getCartaoSelecionado().adicionarComentario(c);
        return true;
    }
    
    
    public boolean adicionarEtiquetaAoCartao(String titulo, String cor){
        if (cor.trim().length() == 0 || titulo.trim().length() == 0){
            return false;
        }
        Etiquetas etiqueta = new Etiquetas(titulo, cor);
        usuarios.get(usuarioSelecionado).getQuadroSelecionado().getTarefaSelecionada().getCartaoSelecionado().adicionarEtiqueta(etiqueta);
        return true;
    }
    
    
    public void moverCartao(int lista, int cartao){
        usuarios.get(usuarioSelecionado).getQuadroSelecionado().moverCartao(lista, cartao);
}
    
}


