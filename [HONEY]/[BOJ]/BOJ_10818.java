import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int min = 1000000;
        int max = -1000000;

        for (int i = 0; i < num; i++) {
            int n = Integer.parseInt(st.nextToken());
            if(n < min) min = n;
            if(n > max) max = n;
        }

        System.out.printf("%s %s", min, max);
    }
}
