package z_exam;

public class Exam06{
	/*[6-1] 다음과 같은 멤버변수를 갖는 SutdaCard클래스를 정의하시오.
	타 입 변수명 설 명
	int num 카드의 숫자.(1~10사이의 정수)
	boolean isKwang 광(光)이면 true, 아니면 false */
	/*class SutdaCard{
		int num; // 멤버범수 즉, 전역변수를 선언해준다.
		boolean isKwang; // 전역변수 선언
	}*/
	/*[6-2] 문제6-1에서 정의한 SutdaCard클래스에 두 개의 생성자와 info()를 추가해서 실행
	결과와 같은 결과를 얻도록 하시오.
	public static void main(String args[]){
		SutdaCard card1 = new SutdaCard(3, false); //생성자가 있는 매개변수 
		SutdaCard card2 = new SutdaCard(); // 생성자가 없는 매개변수
		
		System.out.println(card1.info()); // 3이 출력된다.
		System.out.println(card2.info()); // 1K가 출력된다.
	}
}*/
/*
class SutdaCard{
	int num;
	boolean isKwang;
	
	SutdaCard(){
		this(1, true); //SutdaCard(1, true)를 호출한다.
	}
	
	SutdaCard(int num, boolean isKwang){
		this.num = num; // class SutdaCard(num,isKwang)를 호출한다.
		this.isKwang = isKwang;
	}
	
	String info(){ // 숫자를 문자열로 반환한다. 광인 경우 K를 덧붙인다.
		return num + ( isKwang? "K" : "");  // 값을 반환해준다. 
		// isKwang의 값이 true인 경우에는 K가 붙도록 연산식은 삼향연산자를 사용 
		//변수 num은 int형이지만 문자열과 덧셈연산을 하기 때문에 최종적으로는 문자열을 반환하게 된다.
		
	}
}*/
	
/*	[6-3] 다음과 같은 멤버변수를 갖는 Student클래스를 정의하시오.
	타 입 변수명 설 명
	String name 학생이름
	int ban 반
	int no 번호
	int kor 국어점수
	int eng 영어점수
	int math 수학점수 */
	
	/*class Student{ 
		String name; // 멤버변수, 전역변수 , 전역변수 선언
		int ban;
		int no;
		int kor;
		int eng;
		int math;
	}
}*/

/*[6-4] 문제6-3에서 정의한 Student클래스에 다음과 같이 정의된 두 개의 메서드
getTotal()과 getAverage()를 추가하시오.

1. 메서드명 : getTotal
기 능 : 국어(kor), 영어(eng), 수학(math)의 점수를 모두 더해서 반환한다.
반환타입 : int
매개변수 : 없음
2. 메서드명 : getAverage
기 능 : 총점(국어점수+영어점수+수학점수)을 과목수로 나눈 평균을 구한다.
소수점 둘째자리에서 반올림할 것.
반환타입 : float
매개변수 : 없음*/
/*public static void main(String args[]){
	Student s = new Student(); 
	s.name = "홍길동"; //멤버변수 선언
	s.ban = 1;
	s.no = 1;
	s.kor = 100;
	s.eng = 60;
	s.math = 76;
	
	System.out.println("이름 " +s.name);
	System.out.println("총점 " + s.getTotal());
	System.out.println("평균 : "  + s.getAverage());
	}
}
class Student {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;

int getTotal(){
	return kor + eng + math; // kor + eng + math의  합의 값을 getTotal로 반환한다.
}
float getAverage(){
	return (int)(getTotal() / 3f * 10 + 0.5f) / 10f; // getTotal(총합) + 3f * 10 + 0.5f) / 10f 값을 getAverage로 반환한다.
}*/
/*[해석] 총점과 평균을 구하는 문제인데, 평균을 구할 때 소수점 둘째 자리에서 반올림을
하는 부분에서 생각을 좀 해야 할 것이다.
총점의 타입이 int이기 때문에 3으로 나누면 int와 int간의 연산이므로 결과를 int로 얻
는다. 즉, 소수점 이하의 값은 버려지게 된다. 그래서 float타입의 리터럴인 3f로 나누어
야 소수점 이하의 값들을 얻을 수 있다. 그리고, 소수점 둘째 자리에서 반올림하려면 10
을 곱하고 0.5를 더한 다음 다시 10f로 나누면 된다.*/
//[6-5] 다음과 같은 실행결과를 얻도록 Student클래스에 생성자와 info()를 추가하시오.
/*	public static void main(String args[]){
		Student s = new Student("홍길동",1,1,100,60,76); 
		
		System.out.println(s.info());
	}
}

	
	class Student{
		String name; // 멤버변수 선언
		int ban;
		int no;
		int kor;
		int eng;
		int math;
	
	Student (String name,int ban,int no, int kor, int eng, int math){
		this.name = name; // Student의 멤버변수를 호출한다.
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	int getTotal(){
		return kor+eng+math; // kor+eng+math의 총합 값을 getTotal에 반환한다.
	}
	float getAverage(){
		return (int)(getTotal() / 3f * 10 + 0.5f) / 10f; 
		//getTotal(총합) + 3f * 10 + 0.5f) / 10f 값을 getAverage로 반환한다.
	}
	public String info(){
		return name // info로 반환하여 출력한다.
				+","+ban
				+","+no
				+","+kor
				+","+eng
				+","+math
				+","+getTotal() // 총합을 반환하여 출력한다.
				+","+getAverage(); // 평균값을 반환하여 출력한다.
	}
}*/
	/*[해설] 학생의 이름, 반, 번호, 과목별 성적을 매개변수로 받는 생성자를 추가하고, 학생
	의 정보를 출력하는 info()메서드를 정의하는 문제이다. 답을 보는 것만으로도 충분히 이
	해할 수 있는 문제이므로 설명은 생략한다.*/
	
