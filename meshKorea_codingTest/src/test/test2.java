package test;

public class test2 {

	public static void main(String[] args) {
		/*문제의 의도는 주어진 배열을 로테이션 배열에 들은 값만큼 돌렸을 때 각각 최대값의 인덱스값을 배열로 출력하라는 것이었다.*/

		int[] a = {2,1,3,4};
		int[] rotate = {0,2};
		int[] indices = new int[rotate.length];	

		int maxIndex = 0;

		for(int i=0; i<rotate.length; i++) {
			if(rotate[i]!=0) {
				for(int j=0; j<rotate[i];++j) {
					int temp = a[0];
					for(int k=0; k<a.length;k++) {
						if(k!=a.length-1) {
							a[k] = a[k+1];
						}else {
							a[a.length-1] = temp;
						}

					}	
				}
				int max = a[0];
				for(int h=0; h<a.length;h++){
					if(a[h]>=max) {
						max = a[h];
						maxIndex = h;
					}
					System.out.println(a[h] + " a 1 배열 ");
				}

				indices[1] = maxIndex;
				System.out.println(maxIndex + " 1최대인덱스");


			}else {
				int max = a[0];
				for(int h=0; h<a.length;h++){
					if(a[h]>=max) {
						max = a[h];
						maxIndex = h;
					}
					System.out.println(a[h] + " a 2 배열 ");
				}
				indices[0] = maxIndex;
				System.out.println(maxIndex + " 최대인덱스");

			}


		}

		// 정답 나옴 : 로테이션 했을 때 가장 큰 수의 인덱스를 배열로 출력하면 되는 문제였음 
		System.out.println(indices[0] +"," + indices[1]);
	}

	

}