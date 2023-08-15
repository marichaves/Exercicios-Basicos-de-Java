package exercicios;

public class Crescimento {

	public static void main(String[] args) {
		int populA = 80000;
		int populB = 200000;
		int cont = 0;
		
		while(populA < populB) {
			populA += (populA/100) * 3;
			populB += (populB/100) * 1.5;
			cont++;
		}
		System.out.println("Quantidade de anos para a população da cidade A ser maior que a população da cidade"
				+ "B: " + cont);
	}

}
