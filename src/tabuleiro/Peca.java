package tabuleiro;

public class Peca {

	protected Posicao posicao; // Essa posição se refere a matriz e não a posição no tabuleiro.
								// por isso ela vai estar em "PROTECTED". Para que não seja visível
								// ao pacote(camada) de XADREZ.
								// Essa classe "posicao" faz parte da classe "tabuleiro"
	private Tabuleiro tabuleiro;

	public Peca(Tabuleiro tabuleiro) {  // A posição de uma peça recem criada, recebe valor de nulo.
		this.tabuleiro = tabuleiro;    // Pois a peça não foi colocada no tabuleiro ainda.
		posicao = null;
	}

	protected Tabuleiro getTabuleiro() { // Somente classes dentro do mesmo pacote(camada) e subclasses de peças XADREZ.PECAS
		return tabuleiro;				// vão poder acessar o "tabuleiro" de uma peça.
	}								   // O "tabuleiro não vai ser acessível ao pacote(camada) XADREZ.
									  // Esse "tabuleiro" é de uso interno do pacote(camada) TABULEIRO.
									 // Isso permite que o sistema fique mais protegido e que os programadores cometam erros.
	
	// Não foi usado o "setTabuleiro", pois não vai ser permitido que o tabuleiro seja alterado.
	
	

}
