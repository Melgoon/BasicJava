package report;


public class Product {
		int number;
		String name;
	    int price = (int) (Math.random());
	    int MAXPrice;
		
		Product(int number,String name,double d,int MAXPrice){
			this.number = number;
			this.name =name;
			this.price = (int) d;
			this.MAXPrice = MAXPrice;
		}
		
		void info(){ 
			System.out.println("-------------------------------");
			System.out.println("구매 번호 : " + number);
			System.out.println("상품명 : " + name);
			System.out.println("금 액 : " + price + "원" + " MAX 가격 : " + MAXPrice);
			System.out.println("-------------------------------");
		}
	}

	class Water extends Product{ // 생성자 상속받음

		Water(){ // 물건
			super(1,"0.6L 물병", Math.random()*3378,3378); //부모클래스의 생성자 호출
		}
	}

	class Moonshin extends Product{ // 생성자 상속 받음
		Moonshin(){
			super(2,"밀주",Math.random()*56792,56792);
		}
	}

	class MRE extends Product{ // 생성자 상속 받음
		MRE(){
			super(3,"MRE 도시락", Math.random()*88800,88800);
		}
	}
	class Survkit extends Product{
		Survkit(){
			super(4,"Surv kit", Math.random()*138300,138300);
		}
	}
	class Wcase extends Product{
		Wcase(){
			super(5,"무기 상자", Math.random()*1200000,1200000);
		}
	}
	
	class Customer{ // 클래스
		
		int money = 100000;
		Product[] item = new Product[30]; // 장바구니
		void buy(Product p){ // 구매
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
				System.out.println(p.name + "(을)를 구매했다.");
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
		void sell(Product p){
			if(money < p.price){
				System.out.println("");
				return;
			}
				money += p.price; // price 가격 만큼 money에 증감
				for(int i = 0; i < item.length; i++){ 
					if(item[i] != null){
						item[i] = null;
						break;
					}
				}
				System.out.println(p.name + "(을)를 판매했다.");
		}
		}
