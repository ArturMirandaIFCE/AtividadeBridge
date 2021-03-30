package pactbridge;

/**
 *
 * @author lais, artur, joão marcos
 */
  
public class JaneladeAviso extends JanelaAbstrata {
    

	public JaneladeAviso(JanelaImplementada j) {
		super(j);
	}
	@Override
	public void desenhar() {
            
		desenharJanela("Janela De Aviso");
		desenharBotao("Ok");
	}

}