	/*[6-6] 두 점의 거리를 계산하는 getDistance()를 완성하시오.
	[Hint] 제곱근 계산은 Math.sqrt(double a)를 사용하면 된다.*/
		// 두 점 (x,y)와 (x1,y1)간의 거리를 구한다.
	/*	static double getDistance(int x, int y, int x1, int y1){ // 생성자(파라미터)
			return Math.sqrt((x-x1)*(x-x1) + (y-y1)*(y-y1)); // x,y는 지역변수 루트(x-x1)제곱 + (y-y1)제곱 계산식을 이용
		}
		
		public static void main(String args[]){
			System.out.println(getDistance(1,1,2,2));
		}
	}*/

	/*[ 해석 ] 두 점 (x,y) 와 (x1, y1) 의 거리를 구하는 공식은 루트 (x-x1)제곱 + (y-y1)제곱 이다.
	제곱근 계산은 Math클래스의 sqrt(double a)를 사용하면 된다. 제곱도 Math.pow(double
	a, double b)를 사용하면 되지만, 2제곱이므로 그냥 곱셈연산자를 사용했다. 어느 쪽을
	사용해도 괜찮지만, 메서드를 호출하는 것은 곱셈연산보다 비용이 많이 드는 작업이라는
	것은 기억해두자. 그렇다고 해서 보다 빠른 코드를 만들겠다고 코드를 복잡하게 하는 것
	은 좋지 않다.
	참고로 Math.pow(double a, double b)를 사용한 코드는 다음과 같다.
	*/

	//6-7 문제6-6에서 작성한 클래스메서드 getDistance()를 MyPoint클래스의 인스턴스메서드로 정의하시오.
		/*int x; // 인스턴스 변수 
		int y; // 인스턴스 변수
		Exam06(int x, int y) {
			this.x = x; // 지역변수 x가 this를 이용해 인스턴스 변수 x를 호출함
			this.y = y; // 지역변수 y가 this를 이용해 인스턴스 변수 y를 호출함
		}
		double getDistance(int x1, int y1) { // 생성자(파라미터)
			return Math.sqrt((x-x1)*(x-x1) + (y-y1)*(y-y1)); // x, y는 인스턴스 변수
		}

		public static void main(String args[]) {
			Exam06 p = new Exam06(1,1);
			// p와 (2,2)의 거리를 구한다.
			System.out.println(p.getDistance(2,2));
		}
}*/

