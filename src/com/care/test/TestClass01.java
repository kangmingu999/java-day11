package com.care.test;
class AAA{} //같은 패키지에서 생성 가능
public class TestClass01 {
	public void test() {
		System.out.println("test");
	}
	//같은 패키지에서 호출 가능
	void test2() {
		System.out.println("test2222");
	}
}
