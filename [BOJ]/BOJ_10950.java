import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BOJ_10950 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        List<Integer> sumList = new ArrayList<>();

        for (int i = 0; i < row; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            sumList.add(a+b);
        }

        for (Integer sum : sumList) {
            System.out.println(sum);
        }
    }
}
