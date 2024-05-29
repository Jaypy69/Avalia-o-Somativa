package AVlpa;
import java.util.Scanner;
public class Questão3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int nm;
		System.out.print("Insira o dia da semana (1-7)");
		nm = ler.nextInt();
		
		if (nm==1) {
		System.out.print("Domingo");
		}
		else if (nm==2) {
	    System.out.print("Segunda-feira");
	 	}
		else if (nm==3) {
		System.out.print("Terça-feira");
		}
		else if (nm==4) {
		System.out.print("Quarta-feira");
		}
		else if (nm==5) {
		System.out.print("Quinta-feira");
		}
		else if (nm==6) {
		System.out.print("Sexta-feira");
		}
		else if (nm==7) {
	    System.out.print("Sábado");
		}
	}
	

}
