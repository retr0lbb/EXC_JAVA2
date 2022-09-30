package exercicios;
import java.util.Scanner;

public class ScannerCombusta {
	public static void main(String args[]) {
		float distancia,consumo;
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("escreva o consumo do seu carro otario: ");
		consumo = input.nextFloat();
		
		System.out.println("escreva a distancia do seu carro pau no cu: ");
		distancia = input.nextFloat();
		
		System.out.println("São necessarios "+distancia/consumo+" litros de gasosa para a distancia");
	}

}
