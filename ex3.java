import java.util.Scanner;

public class ex3 {

		
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int cod;
		
		Scanner leitor = new Scanner (System.in);
		
		System.out.println("Rotina de Inclus�o de alunos | 1 ");
		System.out.println("Rotina de Altre��o de alunos | 2 ");
		System.out.println("Rotina de Exlus�o de alunos  | 3 ");
		System.out.println("Rotina de Consulta de alunos | 4 ");
		
		System.out.println();
		System.out.println();
		
		System.out.println("Digite o codigo: ");
		cod = leitor.nextInt();
		
		switch (cod) {
		
		case 1:
			System.out.println("Rotina de iclus�o de alunos ");
			break;
			
		case 2:
			System.out.println("Rotina de Altera��o de alunos ");
			break;
			
		case 3:
			System.out.println("Rotina de Exclus�o de alunos ");
			break;
			
		case 4:
			System.out.println("Rotina de Consulta de alunos ");
			break;
			
		
		}
		
		
		
		
	}

}
