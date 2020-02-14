import java.util.Arrays;


public class Hello {

	public static void main(String[] args) {
		int[][] scores = new int[3][5];
		
		for(int i = 0; i < scores.length; i ++){
			for(int j = 0; j < scores[i].length; j ++){
				scores[i][j] = (int)(Math.random() * 100);
				
			}
			System.out.println(Arrays.toString(scores[i]));
		}

	}

}
