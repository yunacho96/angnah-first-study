package abstract_interface_study;

import java.util.Map;
import java.util.Set;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class MapTest {


	public static void main(String[] args) {
		fibonacci();

	}

	public static String player() { // 참여자 중 완료하지 못한 사람을 출력하라 
		String[] participant = {"유나","민우","슬롬"};
		String[] completion = {"민우","유나"};
		String answer = ""; // 초기값 설정 
		//		방법 1
		//		Map<String, Integer> map = new HashMap<>();
		//		
		//		for(String player : participant) {
		//			map.put(player, map.getOrDefault(player, 0)+1);
		//		}
		//		for(String player : completion) {
		//			map.put(player, map.get(player)-1);
		//		}
		//		
		//		for(String key : map.keySet()) {
		//			if(map.get(key)!=0) {
		//				answer = key;
		//			}
		//		}
		//		

		//		방법 2
		Map<String, Integer> map = new HashMap<>();
		for(String player : participant) {
			map.put(player, map.getOrDefault(player, 0)+1);
		}
		for(String success : completion) {
			map.put(success, map.get(success) -1);
		}
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> iterator = entrySet.iterator();
		while(iterator.hasNext()) {
			Map.Entry<String, Integer> entry = iterator.next();
			if(entry.getValue() != 0) {
				answer = entry.getKey();
			}
		}

		return answer;
	}

	public static boolean  startsWith() {
		boolean answer = true;
		String[] array = {"119", "97674223", "1195524421"};
		/* 오름차순 정렬 */
		Arrays.sort(array); 
		/* 내림차순 정렬  
		 * Arrays.sort(array, Collections.reverseOrder());
		 * */
		for(String value : array) {
			System.out.println(value);
		}
		for(int i=0;i<array.length-1;i++) {
			if(array[i+1].startsWith(array[i])) {
				answer = false;
			}
		}

		return answer;
	}

	public static void listTest() {
		//System.out.println(player() + " : 완주하지 못한 사람의 값 ");
		//System.out.println(startsWith()   + " : 리턴확인");
		List<String> list = new ArrayList<>();
		list.add("나는");
		list.add("유나야");
		list.add(1,"배고픈");
		list.add("지금은");

		list.clear();
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));	
		}
		System.out.println(list.size());
	}

	public static void setTest() {
		Set<String> set = new HashSet<>();
		set.add("1");
		set.add("2");
		set.add("3");
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) { // 셋에 들은 객체 출력 방법 1
			if(iterator.next().equals("3")) {
				iterator.remove();
			}



		}
		for(String num : set) {
			System.out.println(num  + " 반복자에서 삭제한 게 셋에서도 사라지나 확인 ");
		}

		/*
		for(String num : set) { // 셋에 들은 객체 출력 방법 2
			System.out.println(num + " set2");
		}*/

	}

	public static void mapTest() {
		Map<String, Integer> map = new HashMap<>();

		map.put("키입니다", 100);
		map.put("키입니다2", 200);

		/* keySet 로 셋을 이용한 데이터 처리 
		Set<String> keySet = map.keySet();
		Iterator<String> iterator = keySet.iterator();
		while(iterator.hasNext()) {
			String key = iterator.next();
			System.out.println(key + " 키 확인");
			System.out.println(map.get(key) + " 값 확인");
		}
		for(String key : keySet) {
			System.out.println(key + " 키 확인2");
			System.out.println(map.get(key) + " 값 확인2");
		}
		 */

		/* entry 로 셋을 이용한 데이터 처리 */
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet(); // 모든 엔트리를 셋 컬렉션으로 얻음 
		Iterator<Map.Entry<String, Integer>> iterator = entrySet.iterator();
		while(iterator.hasNext()) {
			Map.Entry<String, Integer> entry = iterator.next();
			System.out.println(entry.getKey() + " 키 확인 ");
			System.out.println(entry.getValue() + " 값 확인 ");
		}

	}

	public static void bestAlbum(){
		String[] genres = {"classic", "pop", "classic", "classic", "pop"};
		int[] plays = {500, 600, 150, 800, 2500};
		int[] answer;//  장르별 가장 많이 재생된 음악 2개씩 담기 (장르중에서도 더 많이 재생된 장르순으로 ) 

		List<String> genres_order = new ArrayList<>();
		String max_key = ""; // 가장 많이 들은 장르 

		/* 장르별 많이 들은 순 */
		Map<String, Integer> map = new HashMap<>();
		for(int i=0; i<genres.length; i++) {
			map.put(genres[i],map.getOrDefault(genres[i], 0)+plays[i]);
		}

		Set<String> keySet = map.keySet();
		int max = 0;
		for(String key : keySet) {
			if(map.get(key)>=max) {
				max = map.get(key);
				max_key = key;

			}
		}
	}

	
	public static void findNum() { // 찾아라 k번째에 있는 수를 ! commands [i,j,k]
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		int[] answer = new int[commands.length];
		
		/* 배열 자른는 방법 
		int[] cutarray = Arrays.copyOfRange(array, 1, 5); 
		System.out.println(Arrays.toString(cutarray));
		*/
		
		for(int i=0; i<commands.length; i++) {
			int[] newArr = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
			Arrays.sort(newArr);
			answer[i] = newArr[commands[i][2]-1];
		}
	}
	
	public static void findMax() { // 배열로 조합할 수 있는 수 중 가장 큰 수를 출력하라 
		String answer = "";
		int[] arr = {6, 10, 2};
		String[] str = new String[arr.length];
		for(int i=0; i<arr.length; i++) {
			str[i] = String.valueOf(arr[i]);
		}
		Arrays.sort(str, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return ((o2+o1).compareTo(o1+o2)); // 내림차순 
			}
			
		});
		
		for(String num: str) {
			if(num.equals("0")) {
				answer = "0";
			}
			answer += num;
		}
		
		System.out.println(answer + " : 답 ");
		
	}
	
	public static void fibonacci() {// 피보나치 수열 출력하기 - 30이하 까지만 
		int[] list = new int[20];
		list[0] = 1;
		list[1] = 1;
		
		for(int i=2; i<list.length; i++) {
			if(i==2) {
				list[i] = list[0] + list[1];
			}else {
				list[i] = list[i-2] +  list[i-1];
			}
		}
		for(int num : list) {
			if(num < 30) {
				System.out.println(num);
			}
			
		}
	}
	
	public static void numOutput() { //숫자30까지  3의배수는 fizz, 5의 배수는 buzz , 나머지는 숫자로 출력 하라 
		for(int i=1; i<=30; i++) {
			
			if((i%3)==0) {
				System.out.println("fizz");
			}else if((i%5)==0){
				System.out.println("buzz");
			}else {System.out.println(i);}
			
		}
	}

}

