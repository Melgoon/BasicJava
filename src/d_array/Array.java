package d_array;
import java.util.Arrays;
import java.util.Scanner;
public class Array {

	public static void main(String[] args) {
		/*
		 * << 배열 >>
		 * - int[] number = new int[5]; // 기본값이 저장됨
		 * - int[] mumbrt = new int[]{10,20,30,40,50};
		 * - int[] number = {10,20,30,40,50}
		 */
		
		//배열은 참조형 타입이다.
		int[] array; //배열의 주소를 저장할 공간이 만들어진다.
		array = new int[5]; // 배열이 생성되고 그 주소가 저장된다.
		// new : 새로운 저장공간 생성 및 주소 반환
		//int [5] : int를 저장할 수 있는 5개의 공간
		// 배열 초기화 시 기본값이 저장된다.
		
		System.out.println(array);
		System.out.println(array[0]); //실제 값에 접근하기 위해서는 index를 지정해줘야 한다.
		//index에는 int만 사용할 수 있다.( 리터럴,변수,상수 연산 등)
		// 배열의 최대 크기는 int의 최대값(약 20억)이다.
		
		String arrayStr = Arrays.toString(array); //배열의 모든 인덱스에 저장된 값을 문자열로 반환한다.
		System.out.println(arrayStr);
		
		int[] iArray1 = new int[]{1,2,3}; //값의 개수로 배열의 길이가 정해진다.
		int[] iArray2 = {1,2,3};//선언과 초기화를 동시에 해야한다.
		int[] iArray3;
		
		array[0] = 10;//인덱스는 0부터 시작한다.
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;
		array[4] = 50;
//		array[5] = 50; //ArrayIndexOutOfBoundsException 발생
		
		//정수를 저장할 수 있는 길이가 10인 배열을 생성 및 초기화 해주세요.
		
		int[] array1 = new int[10];
		
		//모든 인덱스에 있는 값을 변경해주세요.
		array1[0] = 10;
		array1[1] = 20;
		array1[2] = 30;
		array1[3] = 40;
		array1[4] = 50;
		array1[5] = 60;
		array1[6] = 70;
		array1[7] = 80;
		array1[8] = 90;
		array1[9] = 100;
		
		//모든 인덱스에 있는 값을 더해주세요.
		int sum = 0;
		//sum = array1[0] + array1[1] + array1[2] + array1[3] + 
				//array1[4] + array1[5] + array1[6] + array1[7] + array1[8] + array1[9];
		//System.out.println(sum);
		
		sum += array1[0];
		sum += array1[1];
		sum += array1[2];
		sum += array1[3];
		sum += array1[4];
		sum += array1[5];
		sum += array1[6];
		sum += array1[7];
		sum += array1[8];
		sum += array1[9];
		System.out.println(sum);
		
		//index는 1씩 증가하는 규칙이 있어 for문과 함께 사용하기 좋다.
		for(int i = 0; i < array1.length; i++){ //배열의 수를 모두 출력하는 코드 length를 사용
			System.out.println(array1[i]);
		}
		for(int i = 0; i < array1.length; i++){
			array1[i] = i + 1;
		}
		System.out.println(Arrays.toString(array1));
		// 배열에 숫자를 저장하고 합계와 평균을 구해보자
		int[] aa = new int[10];
		for(int i = 0; i < aa.length; i++){
			aa[i] = (int)(Math.random() * 100) + 1;
		}
		System.out.println(Arrays.toString(aa));
		
		sum = 0; // 합계
		double avg = 0; // 평균
		for(int i = 0; i < aa.length; i++){
			sum += aa[i];
		}
		avg = (double)sum / aa.length;
		System.out.println("합계 : " + sum + " / 평균 : " + avg);
		
		//향상된 for문
		for(int aa1 : aa){
			System.out.println(aa1);
		}
		
//		for(int aa1 : aa){
//			aa1 = 0; // aa의 값은 변경되지 않는다.
//			System.out.println(aa1);
//		}
//		System.out.println(Arrays.toString(aa));
//		
		//배열에 저장된 숫자들중 최소값과 최대값을 찾아주세요.
		int min = aa[0]; // 최소값을 저장할 변수를 만들고 배열의 첫번째 숫자를 저장한다
		int max = aa[0]; // 최대값을 저장할 변수를 만들고 배열의 첫번째 숫자를 저장한다.
		//배열의 길이만큼 반복하면서
		for(int i = 0; i < aa.length; i++){
			if(max < aa[i]){ // 최대값과 배열의 값을 비교해 배열의 값이 더 큰 경우 
				max = aa[i]; // 최대값에 배열의 값을 저장한다.
			}else if(aa[i] < min){
				min = aa[i]; //최소값과 배열의 값을 비교해 배열의 값이 더 작은 경우 최소값에 배열의 값을 저장한다.
			}
		}
		System.out.println("최대값 : " + max  + " 최소값 : " + min);
		//
		int[] shuffle = new int[30];
		for(int i = 0; i < shuffle.length; i++){
			shuffle[i] = i + 1;
	}
		System.out.println(Arrays.toString(shuffle));
		
		//저장된 배열을 랜덤하게 새로 저장
		for(int i = 0; i < shuffle.length *10; i++){
			int j =(int) (Math.random() * shuffle.length); // 랜덤값을 생성 (배열크기만큼)
			int temp = shuffle[0]; // 변수를 새로 생성해서 잠깐동안 저장한다.
			shuffle[0] = shuffle[j]; // 랜덤값을 첫번째 인덱스 값에 넣어준다/
			shuffle[j] = temp;
		}
		System.out.println(Arrays.toString(shuffle));
		
		//1 ~ 10 사이의 난수를 500번 생성하고, 각 숫자가 생성된 횟수를 출력해주세요.
		
//		int[] su = new int[10];
//		for(int i = 0; i < su.length * 500; i++){
//			int f =(int) (Math.random() * su.length);
//		}
//		System.out.println(Arrays.toString(su));
//		효울이 나쁜 코드
//		int[] numArr = new int[500];
//		int[] conuter = new int[500];
//		
//		for(int i=0; i < numArr.length; i++){
//			numArr[i]=(int)(Math.random() * 10);
//			System.out.print(numArr[i]);
//		}
//		System.out.println();
//		for(int i=0; i< numArr.length; i++){
//			conuter[numArr[i]]++;
//		}
//		for(int i=0; i < 10; i++){
//			System.out.println(i +"의 갯수 :" + conuter[i]);
//		}
		
		int[] counts = new int[10];
		for(int i = 0; i < 500; i++){
			int random = (int)(Math.random() * 10) + 1;
			counts[random - 1]++;
		}
		for(int i = 0; i < counts.length; i++){
			System.out.println(i + 1 + " : " + counts[i]);
		}
		
			
			// 위 문제의 최소값, 최대값, 반복횟수를 입력받아 각 숫자가 생성된 횟수를 출력해주세요.
		// 반복문을 찾을땐 규칙을 찾는다.
		Scanner s = new Scanner(System.in);
		System.out.println("최소값>");
		int min2 = Integer.parseInt(s.nextLine());
		System.out.println("최대값>");
		int max2 = Integer.parseInt(s.nextLine());
		System.out.println("반복 횟수>");
		int repeat = Integer.parseInt(s.nextLine());
		
		counts = new int[max2 - min2 + 1];
		
		for(int i = 0; i < repeat; i++){
			int random = (int)(Math.random() * (max2 - min2 + 1)) + min2; // 랜덤으로 값을 생성하여 랜덤에 넣는다.
			counts[random - min2]++;
		}
		for(int i = 0; i < counts.length; i++){
			System.out.println(i + min2 + " : " + counts[i]);
		}
		}
	}