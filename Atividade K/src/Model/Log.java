package Model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.sql.Date;


public class Log {
	 
    private String logs;
  
    public Log(String log){
        this.logs = log;

    }
    
    public String getLog() {
        return logs;
    }  
}