	/*[해설] 이전 문제의 static메서드를 인스턴스 메서드로 변경하는 문제인데, static메서드
	와 인스턴스 메서드의 차이를 이해하는 것은 매우 중요하다.
	static메서드인 경우에는 메서드 내에서 인스턴스 변수를 사용하지 않았다. 대신 매개변
	수(지역변수)로 작업에 필요한 값을 제공받아야했다. 그래서, 인스턴스와 관계가 없으므
	로(인스턴스변수를 사용 안했으니까) static메서드로 선언할 수 있는 것이다.
	
	그러나, 인스턴스 메서드는 인스턴스 변수 x, y를 사용해서 작업하므로 매개변수로 x1과
	y1만을 제공받으면 된다. 인스턴스와 관계가 있으므로(인스턴스 변수를 사용했으니까)
	static을 붙일 수 없다.
	
	아래의 코드는 인스턴스 메서드를 사용할 때와 static메서드를 사용할 때의 차이를 보여
	주기 위한 것이다. 어떤 차이가 있는지 잘 살펴보자.
	
	1. static메서드의 사용
	System.out.println(Exercise6_6.getDistance(1,1,2,2));
	2. 인스턴스 메서드의 사용
	MyPoint p = new MyPoint(1,1);
	System.out.println(p.getDistance(2,2));
	
	MyPoint클래스에 두 점간의 거리를 계산하는 메서드 getDistance()를 넣는다면, static메
	서드 보다는 인스턴스메서드로 정의하는 것이 더 적합하다.*/

	//[6-8] 다음의 코드에 정의된 변수들을 종류별로 구분해서 적으시오.
	/*class PlayingCard{
		int kind;
		int num;
		
		static int width;
		static int height;
		
		PlayingCard(int k, int n){
			kind = k;
			num = n;
		}
		
		public static void main (String args[]){
			PlayingCard card = new PlayingCard(1,1);
		}
	}*/
	
//	- 클래스변수(static 변수) : width, height static가 붙은 것은 클래스 변수
//	- 인스턴스변수 : kind, num { }내에 선언된 변수
//	- 지역변수 :k,n,card,args 나머지는 지역변수

	/*[해설] 변수가 선언된 위치를 보면 변수의 종류를 알 수 있다. 클래스 블럭{}내에 선언된
	변수는 인스턴스 변수이고, static이 붙은 것은 static변수(클래스 변수)이다. 그리고 나
	머지는 모두 지역변수이다.*/
	
	/*
	 * class Variables
	 * {
	 * int iv;  // 인스턴스 변수 - 클래스영역
	 * static int cv;  //클래스변수(static변수, 공유변수)
	 * 
	 * void method()
	 * {
	 * 	int lv = 0; // 지역 변수 - 메서드영역
	 * }
	 * }
	 */
	
	/*
	 * 변수의 종류 / 선언위치 / 생성시기
	 * 클래스 변수 / 클래스 영역 / 클래스가 메모리에 올라갈 때
	 * 인스턴스 변수 / 클래스 영역 / 인스턴스가 생성되었을 때
	 * 지역변수 /클래스 영역 이외의 영역 (메서드,생성자,초기화 블럭 내부) / 변수 선언문이 수행되었을 때
	 * 
	 */
	
	/*
	 * [6-9] 다음은 컴퓨터 게임의 병사(marine)를 클래스로 정의한 것이다. 이 클래스의 멤버
중에 static을 붙여야 하는 것은 어떤 것들이고 그 이유는 무엇인가?
(단, 모든 병사의 공격력과 방어력은 같아야 한다.)
	 */
	
		int x=0,y=0;
		int hp = 60;
		static int weapon = 6;
		static int armor = 0;
		
		static void weaponUp(){
			weapon++;
		}
		static void armorUp(){
			armor++;
		}
		void move(int x, int y){
			this.x = x;
			this.y = y;
		}
	}



	
		
