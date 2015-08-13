package locadoraIO;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.IOException;
import java.io.InputStreamReader;


public class Lerteclado {
	InputStream inputStream;
	BufferedReader bufferedReader;
	InputStreamReader inputStreamReader;

	public Lerteclado() throws IOException {
		
		//Ler cadeia de bytes de um teclado 
		 inputStream = System.in;
		
		//Converte para Char 
		 inputStreamReader = 
				new InputStreamReader (inputStream);
		
		//Conctena o conjunto de Char em uma String 
		 bufferedReader = 
				new BufferedReader (inputStreamReader);
		
		
		
	}
	
       public String lerLinha() throws IOException{
    	   //Lê uma linha
    	   String line = bufferedReader.readLine();
    	   return line;
		
	}
       
   public void close() throws IOException{
	   
	 //Close 
	 		bufferedReader.close();
   }

}
