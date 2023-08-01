package day11;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestClass {
public static void main(String[] args) {
	for(int i=0;i<10;i++)	{
		System.out.println(i);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {	}
	}
	System.out.println("반복문 탈출");
	System.out.println("시작");
	long start = System.currentTimeMillis();
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	long end = System.currentTimeMillis();
	System.out.println("끝");
	System.out.println( (end - start) / 1000 );

}
}
