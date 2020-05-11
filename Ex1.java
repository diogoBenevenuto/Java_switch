import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		
		System.out.println("MENU ");
		System.out.println("001 - Parafuso ");
		System.out.println("002 - Porca ");
		System.out.println("003 - Prego ");
		System.out.println("004 - Ferramnta ");
		
		Scanner leitor = new Scanner (System.in);
		
		 System.out.println("Digite um numero de 001 a 004: ");
		 num = leitor.nextInt();
		
		switch (num) {
		case 1:
			System.out.println(" Voce escolheu a opção Parafuso ");
			break;
		case 2:
			System.out.println(" Voce escolheu a opção Porca ");
			break;
		case 3:
			System.out.println(" Voce escolheu a opção Prego ");
			break;
		case 4:
			System.out.println(" Voce escolheu a opção Ferramentas ");
			break;
		default:
			System.out.println("Opção invalida ");
		
		}
	}

}
