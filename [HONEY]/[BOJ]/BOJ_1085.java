package ss;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class java {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
	
		int up = w - x;
		int down = x;
		int left = y;
		int rigt = h - y;
		
		int min = 9999;
		if(up < min) min = up;
		if(down < min) min = down;
		if(left < min) min = left;
		if(rigt < min) min = rigt;
		
		System.out.println(min);
		
	}
}
