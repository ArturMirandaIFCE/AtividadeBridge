package pactbridge;

/**
 *
 * @author lais, artur, joão marcos
 */
  
public class JanelaAviso extends JanelaAbstrata {
    

	public JanelaAviso(JanelaImplementada j) {
		super(j);
	}
	@Override
	public void desenhar() {
            
		desenharJanela("Janela De Aviso");
		desenharBotao("Ok");
	}

}