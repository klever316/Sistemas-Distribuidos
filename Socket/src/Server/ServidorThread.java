package Server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorThread {

	public ServidorThread() throws IOException {
		//Criando servidor
		ServerSocket servidor = new ServerSocket(12345);
		System.out.println("Porta 12345 est� aberta!");
		
		while(true) {
			
		//Espera um cliente se conectar e imprime o seu IP
		Socket cliente = servidor.accept();
		  System.out.println("Nova conex�o com o cliente: " +
		    cliente.getInetAddress().getHostAddress()
		    );
		  
		//Cria um objeto que vai tratar a conex�o
		TratarConexaoServidorSimples tratamento = new TratarConexaoServidorSimples(cliente);
		
		//Cria a thread em cima deste objeto
		Thread t = new Thread(tratamento);
		
		//Inicia a thread
		t.start();
		}
				
	}

}
