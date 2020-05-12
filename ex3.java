import java.util.Scanner;

public class ex3 {

		
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int cod;
		
		Scanner leitor = new Scanner (System.in);
		
		System.out.println("Rotina de Inclusão de alunos | 1 ");
		System.out.println("Rotina de Altreção de alunos | 2 ");
		System.out.println("Rotina de Exlusão de alunos  | 3 ");
		System.out.println("Rotina de Consulta de alunos | 4 ");
		
		System.out.println();
		System.out.println();
		
		System.out.println("Digite o codigo: ");
		cod = leitor.nextInt();
		
		switch (cod) {
		
		case 1:
			System.out.println("Rotina de iclusão de alunos ");
			break;
			
		case 2:
			System.out.println("Rotina de Alteração de alunos ");
			break;
			
		case 3:
			System.out.println("Rotina de Exclusão de alunos ");
			break;
			
		case 4:
			System.out.println("Rotina de Consulta de alunos ");
			break;
			
		
		}
		
		
		
		
	}

}
