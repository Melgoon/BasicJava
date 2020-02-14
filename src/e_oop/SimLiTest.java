package e_oop;

import java.util.Scanner;

public class SimLiTest {
	Scanner s = new Scanner(System.in);
	
	void START(){
		System.out.println("나는 금사빠다.");
		String so = s.nextLine();
		if(so.equals("y")){
			P2();
		}else{
			P4();
		}
	}
	void P2(){
		System.out.println("연애할 때 끌려다니는 타입이다");
		String so = s.nextLine();
		if(so.equals("y")){
			P5();
		}else{
			P3();
		}
	}
	void P3(){
		System.out.println("데이트 코스는 미리 짜는게 편하다.");
		String so = s.nextLine();
		if(so.equals("y")){
			P6();
		}else{
			P5();
		}
	}
	void P4(){
		System.out.println("감정기복이 크지 않다.");
		String so = s.nextLine();
		if(so.equals("y")){
			P7();
		}else{
			P5();
		}
	}
	void P5(){
		System.out.println("감정 표현에 솔직한 편이다.");
		String so = s.nextLine();
		if(so.equals("y")){
			P8();
		}else{
			P6();
		}
	}
	void P6(){
		System.out.println("활동적인 데이트가 좋다");
		String so = s.nextLine();
		if(so.equals("y")){
			P8();
		}else{
			P9();
		}
	}
	void P7(){
		System.out.println("연락이 없어도 믿고 기다리는 편이다.");
		String so = s.nextLine();
		if(so.equals("y")){
			System.out.println("당신은 A 타입입니다.");
		}else{
			P8();
		}
	}
	void P8(){
		System.out.println("이성친구는 존재할 수 없다.");
		String so = s.nextLine();
		if(so.equals("y")){
			P9();
		}else{
			System.out.println("당신은 B 타입입니다.");
		}
	}
	void P9(){
		System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.");
		String so = s.nextLine();
		if(so.equals("y")){
			System.out.println("당신은 C타입입니다.");
		}else{
			System.out.println("당신은 D 타입입니다.");
		}
	}

}
