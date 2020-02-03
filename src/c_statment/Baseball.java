package c_statment;

import java.util.Scanner;
public class Baseball {

	public static void main(String[] args) {
		//숫자야구게임을 만들어주세요.
		int value = (int)( Math.random()*9 )+1; // 랜덤함수 1~9까지 +1을 해준 이유는 없으면 0부터 999999까지 나오기 때문
		int value2 = (int)( Math.random()*9 )+1;
		int value3 = (int)( Math.random()*9 )+1;
		while (true) {
	         if (value != value2) { //value와 value2가 같지 않으면 value3을 생성

	            if (value2 != value3 && value != value3) { //value2랑 value3 그리고 value랑 value3이 같지 않으면 브레이크로 멈춤
	               break;
	            } else {
	               value3 = (int) (Math.random() * 9) + 1; //랜덤함수 1~9
	            }

	         } else { // value와 value2가 같으면 value를 새로 생성
	            value = (int) (Math.random() * 9) + 1;
	         }
		}System.out.println(value+" "+value2+" " +value3);
		Scanner s = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int c = 0;
		int S = 0;
		int ball = 0;
		int o = 0;
		while(true){
		// 입력 -> 랜덤값과 비교 
		System.out.println("수를 입력해주세요 : ");
		int num = Integer.parseInt(s.nextLine());
		a = num/100;
		b = num/10%10;
		c = num%10;

	    System.out.println("수:"+ value + value2 + value3);    
	        

        if(value == a){
        	S++;
        }
        if(value2 == b){
        	S++;
        }
        if(value3 == c){
        	S++;
        }
        if (value == b || value == c){
        	ball++;
        }
        if (value2 == a || value == c){
        	ball++;
        }
        if (value3 == a || value == b){
        	ball++;
        }
        o = 3-(S + ball);
        
        if(S == 3){
        	System.out.println("정답입니다.");
        	break;
        }
        System.out.println(S + "S " + ball +"B " + o + "O");
        
        
        
        
        
//    	}if(value2 == b){
//    		S++;
//        }else if(value == b && value3 == b){
//        	ball++;
//        }else{
//        	o++;
//        }if(value3 == c){
//        	S++;
//        }else if(value == c && value2 == c){
//        	ball++;
//        }else{
//        	o++;
//	}if(S == 3){
//		System.out.println(S +"스트라이크" + ball+ "볼" + o + "아웃");
//		break;
//	}else if(S == S++ || ball == ball++ || o == o++){
//		System.out.println(S +"스트라이크" + ball+ "볼" + o + "아웃");
//	}
	

		}
		
	}
}

