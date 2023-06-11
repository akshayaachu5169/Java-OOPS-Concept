package interfaceTest;

public class ICICIBankTest implements RbiBankTest{


	public static void main(String[] args) {
		// TODO Auto-generated method stub
ICICIBankTest a = new ICICIBankTest();
a.credit();
a.debit();
a.loan();


	}

	@Override
	public void credit() {
		// TODO Auto-generated method stub
		System.out.println("ICICI - MobileBanking - credit");
	}

	@Override
	public void debit() {
		// TODO Auto-generated method stub
		System.out.println("ICICI - MobileBanking - debit");
	}

	@Override
	public void loan() {
		// TODO Auto-generated method stub
		System.out.println("ICICI - MobileBanking - loan");
	}

}
