import java.util.*;
public class VotacaoPorcentagem {

	public static void main(String[] args) {
		System.out.println("Digite o número total de habitantes: ");
		Scanner input = new Scanner(System.in);
         Integer habitantes = input.nextInt();
         System.out.println("Digite o número total de votos brancos: ");
         Integer brancos = input.nextInt();
         System.out.println("Digite o número total de votos nulos: ");
         Integer nulos = input.nextInt();   
         System.out.println("Digite o número total de votos validos: ");
         Integer validos = input.nextInt();            


     int pBrancos = (brancos * 100    )    /  habitantes     ;
     int pNulos = (nulos *    100   )   /    habitantes     ;
     int pValidos = (validos *    100   )   /   habitantes        ;


     System.out.println("Brancos: " +    pBrancos       + "%");

     System.out.println("Nulos: " +     pNulos      + "%");

     System.out.println("Validos: " + pValidos          + "%");
	}
}