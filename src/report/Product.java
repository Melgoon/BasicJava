package report;


public class Product {
		String name;
	    int price = (int) (Math.random());
		
		Product(String name,double d){
			this.name =name;
			this.price = (int) d;
		}
		
		void info(){ 
			System.out.println("-------------------------------");
			System.out.println("상품명 : " + name);
			System.out.println("금 액 : " + price + "원");
			System.out.println("-------------------------------");
		}
	}

	class Desktop extends Product{ // 생성자 상속받음

		Desktop(){ // 물건
			super("삼성 컴퓨터", Math.random()*1233000); //부모클래스의 생성자 호출
		}
	}

	class TV extends Product{ // 생성자 상속 받음
		TV(){
			super("LG TV",Math.random()*783720);
		}
	}

	class coffee extends Product{ // 생성자 상속 받음
		coffee(){
			super("아메리카노", Math.random()*3000);
		}
	}
	class iPhone extends Product{
		iPhone(){
			super("아이폰", Math.random()*1200000);
		}
	}
	
	class Customer{ // 클래스
		
		int money = 999999999;
		Product[] item = new Product[10]; // 장바구니
		void buy(Product p){
			if(money < p.price){
				System.out.println("돈이 부족합니다.");
				return;
			}
				money -= p.price; // money에서 price 가격만큼 차감
				for(int i = 0; i < item.length; i++){ // 장바구니 크기가 넘지 않으면 구매, 넘으면 구매 실패
					if(item[i] == null){
						item[i] = p;
						break;
					}
				}
				System.out.println(p.name + "을 구매했다.");
			}
		void showItem(){
			System.out.println("내 현금 :" + money);
			System.out.println("-------------장바구니--------------");
			for(int i = 0; i < item.length; i++){ // 배열의 길이 수 만큼 출력한다.
				if(item[i] != null){
					System.out.println(i + 1 + ". " + item[i].name);
				}
				
			}
			
			System.out.println("----------------------------------");
		}
		void sell(){
			
		}
		}
