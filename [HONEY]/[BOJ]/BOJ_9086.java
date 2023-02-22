import java.io.*;

public class BOJ_9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String str = br.readLine();
            char start = str.charAt(0);
            char end = str.charAt(str.length()-1);

            bw.write(String.valueOf(start) + String.valueOf(end) + "\n");
        }
        br.close();
        bw.flush();
        bw.close();

    }
}
