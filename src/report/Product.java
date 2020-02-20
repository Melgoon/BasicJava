package report;
import java.util.Random;
import java.util.Scanner;



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
	class Salewa extends Product{
		Salewa(){
			super(6,"살레와 의약 키트", Math.random()*600000,600000);
		}
	}
	
	class Customer{ // 클래스
		
		int money = 10000;
		Product[] item = new Product[10]; // 장바구니
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
			System.out.println("-------------장바구니--------------");
			for(int i = 0; i < item.length; i++){ // 배열의 길이 수 만큼 출력한다.
				if(item[i] != null){
					System.out.println(i + 1 + ". " + item[i].name);
				}
				
			}
			
			System.out.println("----------------------------------");
		}
		void sell(Product p){
			
				money += p.price; // price 가격 만큼 money에 증감
				for(int i = 0; i < item.length; i++){ 
					if(item[i] != null){
						item[i] = null;
						break;
					}
				}
				System.out.println(p.name + "(을)를 판매했다.");
		}
		void money(){
			System.out.println("목표 금액 : 100000000");
			System.out.println("내 현금 :" + money);
			if(money >= 100000000){
				System.out.println("목표 금액까지 모았습니다.");
				 System.exit(0);
			}
		}
		void parttimejob(){
			Random random = new Random(); 
			Boolean [] enchant = new Boolean[4];
			 for(int i=0; i<enchant.length; i++) {
	                enchant[i] = random.nextBoolean();
	                 
	                if(enchant[i]) {
	                    System.out.println("열심히 청소하는 중......");              
	                }
	                else System.out.println("진상 손님 응대 중......");
	            }
			if(enchant[0]){
				System.out.println("일을 너무 형편없이 했네요!");
				money += 2700;
			}else if(enchant[1]){
				System.out.println("평범하게 일했습니다.");
				money += 5000;
			}else if(enchant[2]){
				System.out.println("타인의 귀감! 솔선수범하는 모습에 보너스까지!");
				money += 10000;
			}else if(enchant[3]){
				System.out.println("근무 중 가게 물건을 부셔먹었습니다.");
				money += 1300;
			}
		}
	}