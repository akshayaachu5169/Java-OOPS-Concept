package inheritanceTest;

public class HdfcBankTest extends RbiBankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		credit();
		debit();
		loan();
		eduloan();
		businessloan();
	}
public static void businessloan() {
	System.out.println("HDFC business loan logic");
}
}
