package interfaceTest;

public class SBIBankTest implements RbiBankTest, CanaraBankTest{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SBIBankTest a = new SBIBankTest();
a.gpay();
a.paytm();
a.phonepay();


CanaraBankTest cb = new SBIBankTest();
cb.gpay();
cb.paytm();

	}

	@Override
	public void gpay() {
		// TODO Auto-generated method stub
		System.out.println("sbi - gpay");
	}

	@Override
	public void paytm() {
		// TODO Auto-generated method stub
		System.out.println("sbi - paytm");
	}

	@Override
	public void credit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void debit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void loan() {
		// TODO Auto-generated method stub
		
	}
	public void phonepay() {
		System.out.println("sbi- phonepe");
	}

}
