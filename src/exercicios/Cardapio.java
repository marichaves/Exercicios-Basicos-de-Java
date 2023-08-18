package exercicios;
import java.util.Scanner;

public class Cardapio {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean naoTerminar = true;
		int cod;
		double  qtd;
		double total = 0;
		String output = "";
		
		do {
			System.out.println("Digite o código e a quantidade. Digite 0 0 para sair.");
			cod = scan.nextInt();
			qtd = scan.nextDouble();
			
			if (cod == 0 && qtd == 0) {
				naoTerminar = false;
				output += "Total a pagar ------- R$" + total;
			} else {
				
					if (cod ==100 ) {
						output += "Cachorro Quente -> 1,20 * " + qtd ;
						output += " = " + (1.2*qtd) + "\n";
						total += 1.2*qtd;
					} else if (cod == 101 ) {
						output += "Bauru Simples -> 1,30 * " + qtd ;
						output += " = " + (1.3*qtd) + "\n";
						total += 1.3*qtd;
					}  else if (cod == 102 ) {
						output += "Bauru com ovo -> 1,50 * " + qtd ;
						output += " = " + (1.5*qtd) + "\n";
						total += 1.5*qtd;
					}  else if (cod == 103 ) {
						output += "Croissant -> 2,50 * " + qtd ;
						output += " = " + (2.5*qtd) + "\n";
						total += 2.5*qtd;
					}  else if (cod == 104 ) {
						output += "Docinho -> 1,70 * " + qtd ;
						output += " = " + (1.7*qtd) + "\n";
						total += 1.7*qtd;
					}  
			}
			
		} while(naoTerminar);
		
		System.out.println(output);

	}

}
