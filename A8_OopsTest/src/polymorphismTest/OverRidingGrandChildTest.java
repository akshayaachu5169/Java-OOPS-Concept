package polymorphismTest;

public class OverRidingGrandChildTest extends OverRidingchildTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 OverRidingGrandChildTest a =new  OverRidingGrandChildTest();
		 a.exec();
	}
public static void add() {
	System.out.println("Grandchild func");
}
public void exec() {
	super.add();
	add();
}
}
