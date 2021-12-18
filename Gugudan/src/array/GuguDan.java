package array;

public class GuguDan {

	public GuguDan() {
		this.controller();
	}
	
	private void controller() {
		
		//1. g = 2~9 까지 저장할 배열만들고 데이터 입력
		int[] g = new int[8];
		for(int index = 0; index < g.length; index++) {
			g[index] = index + 2;
		}
		
		//2. d = 1~9 까지 저장할 배열을 만들어 데이터 입력
		int[] d = new int[9];
		for(int index = 0; index < d.length; index++) {
			d[index] = index +1;
		}
		//3. r = d*g 
		
		int[][] r = new int[9][8];
		for (int dIndex = 0; dIndex < d.length; dIndex++) {
			for(int gIndex = 0; gIndex < g.length; gIndex++) {
				r[dIndex][gIndex] = d[dIndex] * g[gIndex];
			}
		}
		
		// 출력확인 //  81 
		System.out.print(r[8][7]);
		
		
		
		
	}
}

