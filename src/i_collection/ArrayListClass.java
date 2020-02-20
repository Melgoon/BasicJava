package i_collection;

import java.util.ArrayList;

public class ArrayListClass {

	public static void main(String[] args) {
		/*
		 * add() 	: 마지막 위치에 객체를 추가
		 * get() 	: 지장된 위치의 객체를 반환
		 * set() 	: 지정된 위치에 주어진 객체를 저장(수정)
		 * remove() : 지정된 위치의 객체를 제거
		 * size() 	: 저장된 객체의 수 반환
		 */
		
		ArrayList<Object> list = new ArrayList<Object>();
		
		list.add(10);
		list.add("ABC");
		list.add(true);
		list.add(new ArrayListClass());
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("abc");
		list2.add("123");
		list2.add("가나다");
		list2.set(1,"456");
		
		for(int i = 0; i < list2.size(); i++){
			System.out.println(list2.get(i));
		}
		list2.remove(0);
		System.out.println(list2.get(0));
		System.out.println(list2.get(1));
		
		ArrayList<ArrayList<Integer>> list3 = new ArrayList<>(); //2차원 배열
		ArrayList<Integer> list4 = new ArrayList<>();
		list4.add(10);
		list4.add(20);
		
		list3.add(list4);
		
		list4 = new ArrayList<>();
		list4.add(30);
		list4.add(40);
		
		list3.add(list4);
		
		System.out.println(list3);
		
		//정수를 저장할 수 있는 ArrayList를 생성해 랜덤한 값을 5번 저장해주세요.
		ArrayList<Integer> list5 = new ArrayList<Integer>();
		for(int i = 0; i < 5; i++){
			list5.add((int)(Math.random()*100));
		}
		System.out.println(list5);
		
		//위에서 만든 ArrayList에 저장된 값들 중 합계와 평균을 출력해주세요.
		ArrayList<Integer> list6 = new ArrayList<Integer>();
		int sum = 0;
		double avg = 0;
		for(int i = 0; i < 5; i++){
			sum += list5.get(i);
		}
		avg = (double)sum/list5.size();
		System.out.println("총합 : " + sum + " 평균 : " + avg);
		
		//위에서 만든 ArrayList에 저장된 값들 중 최소값과 최대값을 출력해주세요.
		ArrayList<Integer> list7 = new ArrayList<Integer>();
		int max = list5.get(0);
		int min = list5.get(0);
		for(int i = 0; i < 5; i++){
			if(max < list5.get(i)){
				max = list5.get(i);
			}else if(list5.get(i) < min){
				min = list5.get(i);
			}
		}
		System.out.println("최대값 : " + max + " 최소값 : " + min);
		
	}

}
/*for(int i = 0; i < aa.length; i++){
if(max < aa[i]){ // 최대값과 배열의 값을 비교해 배열의 값이 더 큰 경우 
	max = aa[i]; // 최대값에 배열의 값을 저장한다.
}else if(aa[i] < min){
	min = aa[i]; //최소값과 배열의 값을 비교해 배열의 값이 더 작은 경우 최소값에 배열의 값을 저장한다.
}
}
System.out.println("최대값 : " + max  + " 최소값 : " + min);*/