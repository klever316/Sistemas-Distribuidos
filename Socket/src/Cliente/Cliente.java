package Cliente;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Cliente {

	public Cliente() throws IOException {
		
		//Conecta ao servidor
		Socket cliente = new Socket ("127.0.0.1", 12345);
		PrintStream saida = new PrintStream(cliente.getOutputStream());
		System.out.println("O cliente se conectou na bagaça!");
		
		//Ler do teclado e envia para o servidor
		System.out.println("Digite qualquer coisa aí: ");
		Scanner teclado = new Scanner(System.in);
		while(teclado.hasNextLine()){
			saida.println(teclado.nextLine());
		}
		
		//Fecha conexão
		saida.close();
		teclado.close();
		cliente.close();
	}

}
