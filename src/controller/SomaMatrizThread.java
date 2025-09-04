package controller;

public class SomaMatrizThread extends Thread {
	private int[] linha;
	private int idLinha;

	public SomaMatrizThread() {}
	// O this faz referência ao parâmetro da classe
	public SomaMatrizThread(int[] linha, int idx) {
		this.linha = linha;
		idLinha = idx; // arrumar isso
	}
	
	public void run() {
		soma();
    }
	
	private void soma() {
		int soma = 0;
		for (int valor : linha) {
			soma += valor;
		}
		System.out.println("Linha " + idLinha + " => soma = " + soma);
	}
	
}