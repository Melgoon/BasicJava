package d_array;

import java.util.Arrays;

public class Score {

	public static void main(String[] args) {
		/*
		 *  우리반 모두의 Java, Oracle, HTML, CSS, JQuery, JSP 점수를 50 ~ 100까지 랜덤으로 생성하고,
		 *  석차순으로 석차, 이름, 과목별 점수, 총점, 평균을 출력해주세요.
		 *  1차원 배열 10,2차원 배열 24
		 *  석차 		이름 		Java 	ORacle 		HTML 	CSS 	JQuery 		JSP 	총점 		평균
		 *  1 		홍길동	100		90			80		70		60			50		350		75.0
		 *  1 		홍길동	100		90			80		70		60			50		350		75.0
		 *  1 		홍길동	100		90			80		70		60			50		350		75.0
		 *  1 		홍길동	100		90			80		70		60			50		350		75.0
		 *  1 		홍길동	100		90			80		70		60			50		350		75.0
		 *  1 		홍길동	100		90			80		70		60			50		350		75.0
		 *  
		 */
		
//		printRank(numbers); // 석차구하기
//		private static void printRank(int[] numbers) { // 석차 구하기
//			int[] rank = new int[numbers.length];
//			
//			for(int i = 0; i < rank.length; i++){
//				rank[i] = 1;
//			}
//			/*
//			 * 0,0 0,1 0,2 0,3 0,4 0,5 0,6 0,7 0,8 0,9
//			 * 1,0 1,1 1,2 1,3 1,4 1,5 1,6 1,7 1,8 1,9
//			 */
//			for(int i = 0; i < numbers.length; i++){
//				for(int j = 0; j < numbers.length; j++){
//					if(numbers[i] < numbers[j]){ // i와 j를 비교해서 석차 구하기
//						rank[i]++;
//					}
//				}
//			}
//			for(int i = 0; i < numbers.length; i++){
//				System.out.println(numbers[i] + ":" + rank[i] + "등");
//			}
//			
//		}
		//랜덤값 50~100
//int[][] scores = new int[3][5]; 
//		
//		for(int i = 0; i< scores.length; i++){
//			for(int j = 0; j < scores[i].length; j++ ){ // 1차원의 길이 3에서 하나를 선택 후 안의 포문을 돌린다.
//				scores[i][j] = (int)(Math.random() * 50) +50; // 2차원의 길이 5에 5번을 넣고 다시 올라간다.
//				
//			}
//			System.out.println(Arrays.toString(scores[i]));
//		}
//		System.out.println("---------------");
		
		//합계와 통계
//		int[] sum = new int[scores.length];
//		double[] avg = new double[scores.length];
//		
//		
//		for(int i = 0; i< scores.length; i++){
//			for(int j = 0; j< scores[i].length; j++){
//				sum[i] += scores[i][j];
//			}
//			avg[i] = sum[i] / (double)scores[i].length; // 
//		}
//		
//		System.out.println(Arrays.toString(sum));
//		System.out.println(Arrays.toString(avg));
		
//		String pn = "010-2363-3647";
//		//하이픈(-)을 제거해서 출력해주세요.
//		pn = pn.replace("-","");
//		System.out.println(pn);
		
		System.out.println("석차 	이름 	Java ORacle HTML CSS JQuery JSP 총점 	평균");
		String[][] student = new String [1][24];
		int[][] hak = new int [24][8];
		int[] sum = new int[hak.length];
		double[] avg = new double[hak.length];
		
		for(int i =0; i< hak.length; i++){
			for(int j = 0; j < hak[i].length; j++){
				hak[i][j] = (int)(Math.random() * 50) + 50;
				sum[i] += hak[i][j];
			}
			avg[i] = sum[i] / (double)hak[i].length;
			System.out.print((hak[i]));
			System.out.print(sum[i]+"  ");
			System.out.println(avg[i]);
		}
		
		
		
		for(int i = 0; i< hak.length; i++){
			for(int j = 0; j< hak[i].length; j++){
				
			}
			
			}
		
		}
	}

