package arraylist;

import java.util.Scanner;

public class Atividade2 {
	public static void main(String[] args) {
		int a[] = new int[5];
		int soma = 0;

		Scanner ler = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			System.out.println("Informe o valor " + (i + 1) + " :");
			a[i] = ler.nextInt();
			soma += a[i];
		}
		if (soma > 30) {
			System.out.println("A soma dos valores é: " + soma);
		} else {
			System.out.println("O valor é menor do que 30");
		}
		ler.close();

	}
}
