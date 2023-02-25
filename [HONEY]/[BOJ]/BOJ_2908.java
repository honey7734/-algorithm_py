import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2908 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		char[] arr_num1 = st.nextToken().toCharArray();
		char[] arr_num2 = st.nextToken().toCharArray();
		
		int num1 = Integer.parseInt(String.valueOf(arr_num1[2]) + String.valueOf(arr_num1[1]) + String.valueOf(arr_num1[0]));
		int num2 = Integer.parseInt(String.valueOf(arr_num2[2]) + String.valueOf(arr_num2[1]) + String.valueOf(arr_num2[0]));
						
		if(num1 > num2) System.out.println(num1);
		if(num2 > num1) System.out.println(num2);
	}
}
