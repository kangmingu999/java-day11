package day11;

class TestClass03{
	static TestClass03 t;
	private TestClass03() {
		System.out.println("생성자 실행");
	}
	public static TestClass03 getInstance() {
		System.out.println(t + " : test 실행");
		if(t == null)
			t = new TestClass03();
		return t;
	}
}
public class MainClass03 {
public static void main(String[] args) {
	TestClass03 t01 = TestClass03.getInstance();
	TestClass03 t02 = TestClass03.getInstance();
	TestClass03 t03 = TestClass03.getInstance();
	System.out.println( t01 );
	System.out.println( t02 );
	System.out.println( t03 );
}
}









