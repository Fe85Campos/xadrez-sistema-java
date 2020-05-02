package tabuleiro;

public class Peca {

	protected Posicao posicao; // Essa posi��o se refere a matriz e n�o a posi��o no tabuleiro.
								// por isso ela vai estar em "PROTECTED". Para que n�o seja vis�vel
								// ao pacote(camada) de XADREZ.
								// Essa classe "posicao" faz parte da classe "tabuleiro"
	private Tabuleiro tabuleiro;

	public Peca(Tabuleiro tabuleiro) {  // A posi��o de uma pe�a recem criada, recebe valor de nulo.
		this.tabuleiro = tabuleiro;    // Pois a pe�a n�o foi colocada no tabuleiro ainda.
		posicao = null;
	}

	protected Tabuleiro getTabuleiro() { // Somente classes dentro do mesmo pacote(camada) e subclasses de pe�as XADREZ.PECAS
		return tabuleiro;				// v�o poder acessar o "tabuleiro" de uma pe�a.
	}								   // O "tabuleiro n�o vai ser acess�vel ao pacote(camada) XADREZ.
									  // Esse "tabuleiro" � de uso interno do pacote(camada) TABULEIRO.
									 // Isso permite que o sistema fique mais protegido e que os programadores cometam erros.
	
	// N�o foi usado o "setTabuleiro", pois n�o vai ser permitido que o tabuleiro seja alterado.
	
	

}
