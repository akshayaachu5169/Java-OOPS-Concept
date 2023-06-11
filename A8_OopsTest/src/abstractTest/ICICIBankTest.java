package abstractTest;

public  class ICICIBankTest extends RBITest{
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ICICIBankTest b = new ICICIBankTest();
		b.eduloan();

		RBITest a = new ICICIBankTest();
		a.credit();
		a.debit();
		loan();
		
	}

	@Override
	public void credit() {
		// TODO Auto-generated method stub
		System.out.println("ICICI - credit");
	}

	@Override
	public void debit() {
		// TODO Auto-generated method stub
		System.out.println("ICICI - debit");
	}

	public void eduloan() {

	}

}
