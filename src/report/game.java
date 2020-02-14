package report;
import java.util.Scanner;
public class game {
	Scanner s = new Scanner(System.in);
	   String name;
	   int LV = 16;
		void START(){ // 게임 시작
		      System.out.println("RPG");
		      System.out.println("게임을 시작하시겠습니까?");
		      System.out.println("1. 새로운 시작 2. 게임 종료");
		      String so = s.nextLine();
		      
		      if(so.equals("1")){
		       name();
		      }else{
		        
		      }
		   }
		void name(){ // 용사 이름 정하기
		      System.out.println("당신의 이름을 입력해주세요.");
		      name = s.nextLine();
		      System.out.println("< "+ name +" > " +" 정말 이 이름으로 하시겠습니까? (Y,N)");
		      System.out.println("이름을 확정하지 않고 바꾸기를 고르면 타이틀로 돌아갑니다.");
		      String name1 = s.nextLine();
		      if(name1.equals("Y")){
		         
		      }else{
		         START();
		      }
		      
		   }

	}


