package view;

import controller.SomaMatrizThread;

public class Principal {

	public static void main(String[] args) {
		int matriz[][] = new int[3][5];
	
		// int num = (int) (Math.random() * 10) + 1; // cria um número entre 1 a 10
		
		for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = (int) (Math.random() * 10) + 1;
            }
        }
		
		// Só pra da print na matriz para conferência
		// Lembrando que por ser Thread vai sair fora de ordem
        System.out.println("Matriz:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
		
		for (int i = 0; i < 3; i++) {
			SomaMatrizThread t = new SomaMatrizThread(matriz[i], i);
			t.start();
		}
		
	}
}