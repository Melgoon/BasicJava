package f_oop2.aaccess_test;

import f_oop2.AccessModifier;

public class AccessTest extends AccessModifier {

	public static void main(String[] args) {
		
		AccessModifier am = new AccessModifier();
		
		System.out.println(am.publicVar);
		am.publicMethod();
		
//		System.out.println(am.protectedVar);
//		am.protectedMethod();
		
		AccessTest at = new AccessTest();
		
		System.out.println(at.publicVar); // 상속받는 접근 제어자
		at.publicMethod();
		
		System.out.println(at.protectedVar); // 상속받는 접근 제어자
		at.protectedMethod();
		
//		System.out.prnitln(at.defaultVar); // 상속받지 못함
//		at.defaultMethod();
//		
//		System.out.println(at.privateVar); // 상속은 되나 프라이빗으로 잠겨있기 때문에 사용 불가
//		at.privateMethod();
		
		

	}

}
