package tabuleiro;

public class Tabuleiro {
	
	private int linhas;
	private int colunas;
	private Peca[][] pecas;
	
	public Tabuleiro(int linhas, int colunas) {
		this.linhas = linhas;
		this.colunas = colunas;
		pecas = new Peca[linhas][colunas]; // Matriz pecas foi instânciada com Peca na quantidade de [linhas] e [colunas] informadas.
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
	
	// Não vai ter gets e sets de pecas, pois vão ter métodos na classe "tabuleiro" que vai retornar uma peca dado uma linha e coluna
   // ou uma posicao.
  // A classe "tabuleiro" não vai retornar a matriz inteira, só vai retornar uma peca por vez.
	
	
}
