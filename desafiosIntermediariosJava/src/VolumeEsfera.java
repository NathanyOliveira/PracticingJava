
import java.util.Scanner;

public class VolumeEsfera {
 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//TODO: Complete os espa�os em branco com uma poss�vel solu��o para o desafio 
		double pi = 3.14159;
		double R = sc.nextDouble();
		double volume = (4/3.0) * pi * (Math.pow(R, 3.0));
		System.out.printf("VOLUME = %.3f%n", volume);
 }
	
}