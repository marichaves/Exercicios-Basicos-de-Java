package exercicios;

import java.util.Scanner;

public class MediaAritmetica {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println(
				"Entre com as notas e quando terminar, aperte -1 para calcular a média aritmética.  ");

		boolean para = true;
		double sum = 0;
		double num;
		double n = 0;
		double aux = 0;

		do {
			num = scan.nextDouble();
			if (num != -1) {
				n++;
				sum += num;
			} else {
				aux = sum / n; // Calculate the average
				System.out.println("Média: " + aux); // Print the average
				para = false;
			}

		} while (para);

	}

}
