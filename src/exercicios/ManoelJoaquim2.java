package exercicios;

import java.util.Scanner;

public class ManoelJoaquim2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double val = 1;
        double sum = 0;
        String iniciar;

        for (int i = 1; i != 0; i++) {
            System.out.println("Deseja iniciar uma compra?");
            iniciar = scan.next();

            if (iniciar.equalsIgnoreCase("sim")) {
                boolean fim = false;  

                do {
                    System.out.println("Digite o valor do produto:                  ------ Quando quiser terminar o registro da compra, aperte 0 para terminar a compra. ------ ");
                    val = scan.nextDouble();
                    if (val != 0) {
                        sum += val;
                    } else {
                        System.out.println("O total foi de R$" + sum);
                        fim = true; 
                    }
                } while (!fim);
            }
        }
    }
}

