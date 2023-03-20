import java.util.Scanner;

public class QuatroJava {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Double[] vetor = new Double[5];

		for (int i = 0; i < 5; i++) {

			System.out.print("Insira o " + (i + 1) + "° número: ");
			Double numeroDigitado = scanner.nextDouble();
			vetor[i] = numeroDigitado;

		}
		
		System.out.println("Valor da posição 3 do vetor: "+vetor[3]);

	}

}
