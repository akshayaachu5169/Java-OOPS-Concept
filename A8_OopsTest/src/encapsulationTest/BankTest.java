package encapsulationTest;

public class BankTest {
	private  int mobilenumber;

	public  void setMobileNumber(int mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

	public boolean getMobileNumber() {
		if (mobilenumber == 111) {
			return true;
		}
		return false;
	}

}
