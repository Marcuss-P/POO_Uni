package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Products;

public class Program {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		Products[] pr = new Products[N];
		
		for (int i=0; i<N; i++) {
			sc.nextLine();
			System.out.print("Informe o nome do produto " + (i+1) +": ");
			String nome = sc.nextLine();
			System.out.print("Informe o preco do produto " + (i+1) +": ");
			double preco = sc.nextDouble();
			System.out.print("Produto importado? (s/n) ");
			char verif = sc.next().charAt(0);
			if(verif == 's') {
				System.out.println("Qual o valor da taxa? ");
				Double taxa = sc.nextDouble();
				pr[i] = new Products(nome, preco, taxa);
			}else {
				pr[i] = new Products(nome, preco);
			}		
			System.out.println();
		}
		
		System.out.println("-------------------");
		System.out.println();
		for (int i=0; i<N; i++) {
			
			System.out.println("Produto " + (i+1) + ": "+ pr[i].toString());
			
		}
		
		
		sc.close();
	}

}
