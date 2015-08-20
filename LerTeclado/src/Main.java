import java.io.IOException;

import NegocioLoc.Cliente;
import locadora.io.EscreverArquivo;
import locadora.io.LerTeclado;


public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
//		//new LerTeclado();
//		LerTeclado lerTeclado = new LerTeclado();
//		
//		String linha = lerTeclado.lerLinha();
//		
//		lerTeclado.close();
//		
//		new EscreverArquivo(linha);

			
		EscreverArquivo escreverArquivo = new EscreverArquivo("RegistrosCliente");
		LerTeclado lerTeclado = new LerTeclado();
		Cliente cliente = new Cliente();
		
		System.out.println("Informe o nome do cliente");
		String nome = lerTeclado.lerLinha();
		cliente.setNome(nome);
		
		System.out.println("Informe o id do cliente");
		String id = lerTeclado.lerLinha();
		cliente.setId(Integer.parseInt(id));
		
		escreverArquivo.escreverLinha(cliente.toString());
		
		escreverArquivo.close();
		
	}

}
