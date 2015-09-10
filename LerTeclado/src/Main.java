
import java.io.IOException;

import NegocioLoc.Cliente;
import NegocioLoc.Filmes;
import NegocioLoc.Funcionario;
import locadora.io.EscreverArquivo;
import locadora.io.LerArquivo;
import locadora.io.LerTeclado;

public class Main {

	private static final String REGISTRO_CLIENE = "RegistrosCliente"; 
	
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

		//Escreve arquivo
		//escrever();
		
		//Ler arquivo


	}
	
	public static void lerArquivo() throws IOException{
		
		LerArquivo lerArquivo = new LerArquivo(REGISTRO_CLIENE);
		
		String linha = lerArquivo.readLine();
		while(linha != null){
			
			String[] lista = linha.split("#");
			
			linha = lerArquivo.readLine();
		}
	}
	
	public static void escrever() throws IOException{

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

		EscreverArquivo escreverArquivo2 = new EscreverArquivo("RegistroFilmes");
		LerTeclado lerTeclado2 = new LerTeclado();
		Filmes filme = new Filmes();

		System.out.println("Informe o nome do Filmes ");
		String NomeFilme = lerTeclado2.lerLinha();
		filme.setNomeFilme(NomeFilme);

		System.out.println("Informe o tipo de filme: ");
		String TipoFilme = lerTeclado2.lerLinha();
		filme.setTipoFilme(TipoFilme);

		System.out.println("Informe a quantidade de filmes: ");
		String QuantidadeFilme = lerTeclado2.lerLinha();
		filme.setQuantidadeFilme(Integer.parseInt(QuantidadeFilme));

		escreverArquivo2.escreverLinha(filme.toString());

		escreverArquivo2.close();
	}
	
}
