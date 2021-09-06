package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);
		
		System.out.print("Número de linhas da coluna: ");
		int m = read.nextInt();
		System.out.print("Número de colunas da matriz ");
		int n = read.nextInt();
		
		int[][] mat = new int[m][n];
		
		System.out.println("Informe os valores da matriz:");
		for (int i = 0 ; i < mat.length ; i++) {
			for (int j = 0 ; j < mat[i].length ; j++) {
				mat[i][j] = read.nextInt();
			}
		}
		
		System.out.print("Informe um número: ");
		int x = read.nextInt();
		
		for(int i = 0 ; i < mat.length ; i++) {
			for (int j = 0 ; j < mat[i].length ; j++) {
				if(x == mat[i][j]) {
					System.out.println("Posição: " + i + "," + j);
					if (i > 0) {
						System.out.println("Up: " + mat[i-1][j]);
					}
					if (j > 0) {
						System.out.println("Left: " + mat[i][j-1]);
					}
					if (i < mat.length - 1) {
						System.out.println("Down: " + mat[i+1][j]);
					}
					if (j < mat[i].length - 1) {
						System.out.println("Right: " + mat[i][j+1]);
					}
				}
			}
		}
		read.close();
	}

}
