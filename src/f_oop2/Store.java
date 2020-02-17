package f_oop2;

public class Store { 
	public static void main(String[] args) {
		Customer c = new Customer(); // 객체 생성
		Product p = (Product)new Desktop(); // 객체 생성 //  (형변환 생략) 자식클래스 -> 부모클래스
		Product p1 = (Product)new TV();
		p.info(); // 상품 내용
		c.buy(p); // 상품 구매
		
		p = new TV(); // 객체 생성 // 자식 클래스 -> 부모클래스 형변환 
		p.info();
		c.buy(p);
		
		p = new coffee();
		p.info();
		c.buy(p);
		
		c.showItem();
	}
}
class Product{ 
	String name;
	int price;
	
	Product(String name,int price){
		this.name =name;
		this.price = price;
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
		super("삼성 컴퓨터",5000000); //부모클래스의 생성자 호출
	}
}

class TV extends Product{ // 생성자 상속 받음
	TV(){
		super("LG TV",1270000);
	}
}

class coffee extends Product{ // 생성자 상속 받음
	coffee(){
		super("아메리카노", 3000);
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
		System.out.println("-------------장바구니--------------");
		for(int i = 0; i < item.length; i++){ // 배열의 길이 수 만큼 출력한다.
			if(item[i] != null){
				System.out.println(i + 1 + ". " + item[i].name);
			}
		}
		System.out.println("----------------------------------");
	}
	}

/*
 * 클래스이름() {} : 생성자
 * 
 *  */

