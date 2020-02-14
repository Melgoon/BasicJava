package e_oop;

public class ClassMaker2 {
	//전역변수 하나를 선언하고 명시적으로 초기화 해주세요.
	
//	int ABC = 40;
	String str = "홍길동";
	static String pp = "길동이";
	
	//위에서 선언한 전역변수를 초기화 블럭을 사용해 초기화 해주세요.
	
//	{
//		for(int i = 1; i <= 40; i++){
//			ABC += i;
//		}
//	}
	
	{
		str = "엄백호";
	}
	
	static{
		pp = "백구";
	}
	
	//위에서 선언한 전역변수를 생성자의 파라미터를 사용해 초기화 해주세요.
//	ClassMaker2(int ABC){ // 생성자(파라미터)
//		for(int i = 1; i <= ABC; i++){
//			this.ABC += i;
//		}
//	}
	
	ClassMaker2(String str){
		this.str = str;
	}
	
	//위에서 선언한 전역변수를 생성자를 하나 더 만들어서 초기화해주세요.
	
//	ClassMaker2(){
//		this(40);
//		}
	
	ClassMaker2(){
		this("공손찬");
	}
	//초기화 순서 : 명시적 초기화 -> 초기화 블럭 -> 생성자
	}
