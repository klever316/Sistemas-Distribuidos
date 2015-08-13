import java.io.IOException;

import locadora.io.EscreverArquivo;
import locadora.io.LerTeclado;


public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//new LerTeclado();
		LerTeclado lerTeclado = new LerTeclado();
		
		String linha = lerTeclado.lerLinha();
		
		lerTeclado.close();
		
		new EscreverArquivo(linha);

	}

}
