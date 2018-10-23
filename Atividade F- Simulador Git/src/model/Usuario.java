package model;

import java.util.ArrayList;

public class Usuario {
	
	public String nome;
	public String senha;
	public ArrayList<Repositorio>repositorios=new ArrayList<Repositorio>();
	
	public Usuario(String nome,String senha) {
		this.nome=nome;
		this.senha=senha;
		this.repositorios=repositorios;
	}
	public boolean loginUsuario(String nome,String senha) {
		if(this.nome==nome && this.senha==senha) {
			return true;
		}else {
			return false;
		}
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public ArrayList<Repositorio> getRepositorios() {
		return repositorios;
	}
	public void setRepositorios(ArrayList<Repositorio> repositorios) {
		this.repositorios = repositorios;
	}
}
