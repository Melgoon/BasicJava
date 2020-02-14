package e_oop;

import java.util.Scanner;

public class OOP {

	public static void main(String[] args) {
		/*
		 *  << OOP(Obhect Oriented Programming) : 객체지향 프로그래밍 >>
		 *  - 프로그래밍을 단순히 코드의 연속으로 보는 것이 아니라 객체간의 상호작용으로 보는 것,
		 *  - 코드의 재사용성이 높고 유지보수가 용이하다.
		 *  
		 *  << 객체 생성(인스턴스화) >>
		 *  - 클래스를 사용하기 위해 메모리(Heap영역)에 올려놓은 것,
		 *  - new 클래스명(); -> 객체가 저장된 메모리 주소 반환
		 *  - 객체 뒤에 참조연산자(.)를 붙여 객체의 변수와 메소드에 접근할 수 있다.
		 *  -객체는 생성될 때 마다 새로운 객체가 생성되고, 여러개의 객체가 동시에 존재할 수 있다.
		 *  
		 */
		
	SampleClass sc = new SampleClass();

	
	sc.method1();
	
	sc.method2(5);
	
	String returnString = sc.method3(); // 명령 수행 후 결과물을 돌려주는 메소드
	System.out.println(returnString);
	
	int returnInt = sc.method4(7, 15); // 
	System.out.println(returnInt); // 더한 값을 출력
	
	sc.flowTest1(); // 호출 했을 때 출력되는 문장에 번호를 붙여주세요
	
	//방금 만든 클래스의 객체를 생성하고 변수에 저장해주세요
	//객체가 저장된 변수를 통해 메소드들을 호출해주세요
	//파라미터가 있는 메소드는 타입에 맞는 값을 넘겨주시고, 리턴아입이 있는 메소드는 리턴받은 값을 출력해주세요.
	
	ClassMaker cm = new ClassMaker();
	cm.AFK();
	
	int su  = cm.B();
	System.out.println(su);
	
	cm.C(100);
	
	int returnInt2 = cm.D(10, 20);
	System.out.println(returnInt2);
	
		Calculator ct = new Calculator(); // 계산기 객체
	
	double plus =  ct.plus(123456,654321);
	System.out.println(plus);
	
	double multiply = ct.multiply(plus,123456);
	System.out.println(multiply);
	
	double division = ct.division(multiply, 123456);
	System.out.println(division);
	
	double minus = ct.minus(division, 654321);
	System.out.println(minus);
	
	double Remainder = ct.Remainder(minus, 123456);
	System.out.println(Remainder);
		
		
//		int a = 123456;
//		int b = 654321;
//	
//	ct.plus(a, b);
//	System.out.println(ct.plus(a, b));
//	int c = ct.plus(a, b);
//	
//	ct.multiply(c,a);
//	System.out.println(ct.multiply(c,a));
//	int d = ct.multiply(c, a);
	
//	SimLiTest sim = new SimLiTest();
//	
//	sim.START();
	
	game gm = new game();
	gm.START();
	
	}

}
