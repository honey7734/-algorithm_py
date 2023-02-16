import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int res = 0;
        while (st.hasMoreTokens()){
            int num =(int) Math.pow(Integer.parseInt(st.nextToken()), 2);
            res += num;
        }
        System.out.println(res % 10);
    }
}
