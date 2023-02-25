package ss;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class java {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		BufferedWriter br = new BufferedWriter(new OutputStreamWriter(System.out));
		while (true) {
	        int a = sc.nextInt();
	        int b = sc.nextInt();
	        int c = sc.nextInt();
			if(a == 0 && b == 0 && c == 0) break;
			
			if(Math.pow(a,2) + Math.pow(b, 2) == Math.pow(c, 2) || Math.pow(a,2) + Math.pow(c,2) == Math.pow(b,2) || Math.pow(b,2) + Math.pow(c,2) == Math.pow(a,2)) {
				br.write("right\n");
			}else {
				br.write("wrong\n");
			}
		}
		
		br.flush();
		br.close();
	}
	
}
