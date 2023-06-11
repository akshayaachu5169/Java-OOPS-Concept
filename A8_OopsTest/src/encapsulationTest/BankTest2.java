package encapsulationTest;

public class BankTest2 {
private static int balance=1000;
public void setDebitAmount(int amount) {
	balance = balance-amount;
}
public  int getDebitAmount() {
	return balance;
	
}
}
