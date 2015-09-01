package locadora.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class LerArquivo {

	InputStream inputStream; 
	InputStreamReader inputStreamReader;
	BufferedReader bufferedReader;
	
	public LerArquivo(String nomeArquivo) throws IOException{

		/**
		 * Abre o arquivo existente no Sistema de Arquivo e permite a leitura Byte a Byte
		 */
		inputStream = new FileInputStream(nomeArquivo); 
		/**
		 * Próximo passo será ler os Bytes existente no arquivo e converte-los em Char
		 * seguindo o padrão Unicode apropriado, quem vai fazer essa tarefa é a classe
		 * InputStreamReader
		 */
		
		inputStreamReader = new InputStreamReader(inputStream);
		/**
		 * Agora o próximo passo é concatenar os Chars para formar Strings,
		 * quem fara isso é a classe 
		 */
		bufferedReader = new BufferedReader(inputStreamReader);	    
	}
	
	public String readLine() throws IOException{
		
	    /**
	     *  O método readLine ler uma linha e salta para a próxima. Quando chega ao fim
	     *  do arquivo o valor Null é retornado
	     */
    	return bufferedReader.readLine();
	}

	
	public void fechaArquivo() throws IOException{
	    bufferedReader.close();
	}

}
