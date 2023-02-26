package java;

import java.util.Scanner;

public class java {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int result = 0;
		for(int i = 0; i < n; i++) {
			int num = i;
			int sum = 0;
			
			while(num != 0) {
				sum += num % 10; //각 자리수의 합
				num /= 10;
			}
			
			if(sum + i == n) {
				result = i;
				break;
			}
		}
		
		System.out.println(result);
	}
}
