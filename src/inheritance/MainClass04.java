package inheritance;
class Test04{
	public Test04(String s) {
		System.out.println( s +"부모 생성자 실행");
	}
}
class TestClas04 extends Test04{
	public TestClas04() {
		super("값 전달");
		System.out.println("자식 생성자 실행");
	}
}
public class MainClass04 {
	public static void main(String[] args) {
		TestClas04 t = new TestClas04();
	}
}










