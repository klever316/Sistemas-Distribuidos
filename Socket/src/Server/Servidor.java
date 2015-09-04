package Server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Servidor {
	
	
	public Servidor() throws IOException{

		//Criando servidor
		ServerSocket servidor = new ServerSocket(12345);
		System.out.println("Porta 12345 est� toda arreganhada!");
		
		//Espera um cliente se conectar e imprime o seu IP
		Socket cliente = servidor.accept();
		System.out.println("Nova conex�o com o cliente: " + cliente.getInetAddress().getHostAddress());
		
		//L� as informa��es enviadas pelo cliente
		Scanner s = new Scanner(cliente.getInputStream());
		while(s.hasNextLine()){
			System.out.println(s.nextLine());
		}
		
		//Fecha a conex�o
		System.out.println("Conclui a conex�o");
		s.close();
		servidor.close();
		cliente.close();
		
	}

}	
