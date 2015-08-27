import java.io.IOException;

import NegocioLoc.Cliente;
import NegocioLoc.Funcionario;
import locadora.io.EscreverArquivo;
import locadora.io.LerTeclado;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// //new LerTeclado();
		// LerTeclado lerTeclado = new LerTeclado();
		//
		// String linha = lerTeclado.lerLinha();
		//
		// lerTeclado.close();
		//
		// new EscreverArquivo(linha);

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

		EscreverArquivo escreverArquivo1 = new EscreverArquivo("RegistroFuncionarios");
		LerTeclado lerTeclado1 = new LerTeclado();
		Funcionario funcionario = new Funcionario();
		
		System.out.println("Informe o nome do Funcionário");
		String nome1 = lerTeclado1.lerLinha();
		funcionario.setNome(nome1);

		System.out.println("Informe a lotação do Funcionário");
		String lotacao = lerTeclado1.lerLinha();
		funcionario.setLotacao(lotacao);

		escreverArquivo1.escreverLinha(funcionario.toString());

		escreverArquivo1.close();

	}
}
