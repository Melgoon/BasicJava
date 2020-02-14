package z_exam;

import java.util.Arrays;

public class Exam05 {

	public static void main(String[] args) {
		
//		[5-1] 다음은 배열을 선언하거나 초기화한 것이다. 잘못된 것을 고르고 그 이유를 설명
//		하시오. d,e
//		int[] arr[];
//		int[] arr = {1,2,3,};
//		int[] arr = new int[5];
//		int[] arr = new int[5]{1,2,3,4,5}; // 배열을 두개를 선언함
//		int arr[5]; // 크기를 이렇게 지정하면 안됨
//		int[] arr[] = new int[3][];
		
//		[5-2] 다음과 같은 배열이 있을 때, arr[3].length의 값은 얼마인가? 2
//				int[][] arr = { // 배열 크기는 4
//				{ 5, 5, 5, 5, 5}, // 배열 0번
//				{ 10, 10, 10}, // 배열 1번
//				{ 20, 20, 20, 20}, // 배열 2번
//				{ 30, 30}  // 배열 3번
//				};
		
//		  for(int i = 0; i < arr.length; i++){  //for문을 이용하여 i 가 arr보다 커질때까지 더해줌 (1차원)
//              for(int j = 0; j < arr[i].length; j++){  // for문을 이용하여 j가 arr[i]값보다 커질때까지 더해줌 (2차원)
//                 
//              }
//           }
//           System.out.println(arr[3].length); // arr[3] 출력시 arr[3]의 배열길이인 2가 출력됌
		
//		[5-3] 배열 arr에 담긴 모든 값을 더하는 프로그램을 완성하시오.
//		[연습문제]/ch5/Exercise5_3.java
//		class Exercise5_3
//		{
//		public static void main(String[] args)
//		{
//		int[] arr = {10, 20, 30, 40, 50}; // 배열 arr에 5개의 배열을 만들어주고 값을 선언
//		int sum = 0; // sum이란 변수를 선언 및 초기화
//		for(int i = 0; i < arr.length ; i++) // i = 0이고 i는 arr배열보다 클때까지 증감한다.
//		{
//			sum += arr[i]; //arr 배열에 있는 수를 sum에 저장하고 더한다.
//		}
//		System.out.println("sum="+sum); // sum을 출력
//		}
//		}
//		[실행결과]
//		sum=150

		
		//5-4 2차원 배열 arr에 담긴 모든 값의 총합과 평균을 구하는 프로그램을 완성하시오.
//		int[][] arr = { 
//				{ 5, 5, 5, 5, 5},
//				{10,10,10,10,10},
//				{20,20,20,20,20},
//				{30,30,30,30,30}
//				}; // 2차원 배열의 선언 
//		
//				int total = 0; // 합계 선언과 초기화
//				float average = 0; // 평균 선언과 초기화 
//		
//				for(int i = 0; i < arr.length; i++){ // i는 0이고, i가 배열 arr보다 클때까지 증감
//					
//					for(int j = 0; j < arr[i].length; j++){ // j는 0이고 j가 arr가 클때까지 증감
//						
//						total += arr[i][j]; // 배열 1차원의 첫번째 0번의 숫자를 배열 1차원 길이만큼 더하면서 토탈에 저장 이후도 반복
//						
//				}	
//				
//	}
//				average = total / (float)(arr.length* arr[0].length); // 1차원 배열 * 2차원 배열 이 문제에선 1차원이 5개 2차원이 4이기 때문에 토탈 나누기 20이 된다.
//
//				System.out.println("total="+total); // 토탈 값을 출력한다.
//				System.out.println("average="+average); // 평균 값을 출력한다.
//		[5-5] 다음은 1과 9사이의 중복되지 않은 숫자로 이루어진 3자리 숫자를 만들어내는 프
//		로그램이다. (1)~(2)에 알맞은 코드를 넣어서 프로그램을 완성하시오.
//		[참고] Math.random()을 사용했기 때문에 실행결과와 다를 수 있다.
//		int[] ballArr = {1,2,3,4,5,6,7,8,9}; // 배열 ballArr 초기화 및 선언
//		int[] ball3 = new int[3]; // 배열 ball3 초기화 및 선언
//		// 배열 ballArr의 임의의 요소를 골라서 위치를 바꾼다.
//		for(int i=0; i< ballArr.length;i++) { // i=0이고 ballArr배열 크기보다 클때까지 증감한다.
//		int j = (int)(Math.random() * ballArr.length); // int j에  ballArr 배열 크기만큼 랜덤함수를 저장
//		int tmp = 0; // 변수 선언
//		tmp = ballArr[j]; // 랜덤함수가 들어간 j의 값을 tmp에 저장
//		ballArr[j] = ballArr[i]; // ballArr[i] 값을 j에 저장
//		ballArr[i] = tmp; // tmp의 값을 i에 저장
//		}
//		// 배열 ballArr의 앞에서 3개의 수를 배열 ball3로 복사한다.
//		for (int i = 0; i < 3; i++){ // i=0이고 3보다 클 때까지 증감한다.
//			ball3[i]=ballArr[i]; // ballArr[i]의 값을 ball3[i]에 저장
//		}
//		for(int i=0;i<ball3.length;i++) { // i=0이고 ball3 배열 크기보다 클때까지 증감한다.
//		System.out.print(ball3[i]);
//	}
//		[5-6] 다음은 거스름돈을 몇 개의 동전으로 지불할 수 있는지를 계산하는 문제이다. 변
//		수 money의 금액을 동전으로 바꾸었을 때 각각 몇 개의 동전이 필요한지 계산해서 출력하
//		라. 단, 가능한 한 적은 수의 동전으로 거슬러 주어야한다. (1)에 알맞은 코드를 넣어서
//		프로그램을 완성하시오.
//		[Hint] 나눗셈 연산자와 나머지 연산자를 사용해야 한다.
//		[연습문제]/ch5/Exercise5_6.java
//		class Exercise5_6 {
//		public static void main(String args[]) {
//		// 큰 금액의 동전을 우선적으로 거슬러 줘야한다.
//		int[] coinUnit = {500, 100, 50, 10}; // 배열의 선언과 초기화
//		int money = 2680; // 인트 변수 선언 초기화
//		int [] needCoin = new int[4]; // 배열 선언과 초기화
//		System.out.println("money="+money); // 인트 변수 안에 있는 값을 출력
//		for(int i=0;i<coinUnit.length;i++) { // i=0이고 배열 coinUnit보다 클때까지 증감한다.
//			
//		needCoin[i] = money / coinUnit[i]; // money의 값과 배열 값을 나눠서 needCoin 배열에 저장한다.
//				
//		money %= coinUnit[i]; // coinUnit 배열의 나머지 값을 money에 저장
//		}
//		
//		for(int i = 0; i < needCoin.length; i++){ // i=0이고 needCoin보다 클때까지 증감한다.
//			System.out.println(coinUnit[i] + "원 : " + needCoin[i]); // 배열의 순서대로 출력 및 위에서 나눈 값을 출력한다.
//		}
//	}
//		} // main
//		}
//		[실행결과]
//		money=2680
//		500원: 5
//		100원: 1
//		50원: 1
//		10원: 3
		
//		[5-7] 문제 5-6에 동전의 개수를 추가한 프로그램이다. 커맨드라인으로부터 거슬러 줄
//		금액을 입력받아 계산한다. 보유한 동전의 개수로 거스름돈을 지불할 수 없으면, ‘거스름
//		돈이 부족합니다.’라고 출력하고 종료한다. 지불할 돈이 충분히 있으면, 거스름돈을 지불
//		한 만큼 가진 돈에서 빼고 남은 동전의 개수를 화면에 출력한다. (1)에 알맞은 코드를 넣
//		어서 프로그램을 완성하시오.
		
//		if(args.length!=1) {
//			System.out.println("USAGE: java Exercise5_7 3120");
//			System.exit(0);
//			}
			// 문자열을 숫자로 변환한다. 입력한 값이 숫자가 아닐 경우 예외가 발생한다.
//			int money = 2530; // 변수 선언과 초기화
//			System.out.println("money="+money);
//			int[] coinUnit = {500, 100, 50, 10 }; // 동전의 단위
//			int[] coin = {5, 5, 5, 5}; // 단위별 동전의 개수
//			for(int i=0;i<coinUnit.length;i++) { // i=0이고  배열의 크기보다 클때까지 증감한다.
//			int coinNum = 0; // 변수 선언과 초기화
//			coinNum = money/coinUnit[i]; // money/coinUnit[i]를 나눈 값을 coinNum에 저장
//			if(coin[i] >= coinNum){ // coin[i]가 coinNum보다 작거나 같을때
//			coin[i] -= coinNum; // 참이면 coin[i] -= coinNum
//			}else{
//			coinNum = coin[i]; //참이 아니면 coin[i]를 coinNum에 저장
//			coin[i] = 0; // coin[i]에 0을 저장
//			}
//			money -= coinNum * coinUnit[i]; // coinNum과 coinUnit[i]를 곱해서 money에 저장
//		
//			/* (1) 아래의 로직에 맞게 코드를 작성하시오.
//			1. 금액(money)을 동전단위로 나눠서 필요한 동전의 개수(coinNum)를 구한다.
//			2. 배열 coin에서 coinNum만큼의 동전을 뺀다.
//			(만일 충분한 동전이 없다면 배열 coin에 있는 만큼만 뺀다.)
//			3. 금액에서 동전의 개수(coinNum)와 동전단위를 곱한 값을 뺀다.
//			*/
//			System.out.println(coinUnit[i]+"원: "+coinNum);
//			}
//			if(money > 0) { // money가 0보다 작을 때 참 크면 거짓
//				System.out.println("거스름돈이 부족합니다.");
//				System.exit(0); // 프로그램을 종료한다.
//				}
//				System.out.println("=남은 동전의 개수 =");
//				for(int i=0;i<coinUnit.length;i++) { //i=0이고 i가 coinUnit보다 클때까지 증감
//				System.out.println(coinUnit[i]+"원:"+coin[i]);
//				}
//				}
//}// main
				
				
//			[5-8] 다음은 배열 answer에 담긴 데이터를 읽고 각 숫자의 개수를 세어서 개수만큼 ‘*’
//			을 찍어서 그래프를 그리는 프로그램이다. (1)~(2)에 알맞은 코드를 넣어서 완성하시오.
//			[연습문제]/ch5/Exercise5_8.java
//			class Exercise5_8 {
//			public static void main(String[] args) {
//			int[] answer = { 1,4,4,3,1,4,4,2,1,3,2 }; //int형 answer변수에 배열11개 선언 각 1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2
//			int[] counter = new int[4];  //int형 counter변수에 크기가 4인 배열 선언
//			for(int i=0; i < answer.length;i++) { //for 문을 이용하여  i가  answer보다 클때까지 더해줌
//				counter[answer[i] - 1]++;   // for문이 반복될때마다 [answer[i] - 1]을 counter의 0,1,2,3 번방에 넣어줌
//			}
//			for(int i=0; i < counter.length;i++) {  //for문을 활용하여  i가 counter보다 클때까지 증감 
//        
//				System.out.print(counter[i]); //counter[i] 출력
//				for (int j = 0; j < counter[i]; j++) {  //counter 를 활용하여  j가 counter[i]보다 클때까지 증감
//					System.out.print("*"); //*출력
//				}
//				System.out.println(); //출력
//				}
//				} // end of main
//				}// end of class
				
//				[5-9] 주어진 배열을 시계방향으로 90도 회전시켜서 출력하는 프로그램을 완성하시오.
//				[연습문제]/ch5/Exercise5_9.java
//				class Exercise5_9 {
//				public static void main(String[] args) {
				char[][] star = {
				{'*','*',' ',' ',' '},
				{'*','*',' ',' ',' '},
				{'*','*','*','*','*'},
				{'*','*','*','*','*'}
				};
				char[][] result = new char[star[0].length][star.length]; // 1,2차원 result 배열 안에  star배열 값을 저장
				for(int i=0; i < star.length;i++) { // 
				for(int j=0; j < star[i].length;j++) {
				System.out.print(star[i][j]);
				}System.out.println();
				}
				System.out.println();
				for(int i=0; i < star.length;i++) {
				for(int j=0; j < star[i].length;j++) {
				int a =j;
				int b = star.length - 1 - i;
				result[a][b] = star[i][j];
				}
				}
				for(int i=0; i < result.length;i++) {
				for(int j=0; j < result[i].length;j++) {
				System.out.print(result[i][j]);
				}System.out.println();
//				}
//	}
//}
				
//				[5-10] 다음은 알파벳과 숫자를 아래에 주어진 암호표로 암호화하는 프로그램이다.
//				(1)에 알맞은 코드를 넣어서 완성하시오.
//				[연습문제]/ch5/Exercise5_10.java
//				class Exercise5_10 {
//				public static void main(String[] args) {
//				char[] abcCode =
//				{ '`','~','!','@','#','$','%','^','&','*',
//				'(',')','-','_','+','=','|','[',']','{',
//				'}',';',':',',','.','/'};
//				// 0 1 2 3 4 5 6 7 8 9
//				char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};
//				String src = "abc123";
//				String result = "";
//				// 문자열 src의 문자를 charAt()으로 하나씩 읽어서 변환 후 result에 저장
//				for(int i=0; i < src.length();i++) {
//				char ch = src.charAt(i);
//				if('a' <= ch && ch <= 'z'){
//				result += abcCode[ch - 'a'];
//				}else{
//				result += numCode[ch - '0'];
//				}
//				System.out.println("src:"+src);
//				System.out.println("result:"+result);
//				} // end of main
//				} // end of class
//				[실행결과]
//				src:abc123
//				result:`~!wer
				
				
//				[5-11] 주어진 2차원 배열의 데이터보다 가로와 세로로 1이 더 큰 배열을 생성해서 배열
//				의 행과 열의 마지막 요소에 각 열과 행의 총합을 저장하고 출력하는 프로그램이다. (1)
//				에 알맞은 코드를 넣어서 완성하시오.
//				[연습문제]/ch5/Exercise5_11.java
//				class Exercise5_11
//				{
//				public static void main(String[] args)
//				{
//				int[][] score = {
//				{100, 100, 100}
//				, {20, 20, 20}
//				, {30, 30, 30}
//				, {40, 40, 40}
//				, {50, 50, 50}
//				};
//				int[][] result = new int[score.length+1][score[0].length+1];
//				for(int i=0; i < score.length;i++) {
//				for(int j=0; j < score[i].length;j++) {
				
//				result[i][j] = score[i][j];
//				//행합
//				result[i][score[0].length] += result[i][j];
				//열합
//				result[i][score.length][j] += result[i][j];
				//모두의 합
//				result[score.length][score[0].length] += result[i][j];
//				}
//				}
//				for(int i=0; i < result.length;i++) {
//				for(int j=0; j < result[i].length;j++) {
//				System.out.printf("%4d",result[i][j]);
//				}S
//				ystem.out.println();
//				}
//				} // main
//				}
//				[실행결과]
//				100 100 100 300
//				20 20 20 60
//				30 30 30 90
//				40 40 40 120
//				50 50 50 150
//				240 240 240 720
				
				
//				[5-12] 예제5-23을 변경하여, 아래와 같은 결과가 나오도록 하시오.
//				Q1. chair의 뜻은? dmlwk
//				틀렸습니다. 정답은 의자입니다
//				Q2. computer의 뜻은? 컴퓨터
//				정답입니다.
//				Q3. integer의 뜻은? 정수
//				정답입니다.
//				전체 3문제 중 2문제 맞추셨습니다.
				/*
				 * String[][] words = {
				 * {"chair","의자"},
				 * {"computer","컴퓨터"},
				 * {"integer","정수"}
				 * };
				 * Scanner scanner = new Scanner(System.in);
				 * int count = 0;
				 * int a = 0;
				 * 
				 * for(int i =0; i<>words.length;i++){
				 * 
				 * System.out.printf("Q%d, %s의 뜻은?", i+1, words[i][0]);
				 * String tmp = scanner.nextLine();
				 * a++;
				 * if(tmp.equals(words[i][l])){
				 * count++;
				 * System.out.printf("정답입니다.%n%n");
				 * }else{
				 * System.out.printf("틀렸습니다. 정답은 %s입니다. %n%n",words[i][1]);
				 * System.out.println("전체"+a+"문제중"+count+"문제 맞추셨습니다");
				 */
//				
				
//				[5-13] 단어의 글자위치를 섞어서 보여주고 원래의 단어를 맞추는 예제이다. 실행결과와
//				같이 동작하도록 예제의 빈 곳을 채우시오.
				
//				String[] words = { "television", "computer", "mouse", "phone" };
//				Scanner scanner = new Scanner(System.in);
//				for(int i=0;i<words.length;i++) {
//				char[] question = words[i].toCharArray(); // String을 char[]로 변환
//				/*
//				(1) 알맞은 코드를 넣어 완성하시오.
//				char배열 question에 담긴 문자의 위치를 임의로 바꾼다.
//				char temp = ' ' ;
//				for(int j = 0; j < question.length; j++){
//					int random = (int)(Math.random()*question.length);
//					temp = qustion[0];
//					question[0] = question[random];
//					question[random]  =temp;
//				}
//				*/
//				System.out.printf("Q%d. %s의 정답을 입력하세요.>",
//				i+1, new String(question));
//				String answer = scanner.nextLine();
//				// trim()으로 answer의 좌우 공백을 제거한 후, equals로 word[i]와 비교
//				if(words[i].equals(answer.trim()))
//				System.out.printf("맞았습니다.%n%n");
//				else
//				System.out.printf("틀렸습니다.%n%n");
//				}
//				} // main의 끝
//				}
				}
	}
}