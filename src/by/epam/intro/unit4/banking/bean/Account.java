package by.epam.intro.unit4.banking.bean;

/*
 * Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета. +
 * Реализовать поиск и сортировку счетов. +
 * Вычисление общей суммы по счетам. +
 * Вычисление суммы по всем счетам, имеющим положительный и отрицательный балансы отдельно.+ */

public class Account {
	
	
	private int number;
	private boolean block = false;
	private long amount = 0;

	

	public Account(int number, long amount) {
		this.number = number;
		this.amount = amount;

	}

	public Account(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

	public boolean isBlock() {
		return block;
	}

	public void setBlock(boolean block) {
		this.block = block;
	}

	

	@Override
	public String toString() {
		return "\n Account " + "number " + number + ", blocked " + block + ", amount " + amount;
	}

}
