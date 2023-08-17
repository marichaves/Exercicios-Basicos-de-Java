package exercicios;

import java.util.Scanner;

public class Temperaturas {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com a quantidade de temperaturas");
        int qtdTemperatura = scan.nextInt();
        double temperatura;
        double soma = 0;
        double maior = -Double.MAX_VALUE;  // Initialize with a very small value
        double menor = Double.MAX_VALUE;   // Initialize with a very large value

        for (int i = 1; i <= qtdTemperatura; i++) {
            System.out.println("Entre com a temperatura " + i + " : ");
            temperatura = scan.nextDouble();

            soma += temperatura;
            if (temperatura > maior) {
                maior = temperatura;
            }
            if (temperatura < menor) {
                menor = temperatura;
            }
        }
        System.out.println("Média: " + (soma / qtdTemperatura));
        System.out.println("Menor temperatura: " + menor);
        System.out.println("Maior temperatura: " + maior);
    }
}
