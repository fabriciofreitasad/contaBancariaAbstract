package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entitie.Conta;
import entitie.ContaEmpresa;
import entitie.ContaPoupanca;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Conta> list = new ArrayList<>();

		list.add(new ContaPoupanca(1001, "Maria", 1000.0, 0.01));
		list.add(new ContaEmpresa(1002, "Laura", 300.0, 400.0));
		list.add(new ContaPoupanca(1003, "Alex", 500.0, 0.01));
		list.add(new ContaEmpresa(1004, "Anna", 500.0, 500.0));

		double sum = 0.0;
		for (Conta cc : list) {
			sum += cc.getSaldo();
		}

		System.out.printf("Total do saldo: %.2f%n", sum);

		for (Conta cc : list) {
			cc.deposito(10.0);
		}

		for (Conta cc : list) {
			System.out.printf("Saldo atualizado das conta %d: %.2f%n", cc.getNumero(), cc.getSaldo());
		}
	}

}
