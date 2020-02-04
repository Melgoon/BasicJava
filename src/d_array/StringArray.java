package d_array;
import java.util.Scanner;

public class StringArray {

	public static void main(String[] args) {
		String s = new String("ABCD"); // 참조형 타입을 초기화하는 방법
		String str = "ABCD"; //String은 특별히 간단하게 초기화 가능
		
		char[]  charArray = str.toCharArray(); //String 클래스 내부에 문자배열을 가지고 있다.
		System.out.println(charArray);
		
		/*
		 *  << String의 주요 메소드 >>
		 *  - equals() : 문자열의 내용이 같은지 확인한다.
		 *  - length() : 문자열의 길이를 반환한다.
		 *  - chatAt() : 문자열에서 해당 위치에 있는 문자를 반환한다.
		 *  - substring() : 문자열에서 해당 범위에 있는 문자열을 반환한다.
		 *  - indexOf() : 문자열 내의 특정 문자열의 인덱스를 반환한다.
		 *  - replace() : 문자열 내의 특정 문자열을 원하는 문자열로 변경해 반환한다.
		 */
		
		for(int i = 0; i < str.length(); i++){
			System.out.println(str.charAt(i)); //chatAt() : 문자열에서 해당 위치에 있는 문자를 반환한다.
		}
		String revStr = ""; //str을 거꾸로 담을 변수
		//뒤에서부터 한글자씩 가져와서 새로운 변수에 더한다.
		for(int i = str.length() -1; i >= 0; i--){
//			revStr += str.charAt(i);
			revStr = revStr + str.charAt(i);
		}
			System.out.println(revStr);
			str = "0123456789";
			String sub1 = str.substring(3); // 3번 인덱스부터 잘라서 반환한다.
			System.out.println(sub1);
			String sub2 = str.substring(5,8); //5번 인덱스부터 8번 인덱스 전까지 잘라서 반환한다.
			System.out.println(sub2);
			
			str = "치킨 피자 돈까스 떡볶이";
			int idx = str.indexOf("피자"); // 피자의 시작 인덱스를 반환한다.
			System.out.println(idx);
			
			String[] menus = {
					"치킨 18000원",
					"피자 9900원",
					"돈까스 8000원",
					"떡볶이 500원"
			};
			for(int i = 0; i < menus.length; i++){
				String name = menus[i].substring(0,menus[i].indexOf(" "));
				System.out.println(name);
			}
//			for(int i = 0; i < menus.length; i++){
//				String name = menus[i].substring(4,menus[i].indexOf("원"));
//				System.out.println(name);
//			}
			
			for(int i = 0; i < menus.length; i++){
				int name = Integer.parseInt(menus[i].substring(menus[i].indexOf(" ") + 1, menus[i].indexOf("원")));
				System.out.println(name);
			}
			
//			str = "123456789";
//			str = str.replace("3", "짝");
//			System.out.println(str);
//			str = str.replace("6", "짝");
//			System.out.println(str);
//			str = str.replace("9","짝");
//			System.out.println(str);
			
			String pn = "010-2363-3647";
			//하이픈(-)을 제거해서 출력해주세요.
			pn = pn.replace("-","");
			System.out.println(pn);
			
			//숫자를 입력받아 입력받은 숫자에 3자리 마다 콤마(,)를 붙여 출력해주세요.

			Scanner SB = new Scanner(System.in); 
			System.out.println("숫자를 입력하세요>");
			String so = SB.nextLine(); // 숫자를 입력받을 그릇
			String SD = ""; // 담을 그릇
			
			int count = 0; // 콤마(,)를 셀 카운트
			
			for(int i = so.length() - 1; i >= 0; i--){ // 뒤에서부터 숫자를 센다.
				SD = so.charAt(i) + SD;  // 받아온 수 앞에 새로 받아온 수를 더해서 붙인다.(숫자처럼 합치는 것이 아님!)
				
				count++; // 카운트 ++
				
				if(count % 3 == 0 && count != so.length()){ // 3자리마다 콤마를 찍고, 앞에 콤마가 있을 시 콤마를 지워줌
					SD = "," + SD; // SD는 위에서 3개를 합친 수 그리고 + 앞의 콤마가 찍힌다.
				}
			}
			System.out.println(SD);
	}
}
