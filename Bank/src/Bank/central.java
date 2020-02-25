package Bank;
import Bank.BankAccount;
public class central {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount accountOne = new BankAccount(300, "Pieterjan");
		BankAccount accountTwo = new BankAccount(500, "Gerard");
		accountOne.transferMoney(accountTwo, 100);
		accountOne.addMoney(500);
		System.out.println("Gerard has " + accountTwo.getBalance()+ " on his bankaccount.");
		System.out.println("Pieterjan has " + accountOne.getBalance() + " on his bankaccount.");
	}

}
