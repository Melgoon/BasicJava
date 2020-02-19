package h_useful;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class RegularExpression {

	public static void main(String[] args) {
		/*
		 * 정규표현식 : 문자열의 패턴을 검사하는 표현식
		 * 
		 * ^ 뒷 문자열로 시작
		 * $ 앞 문자열로 종료
		 * . 임의의 문자(줄바꿈 제외)
		 * * 앞 무자가 0개 이상
		 * + 앞 문자가 1개 이상
		 * ? 앞 문자가 없거나 1개
		 * [] 문자의 집합이나 범위([a-z] : a부터 z까지,  [^a-z] : a부터 z가 아닌 것)
		 * {} 앞 문자의 개수({2} : 2개, {2,4} : 2개 이상 4개 이하)
		 * () 그룹화(1개의 문자처럼 인식)
		 * | OR 연산
		 *\s 공백, 탭, 줄바꿈
		 *\S 공백, 탭, 줄바꿈이 아닌 문자
		 *\w 알파벳이나 숫자
		 *\W 알파벳이나 숫자가 아닌 문자
		 *\d 숫자
		 *\D 숫자가 아닌 문자
		 *(?i) 뒷 문자의 대소문자 구분 안함
		 *\ 정규 표현식에서 사용되는 특수문자 표현
		 */
		
		String str = "abc123";
//		String regex = "[a-z]{3}[0-9]{1,3}";
//		String regex = "[a-z0-9]+";
//		String regex = "\\w*";
		String regex = ".*";
		
		Pattern p = Pattern.compile(regex);
		
		Matcher m = p.matcher(str);
		System.out.println(m.matches());
		
		//아이디, 전화번호, 이메일주소의 유효성을 검사하는 정규표현식을 만들어주세요.
		
		String id = "melgoon7298";
		String banho = "01055197298";
		String email = "dbdnd2@gmail.com";
		
		String regex1 = "[a-z]{7}[0-9]{4}";
		Pattern p1 = Pattern.compile(regex1);
		Matcher m1 = p1.matcher(id);
		String regex2 = "\\d{11}";
		Pattern p2 = Pattern.compile(regex2);
		Matcher m2 = p2.matcher(banho);
		String regex3 = "\\w{6}@\\w{5}.\\w{3}";
		Pattern p3 = Pattern.compile(regex3);
		Matcher m3 = p3.matcher(email);
		System.out.println(m1.matches());
		System.out.println(m2.matches());
		System.out.println(m3.matches());
		
		Scanner sc = new Scanner(System.in);
		String id2 = sc.nextLine();
		
		String regex4 = "[a-z]{0,7}";
		Pattern p4 = Pattern.compile(regex4);
		Matcher m4 = p4.matcher(id2);
		System.out.println(m4.matches());

	}

}
