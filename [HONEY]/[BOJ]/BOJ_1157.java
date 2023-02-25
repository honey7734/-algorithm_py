package ss;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class java {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine().toUpperCase();
		Map<String, Integer> countMap = new HashMap<>();
		for(int i = 0; i < str.length(); i++) {
			String s = String.valueOf(str.charAt(i));
			if(countMap.get(s) == null) {
				countMap.put(s, 1);
			}else {
				countMap.put(s, countMap.get(s)+1);
			}
			
		}
		
		String max_key = String.valueOf(str.charAt(0));
		for(String key : countMap.keySet()) {
			int cnt = countMap.get(key);
			if(cnt > countMap.get(max_key)) {
				max_key = key;
			}
		}
		
		int max = countMap.remove(max_key);
		if(countMap.containsValue(max)) {
			System.out.println("?");
		}else {
			System.out.println(max_key);
		}
		
	}
}
