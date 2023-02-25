package ss;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class java {
	public static void main(String[] args) throws IOException {
		int max = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> list = new ArrayList<>();

		
		int num = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < num; i++) {
			int score = Integer.parseInt(st.nextToken());
			if(score > max) max = score;
			list.add(score);
		}
		
		double sum = 0.0;
		for(int i = 0; i < list.size(); i++) {
			int score = list.get(i);
			sum += (double)score/max*100;
		}
		
		System.out.println(sum/num);
	}
}
