package pactbridge;

/**
 *
 * @author lais, artur, joão marcos
 */

public class JaneladeDialogo extends JanelaAbstrata {

    public JaneladeDialogo(JanelaImplementada j) {
        super(j);
	}

	@Override
	public void desenhar() {
            
	desenharJanela("Janela de Diálogo");
	desenharBotao("Botão Sim");
	desenharBotao("Botão Não");
	desenharBotao("Botão Cancelar");
	}

}
