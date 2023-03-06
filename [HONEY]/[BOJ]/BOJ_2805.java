package class_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_2805 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s, " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] tree = new int[n];

        s = br.readLine();
        st = new StringTokenizer(s, " ");

        for (int i = 0; i < n; i++) {
            tree[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(tree);
        System.out.println(binary_search(tree, n, m));
    }

    private static int binary_search(int tree[], int n, int m) {
        int left = 0;
        int right = tree[n - 1];

        while (left <= right) {
            int mid = (left + right) / 2;
            long current = 0;

            for (int i = 0; i < n; i++) {
                int temp = 0;

                if (tree[i] - mid >= 0) {
                    temp = tree[i] - mid;
                }

                current += temp;
            }

            if (current < m)
                right = mid - 1;
            else if (current > m)
                left = mid + 1;
            else
                return mid;

        }
        return right;
    }
}
