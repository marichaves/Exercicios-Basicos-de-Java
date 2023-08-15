package exercicios;

import java.util.Scanner;

public class CrescimentoComEntrada {

	public static void main(String[] args) {
		Scanner entra = new Scanner(System.in);
		boolean valida = false;
		int populA;
		int populB;
		double taxaA;
		double taxaB;
		do {
			System.out.println("Informe a população da cidade A: ");
			 populA = entra.nextInt();
			
			if(populA > 0) {
				valida = true;
			} else {
				System.out.println("A população precisa ser maior que 0");
			}
		} while (!valida);
		
		 valida = false;
		do {
			System.out.println("Informe a população da cidade B: ");
			populB = entra.nextInt();
			
			if(populB> 0) {
				valida = true;
			} else {
				System.out.println("A população precisa ser maior que 0");
			}
		} while (!valida);
		
		valida = false;
		do {
		    System.out.println("Informe a taxa de crescimento da cidade A ");
		    taxaA = entra.nextDouble();
		    
		    if (taxaA > 0) {
		        valida = true;
		    } else {
		        System.out.println("A taxa precisa ser maior que 0");
		    }
		} while (!valida);

		valida = false;
		do {
		    System.out.println("Informe a taxa de crescimento da cidade B ");
		    taxaB = entra.nextDouble();
		    
		    if (taxaB > 0) {
		        valida = true;
		    } else {
		        System.out.println("A taxa precisa ser maior que 0");
		    }
		} while (!valida);

		
		int cont = 0;
		while(populA < populB) {
			populA += (populA/100) * taxaA;
			populB += (populB/100) * taxaB;
			cont++;
		}
		System.out.println("Quantidade de anos para a população da cidade A ser maior que a população da cidade"
				+ "B: " + cont);

	
	}

}
