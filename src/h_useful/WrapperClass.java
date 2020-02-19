package h_useful;

import java.util.ArrayList;

public class WrapperClass {

	public static void main(String[] args) {
		/*
		 * Wrapper 클래스 : 기본형 타입을 객체로 사용해야할 때 대신 사용하는 클래스
		 * 
		 * boolean : Boolean
		 * char : Character
		 * byte : Byte
		 * short : Short
		 * int : Integer
		 * long : Log
		 * float : Float
		 * double : Double
		 */
		
		// 기본형 타입과 참조형 타입이 연산이 가능하다.
		int i = 10;
		Integer iw = new Integer(20);
		
		System.out.println(i + iw);
		
		System.out.println(Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE); 
		// int 타입이 표현할 수 있는 최소값과 최대값의 상수를 가지고 있다.

		System.out.println(i + Integer.parseInt("20")); //문자를 숫자로
		System.out.println(i + String.valueOf(20)); //숫자를 문자로
		//문자열 20에 숫자 10을 더하면서 문자열 1020이 생김
		
		System.out.println(i + Integer.valueOf("20"));
		ArrayList<Integer> list = new ArrayList<Integer>(); //ArrayList(배열) : 유동적으로 변하는 배열 , < > : 타입 지정 
		list.add(new Integer(10));
		list.add(10); //오토박싱 : 기본형타입이 wrapper클래스로 자동 변환
		
		Integer integer = list.get(0);
		int i2 = list.get(0); //언박싱 : wrapper클래스가 기본형타입으로 자동 변환
	}

}
