package arraylist;

import java.util.Scanner;

public class Atividade3 {
	public static void main(String[] args) {

		int A[] = new int[5];
		int B[] = new int[5];
		int C[] = new int[10];

		Scanner ler = new Scanner(System.in);

		System.out.println("Digite os valores do vetor A: ");
		for (int i = 0; i < 5; i++) {
			System.out.println("Valor" + (i + 1) + ": ");
			A[i] = ler.nextInt();

		}

		System.out.println("Digite os valores do vetor A: ");
		for (int i = 0; i < 5; i++) {
			System.out.println("Valor" + (i + 1) + ": ");
			B[i] = ler.nextInt();

		}

		for (int i = 0; i < 5; i++) {
			C[i] = A[i];
		}
		for (int i = 0; i < 5; i++) {
			C[i] = B[i];
		}
		System.out.println("Vetor A");
		for (int i = 0; i < 5; i++) {
			System.out.println(A[i] + " ");
		}
		System.out.println("Vetor B");
		for (int i = 0; i < 5; i++) {
			System.out.println(C[i] + " ");
		}
		System.out.println("Vetor C");
		for (int i = 0; i < 10; i++) {
			System.out.println(C[i] + " ");
		}
		ler.close();
	}
}
