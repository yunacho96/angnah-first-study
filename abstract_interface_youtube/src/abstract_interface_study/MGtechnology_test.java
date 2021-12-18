package abstract_interface_study;

// (주)맑은기술에서 손코딩 문제  
public class MGtechnology_test {
	
	private static int sum(int start, int end) {
		int sum = 0;
		for(int i=start; i<=end; i++) {
			sum += i;
		}
		return sum;
	}
	
	private static int multiply(int start, int end) {
		int multiply = 1;
		for(int i=start; i<=end; i++) {
			multiply *= i;
		}
		return multiply;
	}
	
	public static void main(String[] args) {
		System.out.println(sum(1,3)  + " : 덧셈 확인값 ");
		System.out.println(multiply(1,4) + " : 곱셈 확인값 ");
	
	}

}
