package report;
import java.util.Scanner;

public class game {
	 Scanner s = new Scanner(System.in);
	 Product name;
	 Product price;
	 Product p = (Product)new Water();
	 Product p1 = (Product)new Moonshin();
	 Product p2 = (Product)new MRE();
	 Product p3 = (Product)new Survkit();
	 Product p4 = (Product)new Wcase();
	 Product p5 = (Product)new Salewa();
	 Customer c = new Customer();
	 
	 
	   void START(){ // 게임 시작
	      System.out.println("중고나라");
	      System.out.println("게임을 시작하시겠습니까?");
	      System.out.println("1. 새로운 시작 2. 게임 종료");
	      String so = s.nextLine();
	      
	      if(so.equals("1")){
	         menu();
	      }else{
	         gameexit();
	      }
	   }
	   
	   void menu(){
	      System.out.println("1.상품목록 2.내 장바구니 3. 상품 시세 4.보유중인 금액 5.아르바이트");
	      String so = s.nextLine();
	      if(so.equals("1")){
	    	  info();
	      }else if(so.equals("2")){
	    	 showItem();
	   }else if(so.equals("3")){
		   infomenu();
	   }else if(so.equals("4")){
		   money();
	   }else{
		   timemer();
	   }
	   }

	      void info(){ 
	    	  p.info();
	    	  p1.info();
	    	  p2.info();
	    	  p3.info();
	    	  p4.info();
	    	  p5.info();
	    	  
	    	  System.out.println("구매할 물품의 번호를 입력하세요.");
	    	  String so = s.nextLine();
	    	  
	    	  if(so.equals("1")){
	    		  c.buy(p);
	    		  menu();
	    	  }else if(so.equals("2")){
	    		  c.buy(p1);
	    		  menu();
	    	  }else if(so.equals("3")){
	    		  c.buy(p2);
	    		  menu();
	    	  }else if(so.equals("4")){
	    		  c.buy(p3);
	    		  menu();
	    	  }else if(so.equals("5")){
	    		  c.buy(p4);
	    		  menu();
	    	  }else if(so.equals("6")){
	    		  c.buy(p5);
	    		  menu();
	    	  }
	      }
	      void infomenu(){
	    	  p = new Water();
	    	  p.info();
	    	  p1 = new Moonshin();
	    	  p1.info();
	    	  p2 = new MRE();
	    	  p2.info();
	    	  p3 = new Survkit();
	    	  p3.info();
	    	  p4 = new Wcase();
	    	  p4.info();
	    	  p5 = new Salewa();
	    	  p5.info();
	    	  menu();
	      }
	      
	      void showItem(){
	    	  c.showItem();
	    	  System.out.println("1.팔기메뉴 2.메뉴");
		      String so = s.nextLine();
			  if(so.equals("1")){
	    		  sell();
			  }else if(so.equals("2")){
				  menu();
			  }else{
				  
			  }
	      }
	      
	      void sell(){
	    	  p.info();
	    	  p1.info();
	    	  p2.info();
	    	  p3.info();
	    	  p4.info();
	    	  p5.info();
	    	  System.out.println("판매할 물품의 번호를 입력하세요. "+" \n "+ "7번을 입력하면 메뉴로 갑니다.");
	    	  String so = s.nextLine();
	    	  if(so.equals("1")){
	    		  c.sell(p);
	    		  menu();
			  }else if(so.equals("2")){
				  c.sell(p1);
				  menu();
			  }else if(so.equals("3")){
				  c.sell(p2);
				  menu();
			  }else if(so.equals("4")){
				  c.sell(p3);
				  menu();
			  }else if(so.equals("5")){
				  c.sell(p4);
				  menu();
			  }else if(so.equals("6")){
				  c.sell(p5);
				  menu();
			  }else{
				  
			  }
	      }
	      void money(){
	    	  c.money();
	    	  menu();
	      }
	      void timemer(){
	    	  System.out.println("1. 아르바이트 2. 안할래요!");
	    	  String so = s.nextLine();
	    	  if(so.equals("1")){
	    		  c.parttimejob();
	    		  menu();
	    	  }else{
	    		  menu();
	    	  }
	      }

	   void gameexit(){
	      System.out.println("게임을 종료하였습니다.");
	   }
	}

//추가해야할 것 돈이 없다? 아르바이트 등을 추가하여 금액 조달(성공과 실패를 두고 얻는 알바비가 달라짐) 해결함
//로그인 기능
//턴표시가 필요할..지?




