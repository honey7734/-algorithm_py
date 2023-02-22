import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        char[] chars = br.readLine().toCharArray();
        int sum = 0;
        for (int i = 0; i < num; i++) {
            int val = Integer.parseInt(String.valueOf(chars[i]));
            sum += val;
        }
        System.out.println(sum);
    }
}
