import java.io.*;
import java.util.StringTokenizer;

public class BOJ_18111 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int[][] place = new int[n][m];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            for (int j = 0; j < m; j++) {
                int value = Integer.parseInt(st.nextToken());
                place[i][j] = value;

                max = Math.max(max, value);
                min = Math.min(min, value);
            }
        }


        int result_time = Integer.MAX_VALUE;
        int result_height = -1;

        // 최소 높이 ~ 최대 높이
        for (int height = min; height <= max; height++) {
            int seconds = 0;
            int inventory = b;

            for (int i = 0; i < n; i++) for (int j = 0; j < m; j++) {
                int diff = place[i][j] - height;
                if(diff != 0){
                    int s_val = diff > 0 ? 2 : 1;
                    int i_val = diff > 0 ? 1 : -1;
                    seconds += Math.abs(diff) * s_val;
                    inventory += Math.abs(diff) * i_val;
                }
            }

            if (inventory >= 0 && seconds <= result_time ) {
                result_time = seconds;
                result_height = height;
            }
        }

        bw.write(result_time + " " + result_height);
        bw.flush();
        bw.close();
    }
}
