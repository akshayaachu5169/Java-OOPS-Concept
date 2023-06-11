package encapsulationTest;

public class GpayTest   {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BankTest a = new BankTest();

a.setMobileNumber(101);
if (a.getMobileNumber()) {
	System.out.println("mobile number validated");
}
else {
	System.err.println("validation failed");
}
}
	
}
	

