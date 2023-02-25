import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BOJ_2577 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num = String.valueOf(sc.nextInt() * sc.nextInt() * sc.nextInt());
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i < 10; i++) {
			map.put(i, 0);
		}
		
		for(int i = 0; i < num.length(); i++) {
			int n = Integer.parseInt(String.valueOf(num.charAt(i)));
			map.put(n, map.get(n)+1);
		}
		
		for(int i = 0; i < 10; i++) {
			System.out.println(map.get(i));
		}
	}
}
