import java.io.*;

public class BOJ_8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());

        int sum_val = 0;
        for (int i = 0; i < num; i++) {
            String str = br.readLine();
            char[] char_arr = str.toCharArray();
            int sum = 0 ;
            for (char c : char_arr) {
                if (c == 'O'){
                    sum++;
                    sum_val += sum;
                }else {
                    sum = 0;
                }
            }
            bw.write(sum_val + "\n");
            sum_val = 0;
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
