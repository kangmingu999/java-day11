package com.java.util;
class A01{} // 다른 패키지에서 사용할 수 없다
public class Test01 {
	public void test() {
		System.out.println("Test01 test");
	}
	void test2() {// 다른 패키지에서는 호출할 수 없다
		System.out.println("Test01 test2222");
	}
}
