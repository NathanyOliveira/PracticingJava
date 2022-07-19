import java.util.*;
public class Porcentagem {

	public static void main(String[] args) {
		System.out.println("Digite o desconto: ");
		Scanner input = new Scanner(System.in);

        Integer desconto = input.nextInt();
		System.out.println("Digite o valor do produto: ");

        Integer precoAntigo = input.nextInt();
     int precoNovo = precoAntigo - (precoAntigo * desconto /100  );
     System.out.println("Preço novo: " + precoNovo);
	}
}