package e_oop;
import java.util.Scanner;
public class game {
   Scanner s = new Scanner(System.in);
   String name;
   int LV = 16;
   //몬스터,아이템,레벨,경험치,능력치,동료테이블,몬스터 숫자,정사루트,IF루트,게임시작,게임종료,타이틀
   public void START(){ // 게임 시작
      System.out.println("RPG");
      System.out.println("게임을 시작하시겠습니까?");
      System.out.println("1. 새로운 시작 2. 게임 종료");
      String so = s.nextLine();
      
      if(so.equals("1")){
         P2();
      }else{
         P4();
      }
   }
   void P2(){ // 용사 이름 정하기
      System.out.println("당신의 이름을 입력해주세요.");
      name = s.nextLine();
      System.out.println("< "+ name +" > " +" 정말 이 이름으로 하시겠습니까? (Y,N)");
      System.out.println("이름을 확정하지 않고 바꾸기를 고르면 타이틀로 돌아갑니다.");
      String name1 = s.nextLine();
      if(name1.equals("Y")){
         P5();
      }else{
         START();
      }
      
   }
   
   void P4(){ // 게임 종료
      System.out.println("게임을 종료하였습니다.");
   }
   void P5(){ // 스토리
      System.out.println("-----------------");
      System.out.println("STORY");
      System.out.println("세계는 동쪽을 마물이, 서쪽은 인류가 지배하는 모습의 세계 이 힘의 균형을 깬 것은 마물들에게서 마왕이 나타나");
      System.out.println("마물의 군세를 이끌고 전쟁을 일으키면서 수세에 몰린 인류들에게서 용사가 나타나며 마왕을 향해 모험을 떠나는데...");
      P6();
   }
   void P6(){ // 튜토리얼
      System.out.println("-----------------");
      System.out.println("마물 군단병 : 아직도 마왕님에게 도전하는 자가 있었나");
      System.out.println(name + " : 마왕을 무찌르는 것이 내 사명이다!");
      System.out.println("마물 군단병 : 그렇게 말하고 스러져간 놈들을 따라가게 해주겠다.");
      System.out.println("-----------------");
      System.out.println("전투 시작");
      System.out.println("-----------------");
      firstchoice();
   }
   void firstchoice(){ // 첫 초이스
      System.out.println("1. 공격 2.도망가기");
      String choice = s.nextLine();
      
      if(choice.equals("1")){
         firstBattle();
      }else{
         defaultending();
      }
   }
   void defaultending(){ // 기본 엔딩, 배드엔딩
      System.out.println("마왕의 발 끝에도 가보지 못하고... 엔딩 : 세상은 멸망하였습니다.");
   }
   void Bossending(){ // 보스 엔딩, 배드엔딩
      System.out.println("마왕의 발 끝엔 갔으나... 엔딩 : 세상은 멸망하였습니다.");
   }
   void hpaayending(){ // 기본 엔딩, 해피엔딩
      System.out.println("마왕을 무찌르고 엔딩 : 세상은 평화로워졌습니다.");
   }
   void Godending(){ // 숨겨진 엔딩, 열린결말
      System.out.println("신의 개입 엔딩 : 세상은 더욱 혼란해져야한다.");
   }
   
   void firstBattle(){ // 첫 초이스에서 공격을 선택했을 때
      int ememyHP = 500;
      int ememydamage = 175;
      int HP = 500;
      int damage = 270;
      System.out.println(" Lv.15 마물 군단병 ");
      System.out.println(" 체력 : " + ememyHP);
      System.out.println(name +" 의 공격");
      int HAP = ememyHP - damage;
      System.out.println(" Lv.15 마물 군단병 ");
      System.out.println(" 체력 : " + HAP );
      System.out.println("-----------------");
      System.out.println(name + " 의 체력 : " + HP);
      System.out.println("마물 군단병의 공격");
      int HAP2 = HP - ememydamage;
      System.out.println(name + " 의 체력 : " + HAP2);
      Battlechoice();
      }
   
   void Battlechoice(){ // 첫번째 공격 이후 초이스
      System.out.println("1. 공격 2.도망가기");
      String choice = s.nextLine();
      
      if(choice.equals("1")){
          Battle1();
      }else{
         defaultending();
      }
   }

   void Battle1(){
      int ememyHP = 230;
      int ememydamage = 175;
      int HP = 325;
      int damage = 270;
      System.out.println(" Lv.15 마물 군단병 ");
      System.out.println(" 체력 : " + ememyHP);
      System.out.println(name +" 의 공격");
      int HAP = ememyHP - damage;
      System.out.println(" Lv.15 마물 군단병 ");
      System.out.println(" 체력 : " + HAP );
      System.out.println("-----------------");
      System.out.println("마물 군단병이 죽었습니다.");
      int HAP2 = LV + 1;
      System.out.println(name + "의 레벨 : " + HAP2);
      rountchoice();
      
   }
   
   void rountchoice(){
      System.out.println("-----------------");
      System.out.println("1. 마왕에게 도전 2.도망가기");
      String choice = s.nextLine();
      
      if(choice.equals("1")){
         bossBattle();
      }else{
         defaultending();
      }
   }
   
