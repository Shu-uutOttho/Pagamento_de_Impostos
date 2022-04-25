package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.contribuinte;
import entities.pessoaFisica;
import entities.pessoaJuridica;

public class program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<contribuinte> list = new ArrayList<contribuinte>();

		System.out.print("Entre com o numero de contribuintes:");
		int N = sc.nextInt();

		for (int i = 1; i < N+1; i++) {

			System.out.println("entre com os dados do " + i + "º contribuinte ");
			System.out.print("Pessoa física (F) ou Pessoa Jurídica (J): ");
			char type = sc.next().charAt(0);
			System.out.print("Name: ");
			String nome = sc.next();
			System.out.print("Renda anual: ");
			Double rendaAnual = sc.nextDouble();
			if (type == 'F') {
				System.out.print("Gastos com  Saúde: ");
				Double gastoSaude = sc.nextDouble();
				list.add(new pessoaFisica(nome, rendaAnual, gastoSaude));
				System.out.println();
			} else {
				System.out.print("Entre com o numero de Funcionários:");
				Integer funcionarios = sc.nextInt();
				list.add(new pessoaJuridica(nome, rendaAnual, funcionarios));
				System.out.println();
			}

		}

		System.out.println();
		System.out.println("Impostos pagos: ");
		for (contribuinte C : list) {
			System.out.println(C.getNome() + ": R$ " + String.format("%.2f", C.imposto()));
		}

		System.out.println();
		double soma = 0.0;
		for (contribuinte C : list) {
			soma += C.imposto();
		}

		System.out.println("Total de impostos pagos: R$ " + String.format("%.2f", soma));

		sc.close();

	}

}
