import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BOJ_2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numList = new ArrayList<>();
        int max = -9999999;
        int max_index = 0;
        for (int i = 0; i < 9; i++) {
            numList.add(sc.nextInt());
            if (max < numList.get(i)){
                max = numList.get(i);
                max_index = i;
            }
        }
        System.out.println(max);
        System.out.println(max_index+1);

    }
}
