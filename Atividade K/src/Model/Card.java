package Model;

import java.util.ArrayList;

public class Card {
	
	public String titulo;
	public String descricao;
	public ArrayList<Comentario>comentario=new ArrayList<>(); 
	public boolean status;
	public ArrayList<Log> logs= new ArrayList<>();
	
	public Card(String titulo) {
	
		this.titulo=titulo;
		this.descricao=descricao;
		this.comentario=comentario;
		this.status=false; 
		this.logs=logs;		
	}
	
	public Card(Card card) {
		this.titulo= card.getTitulo();
		this.descricao=card.getDescricao();
		this.comentario=card.getComentario();
		this.status=card.status; 
		this.logs=card.getLogs();		
	}

	public boolean mudarStatus() {
		this.status=true;
		return status;
	}
	public void addDescricao(String descricao) {
		this.descricao=descricao;
		//addLista(log(titulo = "O usuario Adicionou Descrição", Data))
	}
	public void editarCard(String novo) {
		
			this.descricao = this.descricao +"\n" + novo;
			
	}
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public ArrayList<Comentario> getComentario() {
		return comentario;
	}

	public void setComentario(ArrayList<Comentario> comentario) {
		this.comentario = comentario;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public ArrayList<Log> getLogs() {
		return logs;
	}

	public void setLogs(ArrayList<Log> logs) {
		this.logs = logs;
	}
	
	

}
