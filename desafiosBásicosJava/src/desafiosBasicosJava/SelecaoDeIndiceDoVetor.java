package desafiosBasicosJava;

import java.io.IOException;
import java.util.Scanner;
 
public class SelecaoDeIndiceDoVetor {
 
    public static void main(String[] args) throws IOException {
 
            Scanner input = new Scanner(System.in);
            String[] nomes = new String[5];
            for (int i = 0; i < nomes.length; i++)
            {
                nomes[i] = input.nextLine();
            }
 
            int pos = input.nextInt();
            System.out.println(nomes[pos]);
           
    }
}