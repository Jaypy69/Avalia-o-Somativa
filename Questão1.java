package AVlpa;
import java.util.Scanner;
public class Questão1 {

	public static void main(String[] args) {
		double A, B, Mul, Div, Soma, Sub;
		
		Scanner ler = new Scanner (System.in);
		
		System.out.print("Mostre o primeiro número: ");
		A = ler.nextDouble();
		
		System.out.print("Mostre o segundo número: ");
		B = ler.nextDouble();
		
		Mul = A*B;
		Div = A/B;
		Soma = A+B;
		Sub = A-B;
		
		System.out.println("O resultado da multiplicação é: "+Mul);
		System.out.println("O resultado da divisão é: "+Div);
		System.out.println("O resultado da soma é: "+Soma);
		System.out.println("O resultado da subtração é: "+Sub);
	}

}
