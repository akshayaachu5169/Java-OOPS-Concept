package polymorphismTest;

public class OverRidingchildTest extends OverRidingParentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//add();
		
		OverRidingchildTest a =new OverRidingchildTest();
		a.exec();
		
		
	}
	public static void add() {
		System.out.println("child func");
	}
	
	public void exec() {
		super.add();
		add();
	}
	
	
}
