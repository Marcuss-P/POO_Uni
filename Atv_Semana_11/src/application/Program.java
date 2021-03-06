package application;

import java.util.Scanner;

import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		PessoaFisica pessoaFisica = null;
		PessoaJuridica pessoaJuridica = null;
		
		System.out.print("Total de contribuintes: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
		
			System.out.println();
			System.out.print("Digite 1 para pessoa Fisica e 2 para pessoa Juridica: ");
			int tipo = sc.nextInt();
			if(tipo == 1) {
				System.out.print("Digite seu nome: ");
				sc.nextLine();
				String nome = sc.nextLine();
				System.out.print("Digite sua renda anual: ");
				double rendaAnual = sc.nextDouble();
				System.out.print("Digite seu gasto com a saude: ");
				double gastoSaude = sc.nextDouble();
				
				pessoaFisica = new PessoaFisica(nome, rendaAnual, gastoSaude);
			} else {
				System.out.print("Digite seu nome: ");
				sc.nextLine();
				String nome = sc.nextLine();
				System.out.print("Digite sua renda anual: ");
				double rendaAnual = sc.nextDouble();
				System.out.print("Digite o total de funcionarios: ");
				double funcionario = sc.nextDouble();
				
				pessoaJuridica = new PessoaJuridica(nome, rendaAnual, funcionario);
			}	
		}
		
		System.out.println();
		System.out.println(pessoaFisica);
		System.out.println(pessoaJuridica);
		
		
		sc.close();
	}
	
}
