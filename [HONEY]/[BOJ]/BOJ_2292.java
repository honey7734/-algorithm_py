package test;

import java.util.Scanner;

public class BOJ_Code {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		while(n > 0) {
			if(count == 0) {
				n = n - 1;
			}else {
				n -= 6 * count;
			}
			count++;
		}
		
		System.out.println(count);
	}
}
