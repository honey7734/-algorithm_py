import java.io.*;
import java.util.StringTokenizer;

public class BOJ_2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t =Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int reCnt = Integer.parseInt(st.nextToken());
            char[] str = st.nextToken().toCharArray();
            String result = "";
            for (char word:str) {
                for (int j = 0; j < reCnt; j++) {
                    result += word;
                }
            }
            bw.write(result+"\n");
        }

        bw.flush();
        bw.close();
    }
}
