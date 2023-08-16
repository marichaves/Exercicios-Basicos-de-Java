package exercicios;

import java.util.Scanner;

public class MediaDeIdade {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println(
				"Entre a idade das pessoas. (digite -1 para calcular)  ");

		boolean para = true;
		double sum = 0;
		double num;
		double n = 0;
		double media = 0;

		do {
			num = scan.nextDouble();
			if (num != -1) {
				n++;
				sum += num;
			} else {
				media = sum / n; // Calculate the average
				System.out.println("Média: " + media);
				if(media >= 60) {
					System.out.println("Turma idosa");
				} else if (media >= 25 && media <= 60) {
					System.out.println("Tuma adulta");
				} else {
					System.out.println("Turma jovem");
				}
				para = false;
			}

		} while (para);


	}

}
