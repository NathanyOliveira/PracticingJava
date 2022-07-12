import java.util.Scanner;

public class NumeroMesAno {

	public static void main(String[] args) {
		
		System.out.println("Digite o dia desejado: ");
		Scanner scanner = new Scanner(System.in);
	
		String dia = scanner.nextLine();
		
		switch (dia) {
		case "Segunda":
			System.out.println("2");
			break;
		case "Terça":
			System.out.println("3");
			break;
		case "Quarta":
			System.out.println("4");
			break;
		case "Quinta":
			System.out.println("5");
			break;
		case "Sexta":
			System.out.println("6");
			break;
		case "Sábado":
			System.out.println("7");
			break;
		case "Domingo":
			System.out.println("1");
			break;
		default:
			System.out.println("Dia inválido");
			break;
			
			
		}	
	}
}
