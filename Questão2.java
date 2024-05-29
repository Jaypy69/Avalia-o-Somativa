package AVlpa;
import java.util.Scanner;
public class Questão2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int A, B, H;
		System.out.print("Insira a base do triângulo: ");
		B = ler.nextInt();
		
		System.out.print("Insira a altura: ");
		H = ler.nextInt();
		
		A = (B*H)/2;
		System.out.print("A área do triângulo é: "+A);
	}

}
