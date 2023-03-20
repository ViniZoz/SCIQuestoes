import java.util.Scanner;

public class UmJava {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Double contador = 0.0;
		String msg = "";
		
		for (int i = 1; i < 6; i++) {
			
			System.out.print("Insira o "+i+"° número: ");
			Double numeroDigitado = scanner.nextDouble();
			contador += numeroDigitado;
			
			if (numeroDigitado % 2 == 0) {
				msg += "\n"+i+"° número: Par";
			} else {
				msg += "\n"+i+"° número: Ímpar";
			}
			
		}
		
		System.out.println(msg);
		System.out.println("\nMédia dos 5 números: "+contador/5);
		
	}
	
}
