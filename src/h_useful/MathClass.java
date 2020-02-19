package h_useful;

public class MathClass {

	public static void main(String[] args) {
		/*
		 * round() : 반올림
		 * ceil() : 올림
		 * floor() : 내림
		 * abs() : 절대값
		 * random() : double 난수 발생(0.0 ~ 1.0 미만)
		 */
		
		double d1 = 0.5;
		double d2 = -0.5;
		
	System.out.println(Math.round(d1)); //소수점 첫번째 자리에서 반올림한다.
	System.out.println(Math.round(d2));	

	System.out.println(Math.ceil(d1)); // 0.5가 더해져서 1
	System.out.println(Math.ceil(d2));
	
	System.out.println(Math.floor(d1)); // 0.5를 내려서 0
	System.out.println(Math.floor(d2));
	
	System.out.println(Math.abs(d1)); //절대값을 보여주기 때문에 -는 +로 
	System.out.println(Math.abs(d2));
	//한줄복사 : Ctrl + Alt + 방향키(위/아래)
	//한줄이동 : Alt + 방향키(위/아래)

	for(int i = 0; i < 20; i++){ //5에서 10 사이의 랜덤값을 20번 반복
		int random = getRandom(5,10);
		System.out.print(random + " ");
	}
	
	}
	static int getRandom(int from, int to){
		return (int)(Math.random() *(Math.abs(to - from) +1)) + Math.min(from, to);
	}
}
