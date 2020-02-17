package report;
import java.util.Scanner;

public class game {
	 Scanner s = new Scanner(System.in);
	 Product name;
	 Product price;
	 Product p = (Product)new Desktop();
	 Product p1 = (Product)new TV();
	 Product p2 = (Product)new coffee();
	 Product p3 = (Product)new iPhone();
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
	      System.out.println("1.상품목록 2.내 장바구니 및 현금");
	      String so = s.nextLine();
	      if(so.equals("1")){
	    	  info();
	      }else{
	    	 showItem();
	   }
	   }

	      void info(){ 
	    	  p.info();
	    	  p1 = new TV();
	    	  p1.info();
	    	  p2 = new coffee();
	    	  p2.info();
	    	  p3 = new iPhone();
	    	  p3.info();
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
	    	  }
	    	  
	      }
	      
	      void showItem(){
	    	  c.showItem();
	    	  menu();
	      }

	   void gameexit(){
	      System.out.println("게임을 종료하였습니다.");
	   }
	}


