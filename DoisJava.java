import java.util.Scanner;

public class DoisJava {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Double[] vetor = new Double[5];
		Double maiorN = Double.MIN_VALUE;
		Double menorN = Double.MAX_VALUE;
		
		for (int i = 0; i < 5; i++) {
			
			System.out.print("Insira o "+(i+1)+"° número: ");
			Double numeroDigitado = scanner.nextDouble();
			vetor[i] = numeroDigitado;
			
			if (vetor[i] > maiorN) {
				maiorN = vetor[i];
			}
			
			if (vetor[i] < menorN) {
				menorN = vetor[i];
			}
			
		}
		
		System.out.println("Maior número: "+maiorN);
		System.out.println("Menor número: "+menorN);
		
	}
	
}
