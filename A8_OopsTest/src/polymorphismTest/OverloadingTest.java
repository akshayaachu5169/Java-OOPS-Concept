package polymorphismTest;

public class OverloadingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//add();
		add(4, 5);
		add(4, 5, 3);
		add(2, "addtion of numbers", 4);
	}

	public static void add(int i,int j) {
		
		  //int i = 4; 
		 // int j =5; 
		  int k= i+j;
		 
		System.out.println(k);
	}

	public static void add(int i, int j, int z) {

		//int i = 4;
	//	int j = 5;
		//int z = 3;
		int k = i + j + z;

		System.out.println(k);
	}
	
	public static void add(int i,String msg ,int j){
		int k =i+j;
		System.out.println(msg + ":" + k);
	}
}
