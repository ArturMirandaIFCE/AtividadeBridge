package pactbridge;

/**
 *
 * @author lais, artur, joão marcos
 */


public class JanelaMac implements JanelaImplementada {

	@Override
	public void desenharJanela(String titulo) {
		System.out.println(titulo + " - Janela Mac");
	}

	@Override
	public void desenharBotao(String titulo) {
		System.out.println(titulo + " - Botão Mac");
	}

}