package mini;

import java.util.Scanner;

public class game {
		Scanner s = new Scanner(System.in);
		Princess p = new Princess();
		int day;
		int month;
		
		void START(){ // 게임 시작
		      System.out.println("PrincessMaker");
		      System.out.println("게임을 시작하시겠습니까?");
		      System.out.println("1. 새로운 시작 2. 게임 종료");
		      String so = s.nextLine();
		      if(so.equals("1")){
		        name();
		      }else{
		    	exit();
		      }

}
		void exit(){
			System.out.println("게임을 종료하였습니다.");
		}
		void name(){
			System.out.println("딸의 이름을 입력해주세요.");
			p.name = s.nextLine();
			System.out.println( p.name +" 이 이름으로 좋습니까? Y/N");
			System.out.println( "아니오를 선택하면 타이틀로 돌아갑니다.");
			String so = s.nextLine();
			if(so.equals("Y")){
				menu();
			}else{
				START();
			}
		}
		void menu(){
			System.out.println("1.교육 2.아르바이트 3.자유행동 4.공주 상태 ");
			String so = s.nextLine();
			if(so.equals("1")){
				educate();
			}else if(so.equals("2")){
				 parttimejob();
			}else if(so.equals("3")){
				Free_action();
			}else if(so.equals("4")){
				info();
			}if(day>30){
				month++;  
		    	  }
			if(month>12){
				p.age++;
			}
			if(p.age>18){
				p.ending();
			}
		}
		void info(){
			p.info();
			menu();
		}
		
		void Free_action(){
			p.Free_action();
			day++;
			menu();
		}
		
		void parttimejob(){
			System.out.println("1.나무베기 2.병원 3.하녀 4.주점 5.여관 6.대필점 7.교회 8.무기상점 9.나가기");
			String so = s.nextLine();
			if(so.equals("1")){
				p.logging();
				day++;
	    		  menu();
			}else if(so.equals("2")){
				p.hospital();
				day++;
				menu();
			}else if(so.equals("3")){
				p.maid();
				day++;
				menu();
			}else if(so.equals("4")){
				p.bar();
				day++;
				menu();
			}else if(so.equals("5")){
				p.INN();
				day++;
				menu();
			}else if(so.equals("6")){
				p.ghostwriteshop();
				day++;
				menu();
			}else if(so.equals("7")){
				p.church();
				day++;
				menu();
			}else if(so.equals("8")){
				p.weaponshop();
				day++;
				menu();
			}else if(so.equals("9")){
				menu();
			}
		}
		void educate(){
			System.out.println(("1. 무예 2. 학문 3. 왕실 예절 "));
			String so = s.nextLine();
			if(so.equals("1")){
				p.martial_arts();
				day++;
				menu();
			}else if(so.equals("2")){
				p.study();
				day++;
				menu();
			}else if(so.equals("3")){
				p.Court_etiquette();
				day++;
				menu();
			}
		}
}