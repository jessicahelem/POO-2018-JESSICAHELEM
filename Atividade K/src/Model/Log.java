package Model;

import java.text.SimpleDateFormat;
import java.sql.Date;


public class Log {
	public String data;
	public String titulo;
	
	public Log(String data, String titulo ) {
		this.data=data;
		this.titulo=titulo;
	}
	
	public String addCard() {
		String s = "";
		
			s = "Card adicionado com sucesso!" +"Data: "+mostrarData();
	
		return s;	
}
	public SimpleDateFormat mostrarData() {
		Date data = new Date(System.currentTimeMillis());  
		SimpleDateFormat formatarDate = new SimpleDateFormat("dd-MM-yyyy"); 
		return formatarDate;
	}
	public String addComentario() {
		String comentario="";
		comentario="Um comentario foi adicionado no card."+" Data: "+mostrarData();
		return comentario;
	}
}
