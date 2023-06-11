package abstractTest;

public  class HDFCBankTest extends  RBITest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//businessloan();
HDFCBankTest a =new HDFCBankTest();
a.credit();
a.debit();
//a.eduloan();
//a.loan();


	}

	@Override
	public void credit() {
		// TODO Auto-generated method stub
		System.out.println("HDFC - credit");
	}

	@Override
	public void debit() {
		// TODO Auto-generated method stub
		System.out.println("HDFC - debit");
	}
	public static void businessloan() {
		
	}

}
