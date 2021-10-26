package banco;

import java.util.Locale;
import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Quer registrar? (s/n)");
		char register = sc.next().charAt(0);
		if(register == 's') {
			System.out.println("Digite seu nome: ");
			String nome = sc.next();
		
			
		}
		
		sc.close();
	}

}
