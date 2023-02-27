package class_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ_2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int max = 0;
        st = new StringTokenizer(br.readLine(), " ");
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++) list.add(Integer.parseInt(st.nextToken()));

        for (int x = 0; x < list.size(); x++) {
            for (int y = 0; y < list.size(); y++) {
                for (int z = 0; z < list.size(); z++) {
                    int sum = list.get(x) + list.get(y) + list.get(z);
                    if(x != y && x !=z && y != z && sum <= m){
                        max = Math.max(max, sum);
                    }
                }
            }
        }

        System.out.println(max);
    }
}
