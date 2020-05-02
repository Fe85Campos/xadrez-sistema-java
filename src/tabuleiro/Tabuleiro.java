package tabuleiro;

public class Tabuleiro {
	
	private int linhas;
	private int colunas;
	private Peca[][] pecas;
	
	public Tabuleiro(int linhas, int colunas) {
		this.linhas = linhas;
		this.colunas = colunas;
		pecas = new Peca[linhas][colunas]; // Matriz pecas foi inst�nciada com Peca na quantidade de [linhas] e [colunas] informadas.
	}

	public int getLinhas() {
		return linhas;
	}

	public void setLinhas(int linhas) {
		this.linhas = linhas;
	}

	public int getColunas() {
		return colunas;
	}

	public void setColunas(int colunas) {
		this.colunas = colunas;
	}
	
	// N�o vai ter gets e sets de pecas, pois v�o ter m�todos na classe "tabuleiro" que vai retornar uma peca dado uma linha e coluna
   // ou uma posicao.
  // A classe "tabuleiro" n�o vai retornar a matriz inteira, s� vai retornar uma peca por vez.
	
	
}
