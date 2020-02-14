package Test;

import java.util.Arrays;
import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
//		//1. arr배열의 모든 값을 더하는 프로그램을 작성하시오.
//		int[] arr = {10, 20, 30, 40, 50}; // 배열 arr에 5개의 배열을 만들어주고 값을 선언
//		int sum = 0; // sum이란 변수를 선언 및 초기화
//		for(int i = 0; i < arr.length ; i++) // i = 0이고 i는 arr배열보다 클때까지 증감한다.
//		{
//			sum += arr[i]; //arr 배열에 있는 수를 sum에 저장하고 더한다.
//		}
//		System.out.println("sum="+sum); // sum을 출력
		
		//2.5명의 이름을 입력받아 배열에 저장하는 프로그램을 작성하세요.
		
//		String[] name = new String[5]; // 5개의 방
//		int size = name.length; // 배열의 숫자를  size에 저장
//		Scanner sc = new Scanner(System.in);
//		for(int i=0; i < size; i++){ // 배열의 숫자만큼 반복문을 구동
//			System.out.println("학생 이름을 입력하세요 > ");
//			name[i] = sc.nextLine(); // 스캐너로 입력받은 값을 저장
//		}
//		for(int i=0; i < size; i++){
//			System.out.println("학생 이름 > " + name[i]); // 스캐너로 입력받은 값을 출력
//		}
//	}
//}
		
//		3.score배열의 최대값 최소값 구하기
//		int[] score = { 79, 88,91,33,100,55,95};
//		
//		int min = score[0]; // 최소값을 저장할 변수를 만들고 배열의 첫번째 숫자를 저장한다
//		int max = score[0]; // 최대값을 저장할 변수를 만들고 배열의 첫번째 숫자를 저장한다.
//		//배열의 길이만큼 반복하면서
//		for(int i = 0; i < score.length; i++){
//			if(max < score[i]){ // 최대값과 배열의 값을 비교해 배열의 값이 더 큰 경우 
//				max = score[i]; // 최대값에 배열의 값을 저장한다.
//			}else if(score[i] < min){
//				min = score[i]; //최소값과 배열의 값을 비교해 배열의 값이 더 작은 경우 최소값에 배열의 값을 저장한다.
//			}
//		}
//		System.out.println("최대값 : " + max  + " 최소값 : " + min);
//	}
//}
		
		//4. 2차원 배열 arr에 담긴 모든 값의 총합과 평균을 구하는 프로그램을 작성하세요.
//		int[][] arr2 = {
//			    {5,5,5,5,5},
//			    {10,10,10,10,10},
//			    {20,20,20,20,20},
//			    {30,30,30,30,30}
//			 };
//		
//		int total = 0; // 합계 선언과 초기화
//		float average = 0; // 평균 선언과 초기화 
//
//		for(int i = 0; i < arr2.length; i++){ // i는 0이고, i가 배열 arr보다 클때까지 증감
//			
//			for(int j = 0; j < arr2[i].length; j++){ // j는 0이고 j가 arr가 클때까지 증감
//				
//			total += arr2[i][j]; // 배열 1차원의 첫번째 0번의 숫자를 배열 1차원 길이만큼 더하면서 토탈에 저장 이후도 반복
//			}
//		}
//		average = total / (float)(arr2.length* arr2[0].length); // 1차원 배열 * 2차원 배열 이 문제에선 1차원이 5개 2차원이 4이기 때문에 토탈 나누기 20이 된다.
//		
//		System.out.println("total="+total); // 토탈 값을 출력한다.
//		System.out.println("average="+average); // 평균 값을 출력한다.
//		
//		//5.answer 배열의 각 숫자의 갯수를 세어 count배열에 넣고 count배열의 각숫자만큼씩 *를 출력한다 
//		
		int[] answer = { 1,4,4,3,1,4,4,2,1,3,2 }; //int형 answer변수에 배열11개 선언 각 1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2
		int[] counter = new int[4];  //int형 counter변수에 크기가 4인 배열 선언
		for(int i=0; i < answer.length;i++) { //for 문을 이용하여  i가  answer보다 클때까지 더해줌
			counter[answer[i] - 1]++;   // for문이 반복될때마다 [answer[i] - 1]을 counter의 0,1,2,3 번방에 넣어줌
		}
		for(int i=0; i < counter.length;i++) {  //for문을 활용하여  i가 counter보다 클때까지 증감 
    
			System.out.print(counter[i]); //counter[i] 출력
			for (int j = 0; j < counter[i]; j++) {  //counter 를 활용하여  j가 counter[i]보다 클때까지 증감
				System.out.print("*"); //*출력
			}
			System.out.println(); //출력
			}
	}
}
//		
//		//6. menu배열에서 메뉴이름과 가격중 메뉴이름을 추출하는 프로그램을 작성하세요.
//		String menu[] ={ "아메리카노 3000원", "카푸치노 4000원", "카페라떼 3500원"};
//		
//		for(int i = 0; i < menu.length; i++){
//			String name = menu[i].substring(0,menu[i].indexOf(" "));
//			System.out.println(name);
//		}
//		
//		//7. str변수에서 Java의 위치를 찾아 출력하는 프로그램을 작성하세요.
////		String str="i Love Java";
////		String sub1 = str.substring(7); // 7번 인덱스부터 잘라서 반환한다.
////		System.out.println(sub1);
//		
//		//8. s변수에서 lang문자열을 추출하는 프로그램을 작성하세요 
//		String  s ="java.lang.Object";
//		String sub2 = s.substring(5,9);
//		System.out.println(sub2);
//		//9. animals변수에서 ,를 기준으로  문자열을  분리해서  3개의 단어로 각각 출력하는 프로그램을 작성하세요
//		String animals = "dog,cat,bear";
//		animals = animals.replace(","," ");
//		System.out.println(animals);
//		
//		//10. str문자열에서 ,를 .으로 바꾸어 출력하는 프로그램을 작성하세요.
//		String str="java,lang,Object";
//		str = str.replace(",",".");
//		System.out.println(str);
//		
//	}
//}
