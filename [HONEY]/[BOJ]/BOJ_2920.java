import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_2920 {
    public static void main(String[] args) throws IOException {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 8; i++) list.add(i);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        List<Integer> inputList = new ArrayList<>();
        while (st.hasMoreTokens()){
            int num = Integer.parseInt(st.nextToken());
            inputList.add(num);
        }

        if(list.equals(inputList)){
            System.out.println("ascending");
        }else{
            Collections.reverse(list);
            if (list.equals(inputList)){
                System.out.println("descending");
            }else {
                System.out.println("mixed");
            }
        }

    }
}
