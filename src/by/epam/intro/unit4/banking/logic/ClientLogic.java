package by.epam.intro.unit4.banking.logic;

import java.util.ArrayList;
import java.util.List;
/*
 * Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета. +
 * Реализовать поиск и сортировку счетов. +
 * Вычисление общей суммы по счетам. +
 * Вычисление суммы по всем счетам, имеющим положительный и отрицательный балансы отдельно.+ */
import by.epam.intro.unit4.banking.bean.Account;
import by.epam.intro.unit4.banking.bean.Client;


public class ClientLogic {

	public long getAmount(Client client) { // сумма всех доступных счетов клиента
		long amount = 0;

		for (Account a : client.getAccounts()) {
			if (!a.isBlock())
				amount += a.getAmount();
		}
		return amount;
	}

	public long getPositiveAmount(Client client) { //сумма всех доступных счетов с положительным балансом
		long amount = 0;

		for (Account a : client.getAccounts()) {
			if (!a.isBlock()&&a.getAmount()>0)
				amount += a.getAmount();
		}
		return amount;
	}
	
	public long getNegativeAmount(Client client) { //сумма всех доступных счетов с отрицательным балансом
		long amount = 0;

		for (Account a : client.getAccounts()) {
			if (!a.isBlock()&&a.getAmount()>0)
				amount += a.getAmount();
		}
		return amount;
	}

	
}
