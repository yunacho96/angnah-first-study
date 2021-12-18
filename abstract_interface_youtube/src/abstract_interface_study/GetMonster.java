package abstract_interface_study;

class GetMonster {
    public int solution(int[] enemies, int[] armies) { // 에네미에서 잡을 수 있는 몬스터의 수를 리턴하도록 만들자 
        // 여기에 코드를 작성해주세요.
        int answer = 0;	
		for(int i=0; i<armies.length; i++) {
			int n=0;
			for(int j=0; j<enemies.length; j++) {
				if(armies[i]>=enemies[j]) {
					n++;
					answer = Math.max(answer, n);
				}
			}
		}
			
        return answer;
    }
    
    public static void main(String[] args) {
    	GetMonster sol = new GetMonster();
    	int[] enemies1 = {1, 4, 3};
    	int[] armies1 = {1, 3};
    	int ret1 = sol.solution(enemies1, armies1);

    	// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
    	System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

    	int[] enemies2 = {1, 1, 1};
    	int[] armies2 = {1, 2, 3, 4};
    	int ret2 = sol.solution(enemies2, armies2);

    	// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
    	System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
    }
}