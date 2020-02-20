package i_collection;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapClass {

	public static void main(String[] args) {
		/*
		 * put() 	: 지정된 키와 값을 저장
		 * get() 	: 지정된 키의 값을 반환(없으면 null)
		 * remove() : 지정된 키로 저장된 값을 제거
		 * keySet() : 저장된 모든 키를 Set로 반환
		 * 
		 */
		
		HashMap<String, String> map = new HashMap<>(); // 키는 웬만하면 스트링을 사용, 앞이 키 뒤가 값
		
		map.put("title", "제목입니다.");
		map.put("content","내용입니다.");
		map.put("user", "유웅");
		map.put("date","2020-02-20 14:48");
		
		System.out.println(map.get("title"));
		System.out.println(map.get("content"));
		System.out.println(map.get("user"));
		System.out.println(map.get("date"));
		
		map.put("user", "홍길동"); // 키엔 여러값이 중첩될 수 없고 덮어씌워진다.
		System.out.println(map.get("user")); 
		
		map.remove("user"); // 키를 넘겨주면 저장된 값이 사라진다.
		System.out.println(map.get("user"));
		
		for(String key : map.keySet()){
			String value = map.get(key);
			System.out.println(key + " : " + value);
		}
		
		//두 사람의 정보를 저장하고 있는 ArrayList<HashMap<String, String>>을 만들어주세요.
		//홍길동, 남자, 30세,프로그래머
		//이순신, 남자, 40세, 장군
		ArrayList<HashMap> st = new ArrayList<HashMap>();
		HashMap<String, String> map1 = new HashMap<>();
		map1.put("name", "홍길동");
		map1.put("sex","남자");
		map1.put("age", "30세");
		map1.put("job","프로그래머");
		System.out.println(map1.get("name"));
		System.out.println(map1.get("sex"));
		System.out.println(map1.get("age"));
		System.out.println(map1.get("job"));
		HashMap<String, String> map2 = new HashMap<>();
		map2.put("name", "이순신");
		map2.put("sex","남자");
		map2.put("age", "40세");
		map2.put("job","장군");
		System.out.println(map2.get("name"));
		System.out.println(map2.get("sex"));
		System.out.println(map2.get("age"));
		System.out.println(map2.get("job"));
		st.add(map1);
		st.add(map2);
		System.out.println("------------------------------");
		
		for(String key1 : map1.keySet()){
			String value = map1.get(key1);
			System.out.println(key1 + " : " + value);
		}
		System.out.println("------------------------------");
		for(String key1 : map2.keySet()){
			String value = map2.get(key1);
			System.out.println(key1 + " : " + value);
		}
		System.out.println("------------------------------");
		//HaashMap을 파라미터로 받아 저장된 모든 값을 출력하는 메소드를 만들어주세요.
		for(HashMap<String, String > m : st){
			printMap(m);
		}
	}
	private static void printMap(HashMap<String, String> map){
		for(String key : map.keySet()){
			String value = map.get(key);
			System.out.println(key + " : " + value);
		}
		System.out.println("------------------------------");
	}
}
