package Test;

public class Test04 {

	public static void main(String[] args) {
		
		//주어진 문자열(s)을 갖는 String인스턴스를 생성한다.
//		String s = new String("Hello");
//		System.out.println(s);
		
		//주어진 문자열(value)을 갖는 String인스턴스를 생성한다.
//		char[] s = {'H','e','l','l','o'};
//		String s = new String(s);
//		System.out.println(s);
		
		//StringBuffer인스턴스가 갖고 있는 문자열과 같은 내용의 String인스턴스를 생성한다.
//		StringBuffer sb = new StringBuffer("Hello");
//		String ㄴ = new String (sb);
//		System.out.println(sb);
		
		
		//지정된 위치(index)에 있는 문자를 알려준다. *index는 0부터 시작
//		String s = "Hello";
//		String n = "0123456";
//		char c = s.charAt (1);
//		char c2 = n.charAt (1);
//		System.out.println(c);
//		System.out.println(c2);
		
		//문자열(str)과 사전순서로 비교한다. 같으면, 0을 , 사전순으로 이전이면 음수를, 이후면 양수를 반환한다.
//		int i = "aaa".compareTo("aaa");
//		int i2 = "aaa".compareTo("bbb");
//		int i3 = "bbb".compareTo("aaa");
//		System.out.println(i);
//		System.out.println(i2);
//		System.out.println(i3);
		
		// 문자열(str)을 뒤에 덧붙인다.
//		String s = "Hello";
//		String s2 = s.concat("World");
//		System.out.println(s2);
		
		//지정된 문자열(s)이 포함되었는지 검사한다.
//		String s = "abcedfg";
//		boolean b = s.contains("bc");
//		System.out.println(b);
		
		//지정된 문자열(suffix)로 끝나는지 검사한다.
//		String file = "Hello.txt";
//		boolean b = file.endsWith("txt");
//		System.out.println(b);
		
		//매개변수로 받은 문자열(obj)과 String 인스턴스의 문자열을 비교한다. obj가 String이 아니거나 문자열이 다르면 false를 반환한다.
//		String s = "Hello";
//		boolean b = s.equals("Hello");
//		boolean b2 = s.equals("hello");
//		System.out.println(b);
//		System.out.println(b2);
		
		//문자열과 String인스턴스의 문자열을 대소문자 구분없이 비교한다.
//		String s = "Hello";
//		boolean b = s.equalsIgnoreCase("HELLO");
//		boolean b2 = s.equalsIgnoreCase("heLLo");
//		System.out.println(b);
//		System.out.println(b2);
		
		//주어진 문자(ch)가 문자열에 존재하는지 확인하여 위치(index)를 알려준다. 못 찾으면 -1을 반환한다(index는 0부터 시작)
//		String s  = "Hello";
//		int idx1 = s.indexOf('o');
//		int idx2 = s.indexOf('k');
//		System.out.println(idx1);
//		System.out.println(idx2);
		
		//주어진 문자가(ch)가 문자열에 존재하는지 지정된 위치(pso)로부터 확인하여 위치(index)를 알려준다 못 찾으면 -1을 반환한다. (index는 0부터 시작)
		
//		String s = "Hello";
//		int idx1 = s.indexOf('e', 0);
//		int idx2 = s.indexOf('e', 2);
//		System.out.println(idx1);
//		System.out.println(idx2);
		
		//주어진 문자열이 존재하는지 확인하여 그 위치(index)를 알려준다. 없으면 -1을 반환한다. *index는 0부터 시작
//		String s = "ABCDEFG";
//		int idx = s.indexOf("CD");
//		System.out.println(idx);
		
		// 문자열을 상수풀(constant pool)에 등록한다. 이미 상수풀에 같은 내용의 문자열이 있을 경우 그 문자열의 주소값을 반환한다.
//		String s = new String ("abc");
//		String s2 = new String ("abc");
//		boolean b = (s==s2);
//		boolean b2 = s.equals(s2);
//		boolean b3 = (s.intern() ==s2.intern());
//		System.out.println(b);
//		System.out.println(b2);
//		System.out.println(b3);
		
		//지정된 문자 또는 문자코드를 문자열의 오른쪽 끝에서부터 찾아서 위치(index)를 알려준다. 못 찾으면 -1을 반환한다.
		
		//지정된 문자열을 인스턴스의 문자열 끝에서부터 찾아서 위치(index)를 알려준다. 못 찾으면 -1을 반환한다.
		
		//문자열의 길이를 알려준다.
		
		//문자열 중의 문자(old)를 새로운 문자(nw)로 바꾼 문자열을 반환한다.
		
		//문자열 중의 문자열(old)을 새로운 문자열(nw)로 모두 바꾼 문자열을 반환한다.
		
		//문자열 중에서 지정된 문자열(regex)과 일치하는 것을 새로운 문자열(replacement)로 모두 변경한다.
		
		//문자열 중에서 지정된 문자열(regex)과 일치 하는 것 중, 첫 번째 것만 새로운 문자열(replacement)로 변경한다.
		
		//문자열을 지정된 분리자(regex)로 나누어 문자열 배열에 담아 반환한다.
		
		//문자열을 지정된 분리자(regex)로 나누어 문자열배열에 담아 반환한다. 단, 문자열 전체를 지정된 수(limit)로 자른다.
		
		//주어진 문자열(prefix)로 시작하는지 검사한다.
		
		//주어진 시작위치(begin)부터 끝 위치(end) 범위에 포함된 문자열을 얻는다. 이 때, 시작위치의 문자는 범위에 포함되지만, 끝 위치의 문자는 포함되지 않는다.
		
		//String인스턴스에 저장되어있는 모든 문자열을 소문자로 변환하여 반환한다.
		
		//String인스턴스에 저장되어있는 모든 문자열을 반환한다.
		
		//String인스턴스에 저장되어있는 모든 문자열을 대문자로 변환하여 반환한다.
		
		//문자열의 왼쪽 끝과 오른쪽 끝에 있는 공백을 없앤 결과를 반환한다. 이 때 문자열 중간에 있는 공백은 제거되지 않는다.
		
		//지정된 값을 문자열로 변환하여 반환한다. 참조변수의 경우, toStoring()을 호출한 결과를 반환한다.
		
		
		
		

	}

}