   void bossBattle(){
      System.out.println("마왕 : 용사의 힘을 가진 자가 드디어 왔구나");
      System.out.println(name + " : 너와 이야기할 생각은 없다! 인류권의 평화를 위해 죽어라!");
      System.out.println("마왕 : 인류는 가축같은 존재다. 우리가 주가 되고 너희가 부가 되는 것인데 어찌 자유를 원하느냐?");
      System.out.println(name + " : 역시 마물과는 대화할 가치가 없군 죽어라!");
      System.out.println("-----------------");
      System.out.println("1. 공격 2.도망가기");
      String choice = s.nextLine();
      if(choice.equals("1")){
         BossBattle();
      }else{
         Bossending();
      }
   }
   
   void BossBattle(){ // 
      int BossHP = 8000;
      int ememydamage = 275;
      int HP = 500;
      int damage = 270;
      System.out.println(" Lv.67 마왕 ");
      System.out.println(" 체력 : " + BossHP);
      System.out.println(name +" 의 공격");
      int HAP = BossHP - damage;
      System.out.println(" Lv.67 마왕 ");
      System.out.println(" 체력 : " + HAP );
      System.out.println("-----------------");
      System.out.println(name + " 의 체력 : " + HP);
      System.out.println("마왕의 공격");
      int HAP2 = HP - ememydamage;
      System.out.println(name + " 의 체력 : " + HAP2);
      BossBattlechoice();
      }
   void BossBattlechoice(){
      System.out.println("마왕 : 왜 그러느냐? 아직 여기까지 오기에는 힘이 부족한게 아니느냐?");
      System.out.println(name + " : 시끄럽다! 나는 네놈을 무찌르겠다!");
      System.out.println("마왕 : 바퀴벌레처럼 생존하려 하는구나 용사야");
      System.out.println("1. 공격 2.신성계 공격 3.도망가기");
      String choice = s.nextLine();
      if(choice.equals("1")){
         BossBattle2();
      }else if(choice.equals("2")){
         BossBattle3();
      }else if(choice.equals("4")){
         BossBattle4();
      }
      else{
         Bossending();
      }
   }
   void BossBattle2(){ // 
      int BossHP = 7730;
      int ememydamage = 275;
      int HP = 225;
      int damage = 270;
      System.out.println(" Lv.67 마왕 ");
      System.out.println(" 체력 : " + BossHP);
      System.out.println(name +" 의 공격");
      int HAP = BossHP - damage;
      System.out.println(" Lv.67 마왕 ");
      System.out.println(" 체력 : " + HAP );
      System.out.println("-----------------");
      System.out.println(name + " 의 체력 : " + HP);
      System.out.println("마왕의 공격");
      int HAP2 = HP - ememydamage;
      System.out.println(name + " 의 체력 : " + HAP2);
      System.out.println(name + " 의 체력이 다했습니다. ");
      System.out.println("마왕 : 하하! 용사야 힘이 다했구나");
      Bossending();
      }
   
   void BossBattle3(){ // 
      int BossHP = 7730;
      int ememydamage = 175;
      int HP = 225;
      int damage = 270;
      int sindamage = 7460;
      System.out.println(" Lv.67 마왕 ");
      System.out.println(" 체력 : " + BossHP);
      System.out.println(name +" 의 공격");
      int HAP = BossHP - damage;
      System.out.println(" Lv.67 마왕 ");
      System.out.println(" 체력 : " + HAP );
      System.out.println("-----------------");
      System.out.println( name + " 의 체력 : " + HP);
      System.out.println("마왕의 공격");
      int HAP2 = HP - ememydamage;
      System.out.println(name + " 의 체력 : " + HAP2);
      System.out.println("마왕 : 하하! 용사야 힘이 다했구나 ");
      System.out.println(name +" 의 신성계 공격!");
      int HAP3 = HAP - sindamage;
      System.out.println("마왕에게 신성데미지 대 효과");
      System.out.println(" Lv.67 마왕 ");
      System.out.println(" 체력 : " + HAP3 );
      System.out.println("-----------------");
      System.out.println("마왕이 죽었습니다.");
      int HAP4 = LV + 52;
      System.out.println(name + "의 레벨 : " + HAP4);
      
      hpaayending();
      }
   void BossBattle4(){ // 
      int BossHP = 7730;
      int ememydamage = 275;
      int HP = 225;
      int damage = 270;
      int sindamage = 7460;
      System.out.println(" Lv.67 마왕 ");
      System.out.println(" 체력 : " + BossHP);
      System.out.println(name +" 의 공격");
      int HAP = BossHP - damage;
      System.out.println(" Lv.67 마왕 ");
      System.out.println(" 체력 : " + HAP );
      System.out.println("-----------------");
      System.out.println( name + " 의 체력 : " + HP);
      System.out.println("마왕의 공격");
      int HAP2 = HP - ememydamage;
      System.out.println(name + " 의 체력 : " + HAP2);
      System.out.println("마왕 : 하하! 용사야 힘이 다했구나 ");
      System.out.println(" 신 : 세상은 더욱 혼탁해져야하기 때문에 새로운 용사를 보내야겠구나");
      System.out.println(" 마왕 : 세계에 개입하지 않겠다고 해놓고 뻔뻔하구나!");
      System.out.println(" 신 : 혼탁한 세상이야말로 내 즐거움인것을..");
      Godending();
      }
}