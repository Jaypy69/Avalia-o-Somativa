package AVlpa;
import java.util.Scanner;
public class Questão5 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
			String A[] = new String[6];

			for (int i =0; i<6; i++) {
				System.out.println("Qual a marca do carro que irá para a garagem?:");
				A[i]= ler.next();
			}
			for (int i =0; i<6; i++) {
				System.out.println(A[i]);     
	}
}
}