package by.epam.intro.unit4.banking;

import java.util.List;

import by.epam.intro.unit4.banking.bean.Account;
import by.epam.intro.unit4.banking.bean.Bank;
import by.epam.intro.unit4.banking.bean.Client;
import by.epam.intro.unit4.banking.logic.BankLogic;
/*
 * Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета. +
 * Реализовать поиск и сортировку счетов. +
 * Вычисление общей суммы по счетам. +
 * Вычисление суммы по всем счетам, имеющим положительный и отрицательный балансы отдельно.+ */

public class Main {

	public static void main(String[] args) {
		Bank bank = new Bank();
		BankLogic bL = new BankLogic(bank);

		Client c1 = new Client("Ivanov", "Ivan");
		Client с2 = new Client("Petrov", "Petr");

		Account a1 = new Account(111_222_333, 50000);
		Account a2 = new Account(101_102_303, 30000);
		Account a3 = new Account(123_456_789);

		c1.addAccount(a1);
		c1.addAccount(a2);
		с2.addAccount(a3);

		bank.addClient(c1);
		bank.addClient(с2);

		System.out.println("Negativ sum of all active accounts is " + bL.countAccountNegativeSum());

		System.out.println("Positive sum of all active accounts is " + bL.countAccountPositiveSum());

		System.out.println("Bank's account list\n" + bL.getAccountLst());

		infoClient(c1);

		infoAllClients(bank);

		infoAllAccount(bL.getAccountLst());

		System.out.println("Sort accounts by amount ");
		infoAllAccount(bL.sortByAmount());

		System.out.println("Accounts by amount's range");
		infoAllAccount(bL.findByAmountRange(25, 35000));

	}

	public static void infoClient(Client client) {
		System.out.println("Client's info:\n -----------");
		System.out.println(
				String.format("First name:%s\nSecond name: %s\n", client.getFirstName(), client.getSecondName()));
		System.out.println("Accounts information");
		for (Account a : client.getAccounts()) {
			System.out.println("Account number " + a.getNumber());
			System.out.println("Balance " + a.getAmount());
			System.out.println("---------------");

		}

	}

	public static void infoAllClients(Bank bank) {

		System.out.println("Client's list");
		for (Client client : bank.getClientList()) {
			System.out.println(client.getFirstName() + " " + client.getSecondName());
		}
		System.out.println();

	}

	public static void infoAllAccount(List<Account> lst) {

		System.out.println("Account's List");
		for (Account a : lst) {
			System.out.println("number " + a.getNumber() + " amount " + a.getAmount());
		}
		System.out.println();

	}

}
