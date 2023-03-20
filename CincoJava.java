import java.util.Scanner;

public class CincoJava {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String matriz[][] = new String[3][5];
		Double notasSoma = 0.0;
		Double media = 0.0;
		Double maiorMedia = Double.MIN_VALUE;
		Double menorMedia = Double.MAX_VALUE;
		String alunoMaiorMedia = "";
		String alunoMenorMedia = "";
		
		for(int i = 0; i < 3; i++) {
			
			System.out.print("\nInforme o "+(i+1)+"° aluno: ");
			String nome = scanner.next();
			matriz[i][0] = nome;
			
			media = 0.0;
			notasSoma = 0.0;
			
			for(int j = 0; j < 4; j++) {
				
				System.out.print("Informe a "+(j+1)+"° nota: ");
				Double notaDigitada = scanner.nextDouble();
				matriz[i][j+1] = String.valueOf(notaDigitada);
				notasSoma += notaDigitada;
				
			}
			
			media = notasSoma/4;
			matriz[i][4] = String.valueOf(media);
			if(media > maiorMedia) {
				maiorMedia = media;
				alunoMaiorMedia = matriz[i][0];
			}
			
			if(media < menorMedia) {
				menorMedia = media;
				alunoMenorMedia = matriz[i][0];
			}
		}
		
		for(int i = 0; i < 3; i++) {
			
			System.out.println("\nNome aluno: "+matriz[i][0]);
			System.out.println("Média: "+matriz[i][4]);
			
		}
		
		System.out.println("\nAluno com a maior média: "+alunoMaiorMedia);
		System.out.println("Aluno com a menor média: "+alunoMenorMedia);
		
	}
	
}
