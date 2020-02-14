package Test;

public class DrawShape {
	public static void main(String[] args) {
		Point[] p = { 	new Point(100,100),
						new Point(140, 50), // 배열에 3개의 값을 선언 후 저장
						new Point(200,100)
		};
		Triangle t= new Triangle(p); // 객체 생성
		Circle c = new Circle(new Point(150,150), 50); // 객체 생성
		
		t.draw();
		c.draw();
		
		}
	}
class Shape {
	String color = "black"; // color를 선언하고  black으로 초기화
	void draw(){
		System.out.printf("[color=%s]%n",color);
	}
}

class Point {
	int x; // int x 선언
	int y;// int y 선언
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	Point(){
		this(0,0);
	}
	String getXY(){
		return "("+x+","+y+")";
	}
}

class Circle extends Shape{ // Circle과 Shape는 상속관계
	Point center; // 원의 원점좌표 // Circle과 Point는 포함관계
	int r; // 반지름
	
	Circle(){
		this(new Point(0,0), 100); 
	}
	Circle(Point center, int r){
		this.center = center; // center 호출 (멤버변수)
		this.r = r;
	}
	void draw(){ // 원을 그리는 대신에 원의 정보를 출력하도록 했다.
		System.out.printf("[center=(%d, %d), r=%d, color=%s] %n", center.x, center.y, r, color);
	}
}

class Triangle extends Shape { 
	Point[] p = new Point[3]; // 3개의 Point인스턴스를 담을 배열을 생성한다.
	
	Triangle(Point[] p){
		this.p = p;
	}
	void draw(){
		System.out.printf("[p1=%s, p2=%s, p3=%s, color=%s] %n",p[0].getXY(), p[1].getXY(), p[2].getXY(), color);
	}
}

