package Server;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class TratarConexaoServidorSimples implements Runnable{

	Socket cliente;
	public TratarConexaoServidorSimples(Socket cliente) {
		this.cliente = cliente;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//Lê as informações enviadas pelo cliente
		Scanner s;
		try {
			s = new Scanner(cliente.getInputStream());
			while(s.hasNextLine()){
				System.out.println(s.nextLine());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
}
