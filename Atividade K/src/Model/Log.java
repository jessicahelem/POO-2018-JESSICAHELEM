package Model;

import java.text.DateFormat;
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
		
			s = "Card adicionado com sucesso!" +"Data: "+getDateTime();
	
		return s;	
}
	public String getDateTime() { 
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); 
		Date date = new Date(0); 
		return dateFormat.format(date); 
	}
	

	public String addComentario() {
		String comentario="";
		comentario="Um comentario foi adicionado no card."+" Data: "+getDateTime();
		return comentario;
	}
}
