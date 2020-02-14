package d_array;

import java.util.Arrays;
import java.util.Scanner;


//야구게임
public class Baseball {

	public static void main(String[] args) {
		int[] answer = new int[3];
		int[] input = new int[answer.length];
		
		boolean isDuplicated;
		do{
			isDuplicated = false;
			
			for(int i = 0; i < answer.length; i++){
				answer[i] = (int)(Math.random() * 9) + 1;
			}
			for(int i = 0; i < answer.length; i++){
				for(int j = 0; j < answer.length; j++){
					if(i != j && answer[i] == answer[j]){
						isDuplicated = true; // 하나라도 중복되는게 있으면 다시 돌아서 중복이 나오지 않을때까지 실행
					}
				}
			}
		}while(isDuplicated);

		Scanner s = new Scanner(System.in);
		int count = 0;
		while(true){
			System.out.println(answer.length + "자리 숫자를 입력해주세요. >");
			int temp  = Integer.parseInt(s.nextLine());
			
			int index = input.length - 1;
			while(0 < temp){
				input[index--] = temp % 10;
				temp /= 10;
			}
			int strike = 0;
			int ball = 0;
			int out = 0;
			
			for(int i = 0; i < answer.length; i++){
				for(int j = 0; j < input.length; j++){
					if(answer[i] == input[i]){ // 정답과 입력한 값이 같을 때
						if( i == j){ // 인덱스가 같을 때엔 스트라이크
							strike++;
						}else{ // 인덱스 값이 다를때엔 볼
							ball++;
						}
					}
				}
			}
			out = answer.length - strike - ball; // 랭스(3)에서 스트라이크와 볼을 빼면 아웃
			
			System.out.println(++count + "차 시도" + Arrays.toString(input).replace(",","") + " : " + strike + "S "
					+ ball + "B " + out + "0");
			
		}
	}
}