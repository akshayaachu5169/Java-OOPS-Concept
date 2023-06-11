package interfaceTest;

public class HDFCBankTest implements RbiBankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HDFCBankTest a =new HDFCBankTest();
a.credit();
a.debit();
a.loan();
a.fixeddeposit();

RbiBankTest rbi = new HDFCBankTest();
rbi.credit();
rbi.debit();
rbi.loan();


	}

	@Override
	public void credit() {
		// TODO Auto-generated method stub
		System.out.println("net banking - credit");
	}

	@Override
	public void debit() {
		// TODO Auto-generated method stub
		System.out.println("net banking - debit");
		
	}

	@Override
	public void loan() {
		// TODO Auto-generated method stub
		System.out.println("net banking - loan");
	}
	public void fixeddeposit() {
		System.out.println("HDFC - FD");
	}

}
