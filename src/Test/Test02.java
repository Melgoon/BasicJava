package Test;

public class Test02 {

	public static void main(String[] args) {
		
		// 문제 1
		int x = 2;
		int y = 5;
		char c = 'A'; // 'A'의 문자코드는 65
		System.out.println(1 + x << 33);
		System.out.println(y >= 5 || x < 0 && x > 2);
		System.out.println(y += 10 - x++);
		System.out.println(x+=2);
		System.out.println( !('A' <= c && c <='Z') );
		System.out.println('C'-c);
		System.out.println('5'-'0');
		System.out.println(c+1);
		System.out.println(++c);
		System.out.println(c++);
		System.out.println(c);

//		답 : 6
//		true
//		13
//		5
//		false
//		2
//		5
//		66
//		B
//		B
//		C
		
		//문제 2
		int numOfApples = 123; // 사과의 개수
		int sizeOfBucket = 10; // 바구니의 크기(바구니에 담을 수 있는 사과의 개수)
		int numOfBucket = ( numOfApples / sizeOfBucket + 1 ); // 모든 사과를 담는데 필요한 바구니의 수
		System.out.println("필요한 바구니의 수 :"+numOfBucket);
		
		//문제 3
			int num = 10;
			System.out.println(num < 0 ? "음수" : num > 0 ? "양수" : "0");
			
		//문제 4
			int num1 = 456;
			System.out.println( num1-num1%100 );
		//문제 5 아래는 변수 num의 값 중에서 일의 자리를 1로 바꾸는 코드이다. 만일 변수 num의
//			값이 333이라면 331이 되고, 777이라면 771이 된다. (1)에 알맞은 코드를 넣으시오.
			int num2 = 333;
			System.out.println( num2-(num2%100%10 - 1) );
//			//문제6 아래는 변수 num의 값보다 크면서도 가장 가까운 10의 배수에서 변수 num의 값을
//			뺀 나머지를 구하는 코드이다. 예를 들어, 24의 크면서도 가장 가까운 10의 배수는 30이
//			다. 19의 경우 20이고, 81의 경우 90이 된다. 30에서 24를 뺀 나머지는 6이기 때문에 변
//			수 num의 값이 24라면 6을 결과로 얻어야 한다. (1)에 알맞은 코드를 넣으시오.
//			[Hint] 나머지 연산자를 사용하라.
			
			int num3 = 24;
			System.out.println( 10 - num3%10 );

	}

}
