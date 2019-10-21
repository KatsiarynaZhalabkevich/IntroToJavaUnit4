package by.epam.intro.unit4.banking.logic;
/*
 * Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета. +
 * Реализовать поиск и сортировку счетов. +
 * Вычисление общей суммы по счетам. +
 * Вычисление суммы по всем счетам, имеющим положительный и отрицательный балансы отдельно.+ */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import by.epam.intro.unit4.banking.bean.Account;
import by.epam.intro.unit4.banking.bean.Bank;
import by.epam.intro.unit4.banking.bean.Client;

public class BankLogic {

	Bank bank;

	public BankLogic(Bank bank) {

		this.bank = bank;

	}

	public List<Account> getAccountLst() { // список всех аккаунтов
		List<Account> acLst = new ArrayList<>();

		for (Client c : bank.getClientList()) {
			for (Account a : c.getAccounts()) {
				acLst.add(a);
			}

		}
		return acLst;
	}

	public Account findByNum(int number) { // поиск номера счета у клиента

		for (Client c : bank.getClientList()) {
			for (Account a : c.getAccounts()) {
				if (a.getNumber() == number)
					return a;
			}

		}
		return null;
	}

	public List<Account> findByAmountRange(long start, long finish) {
		List<Account> lst = new ArrayList<>();
		
		for (Account a : getAccountLst()) {
			if (a.getAmount() >= start && a.getAmount() <= finish) {
				lst.add(a);
			}
		}

		return lst;
	}

	public List<Account> sortByAmount() { // сортировка всех счетов
		List<Account> lst = getAccountLst();

		lst.sort(new Comparator<Account>() {
			@Override
			public int compare(Account o1, Account o2) {
				return (o1.getAmount() >= o2.getAmount() ? 1 : -1);
			}
		});

		return lst;
	}

	// общая сумма по счетам
	public long countAccountSum() {
		long amount = 0;
		List<Account> lst = getAccountLst();
		for (Account a : lst) {
			if (!a.isBlock()) {
				amount += a.getAmount();
			}
		}
		return amount;

	}
	
	// общая сумма по счетам с положительным балансом
		public long countAccountPositiveSum() {
			long amount = 0;
			List<Account> lst = getAccountLst();
			for (Account a : lst) {
				if (!a.isBlock()&&a.getAmount()>0) {
					amount += a.getAmount();
				}
			}
			return amount;

		}
		
		public long countAccountNegativeSum() {
			long amount = 0;
			List<Account> lst = getAccountLst();
			for (Account a : lst) {
				if (!a.isBlock()&&a.getAmount()<0) {
					amount += a.getAmount();
				}
			}
			return amount;

		}

}
