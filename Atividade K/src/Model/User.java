package Model;

import java.util.ArrayList;

public class User {
    private String nome;
    private String login;
    private String senha;
    public ArrayList<Quadro> quadros = new ArrayList<>();
    private int quadroSelecionado = 0;
    public int posicao=0;
    
    public User(String nome, String login, String senha){
        this.nome = nome;
        this.login = login;
        this.senha = senha;
    }
    
    
    public void cadastrarNovoQuadro(Quadro quadro){
        quadros.add(quadro);
        posicao++;
        
    }
   
    
    
   
    
    public ArrayList<Quadro> getQuadros(){
        return this.quadros;
    }
    
    
    public Quadro getQuadroSelecionado(){
        return quadros.get(quadroSelecionado);
    }
    
    
    public boolean alternarQuadro(int indice){
        if (indice < 0 || indice >= quadros.size()){
            return false;
        }
        this.quadroSelecionado = indice;
        return true;
    }
    
    
    public boolean login(String login, String senha){
        return this.login.equals(login) && this.senha.equals(senha);
    }

    
    public String getNome() {
        return nome;
    }

    
    public String getLogin() {
        return login;
    }
}