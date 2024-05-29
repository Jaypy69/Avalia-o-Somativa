package AVlpa;
import java.util.Scanner;
public class Questão4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int N[] = new int [15];
		int soma = 0;

		System.out.print("Digite 15 números: ");
		for (int i =0; i<15; i++) {
			N[i]= ler.nextInt();
			soma += N[i];
			
			System.out.println("O resultado da soma é: "+soma);
		}
	}
}
