import java.util.Scanner;

public class TresJava {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String msg = "";
		char resposta = 'S';
		
		while (resposta == 'S') {
			
			Double notasSoma = 0.0;
			System.out.print("Informe o nome do aluno: ");
			String nome = scanner.next();
			
			for (int i = 0; i < 4; i++) {
				
				System.out.print("Insira a "+(i+1)+"° nota: ");
				Double notaDigitada = scanner.nextDouble();
				notasSoma += notaDigitada;
			}
			
			msg += "\n\nNome do aluno: "+nome+"\nMédia: "+notasSoma/4;
			if((notasSoma/4) >= 6) {
				msg += "\nSituação: Aprovado";
			} else {
				msg += "\nSituação: Reprovado";
			}
			
			System.out.println("Deseja informar outro aluno?");
			resposta = scanner.next().toUpperCase().charAt(0);
			
		}
		
		System.out.println(msg);
		
	}
	
}
