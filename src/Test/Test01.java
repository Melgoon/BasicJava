package Test;


public class Test01 {

	public static void main(String[] args) {
		
//		String[] members = { "최진혁","최유빈","한이람"};
//		for(int i = 0; i < members.length; i++){ // 초기화; 반복조건식; 증감식
//			String member = members[i];
//			System.out.println(member + "이 상담을 받았습니다.");
//		}
//		String[] members = { "최진혁","최유빈","한이람"};
//		for(String e : members){
//			System.out.println(e + "이 상담을 받았습니다.");
//		}
		
		
		/*double a=3.14;
		double b=3.14;
		System.out.println(a+b);
		
		
		long c = 15L;
		long d = 17L;
		System.out.println(c+d);
		
		int kor=99;
		int eng=80;
		int mat=81;
		int tot=kor+eng+mat;
		float ave=(float)tot/3;
		System.out.println(tot);
		System.out.println(ave);
		
		short g = 120;
		int g1 = g;
		System.out.println(g1);
		
		byte g3 = 120;
		short g4 = g3;
		System.out.println(g4);
		/*byte g5 = 120;
		char g6 = g5;
		System.out.println(g5);
		int g7 = 120;
		byte g8=(byte)g7;
		System.out.println(g8);
		long p = 123L;
		System.out.println(p);
		float f = 123.0f;
		System.out.println(f);*/
		
		/*int r;
		int a,b;
		a=5;
		b=3;
		r=0;
		r=a/b;
		r=a%b;
		System.out.println(r);*/
		/*int a=5;
		int r=0;
		r=a--; //a=a+1 ++a 먼저 증가시키고 대입 선위 증가 /a++ 먼저 대입하고 증가 후위 증가 --a 먼저 감소시키고 대입 선위 차감/a-- 먼저 대입하고 차감 후위 차감 
		System.out.println(r);
		System.out.println(a);
		
		char _char;*/

		/*int i=5;
		i++; // i=i+1;과 같은 의미이다. ++i;로 바꿔 써도 결과는 같다.
		System.out.println(i);
		
		i=5; // 결과를 비교하기 위해 i 값을 다시 5로 변경.
		++i;
		System.out.println(i);*/
		
//		int i = 5, j=0;
//		j = i++;
//		System.out.println("j=i++; 실행 후, i ="+ i +", j="+j); // 변수가 참조되기 전에 실행
//		
//		i=5;
//		j=0;
//		
//		j= ++i;
//		System.out.println("j=++i; 실행 후, i="+i+", j="+j); // 변수가 참조된 후에 실행
//		
//		i=5;
//		j=5;
//		
//		System.out.println(i++);
//		System.out.println(++j);
//		System.out.println("i = " + i + ", j = " + j);
//		
//		int a = -10;
//		a = +a;
//		System.out.println(a);
//		
//		a = -10;
//		a = -a;
//		System.out.println(a);
//		
//		int b = 10;
//		int c = 4;
//		System.out.printf("%d + %d = %d%n", b, c, b + c);
//		System.out.printf("%d - %d = %d%n", b, c, b - c);
//		System.out.printf("%d * %d = %d%n", b, c, b * c);
//		System.out.printf("%d / %d = %d%n", b, c, b / c);
//		System.out.printf("%d / %f = %f%n", b, (float)c, b / (float)c);
//		
//		String[] classGroup = new String[4];
//		classGroup[0] = "최진혁";
//		System.out.println(classGroup.length);
//		classGroup[1] = "최유빈";
//		System.out.println(classGroup.length);
//		classGroup[2] = "한이람";
//		System.out.println(classGroup.length);
//		classGroup[3] = "이고잉";
//		System.out.println(classGroup.length);
		
//		int year = 0;
//		int age = 14;
//		System.out.println(year);
//		System.out.println(age);
//		year = age + 2000;
//		age = age + 1;
//		System.out.println(year);
//		System.out.println(age);
//		
//		int x = 10, y = 20;
//		int tmp = 0;
//		
//		System.out.println("x:" + x + " y:" + y);
//		
//		tmp = x; // x = 10을 tmp에 담는다. 그러면 tmp는 10이 저장됨
//		x = y; // x에 y를 담는다. 그러면 x는 20이 저장된다.
//		y = tmp; // y에 tmp를 담는다 위에서 10을 저장한 tmp의 10 값이 y에 저장된다.
//		System.out.println("x:"+x + " y:" + y); // 그러면 x는 20을 출력하고 y는 10을 출력한다.
//		
//		String name = "Ja" + "va";
//		String str = name + 8.0; // name에 저장한 변수와 8.0을 저장
//		
//		System.out.println(name); // name 변수Z에 저장한 값을 출력
//		System.out.println(str); // str 변수에 저장한 값을 출력
//		System.out.println(7 + " "); // 7과 " "(공백을 출력) 이하는 거의 같은 맥락
//		System.out.println(" " + 7);
//		System.out.println(7 + "");
//		System.out.println("" + 7);
//		System.out.println("" + "");
//		System.out.println(7 + 7 + "");
//		System.out.println("" + 7 + 7);
//		
//		
		//형식화된 출력 --printf()
//		byte b =1;
//		short s = 2;
//		char c = 'A';
//		
//		int finger = 10;
//		long big = 100_000_000_000L; // long big = 100000000000L;
//		long hex = 0xFFFF_FFFF_FFFF_FFFFL ;
//		
//		int octNum = 010; // 8진수 10, 10진수로
//		int hexNum = 0x10; // 16진수 10, 10진수로는 16
//		int binNum = 0b10; // 2진수 10, 10진수로는 2
//		
//		System.out.printf("b=%d%n", b);
//		System.out.printf("s=%d%n", s);
//		System.out.printf("c=%c, %d %n", c, (int)c);
//		System.out.printf("finger=[%5d]%n", finger);
//		System.out.printf("finger=[%-5d]%n", finger);
//		System.out.printf("finger=[%05d]%n",finger);
//		System.out.printf("big=%d%n",big);
//		System.out.printf("hex=%#x%n", hex);
//		System.out.printf("octNum=%o, %d%n", octNum, octNum);
//		System.out.printf("hexNum=%x, %d%n", hexNum, hexNum);
//		System.out.printf("binNun=%s, %d%n", Integer.toBinaryString(binNum), binNum);
		
		
		String url = "www.codechobo.com";
		float f1 = .10f;
		float f2 = 1e1f;
		float f3 = 3.14e3f;
		double d = 1.23456789;
		
		System.out.printf("f1=%f, %e, %g%n", f1, f1, f1);
		System.out.printf("f2=%f, %e, %g%n", f2, f2, f2);
		System.out.printf("f3=%f, %e, %g%n", f3, f3, f3);
		
		System.out.printf("d=%f%n", d);
		System.out.printf("d=%14.10f%n", d); // 전체 14자리 중 소수점 10자리
		
		System.out.printf("[12345678901234567890]%n");
		System.out.printf("[%s]%n", url);
		System.out.printf("[%20s]%n", url);
		System.out.printf("[%-20s]%n", url); // 왼쪽 정렬
		System.out.printf("[%.8s]%n", url); // 왼쪽에서 8글자만 출력

		
		
		

	}

}
