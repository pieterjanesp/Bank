package Bank;

public class BankAccount {
	int balance;
	String name;


public BankAccount(int balance, String name) {
		super();
		this.balance = balance;
		this.name = name;
}

public void transferMoney(BankAccount account, int amount) {
	this.balance -= amount;
	account.balance += amount;
}

void addMoney(int amount) {
	this.balance += amount;
}

public int getBalance() {
	return balance;
}

public void setBalance(int balance) {
	this.balance = balance;
}

}

