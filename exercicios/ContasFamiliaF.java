package exercicios;
import java.util.Scanner;
public class ContasFamiliaF {
	public static void main(String args[]) {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		float conta1,conta2,conta3, total;
		String nc1,nc2,nc3;
		
		System.out.println("Conta de :" );
		nc1 = input.nextLine();
		System.out.println("valor da conta: " );
		conta1 = input.nextFloat();
		
		System.out.println("Conta de :" );
		nc2 = input.next();
		System.out.println("valor da conta: " );
		conta2 = input.nextFloat();
		
		System.out.println("Conta de :" );
		nc3 = input.next();
		System.out.println("valor da conta: " );
		conta3 = input.nextFloat();
		
		total = conta1+conta2+conta3;
		
		System.out.println("O valor total de todas as contas que são "+ nc1+" que vale "+conta1+", "+ nc2+
				" que vale "+conta2+", "+ nc3+" que vale "+conta3+" é de :"+ total+" R$");
	}

}
