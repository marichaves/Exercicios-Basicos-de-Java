package exercicios;

import java.util.Scanner;

public class Ficha {

	public static void main(String[] args) {
		Scanner entra = new Scanner(System.in);
		boolean validaInfo = false;

		do {
			System.out.println("Digite o nome: ");
			String nome = entra.next();
			if (nome.length() < 3) {
				System.out.println("O nome precisa de no mínimo 3 caracteres");
			} else {
				validaInfo = true;
			}

		} while (!validaInfo);

		validaInfo = false;
		do {
			System.out.println("Digite a idade");
			int idade = entra.nextInt();
			if (idade >= 0 && idade <= 100) {
				validaInfo = true;
			} else {
				System.out.println("A idade precisa estar entre 0 e 100");
			}
		} while (!validaInfo);

		validaInfo = false;
		do {
			System.out.println("Digite o salário");
			float salario = entra.nextFloat();
			if (salario > 0) {
				validaInfo = true;
			} else {
				System.out.println("O salário precisa ser maior que 0");
			}
		} while (!validaInfo);

		validaInfo = false;
		do {
			System.out.println("Digite o sexo: ");
			String sexo = entra.next();
			if (sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")) {
				validaInfo = true;

			} else {
				System.out.println("O sexo pode ser f(feminino) ou m(masculino)");
			} 
		} while (!validaInfo);

		
		validaInfo = false;
		 do {
			 System.out.println("Digite o estado civil: ");
			 String civil = entra.next();
				if(civil.equalsIgnoreCase("s") || civil.equalsIgnoreCase("c")) {
					validaInfo = true;
					
				} else {
					System.out.println("O estado civil pode ser s(Solteiro) ou c(Casado)");
				} 
		 } while (!validaInfo);
		
	}

}


