import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bw.readLine());
        StringTokenizer st = new StringTokenizer(bw.readLine(), " ");
        int v = Integer.parseInt(bw.readLine());

        int count = 0;
        while (st.hasMoreTokens()){
            int num = Integer.parseInt(st.nextToken());
            if(num == v) count++;
        }

        System.out.println(count);
    }
}
