package pactbridge;

/**
 *
 * @author lais, artur, joão marcos
 */

public class Cliente {
	
	public static void main(String[] args) {
		JanelaAbstrata janela = new JaneladeDialogo(new JanelaLinux());
		janela.desenhar();
                
                
		janela = new JanelaAviso(new JanelaLinux());
		janela.desenhar();

		janela = new JaneladeDialogo(new JanelaWindows());
		janela.desenhar();
                
                janela = new JaneladeDialogo(new JanelaMac());
		janela.desenhar();

}
}