import java.util.Scanner;

public class UmJava {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Double contador = 0.0;
		String msg = "";
		
		for (int i = 1; i < 6; i++) {
			
			System.out.print("Insira o "+i+"� n�mero: ");
			Double numeroDigitado = scanner.nextDouble();
			contador += numeroDigitado;
			
			if (numeroDigitado % 2 == 0) {
				msg += "\n"+i+"� n�mero: Par";
			} else {
				msg += "\n"+i+"� n�mero: �mpar";
			}
			
		}
		
		System.out.println(msg);
		System.out.println("\nM�dia dos 5 n�meros: "+contador/5);
		
	}
	
}
