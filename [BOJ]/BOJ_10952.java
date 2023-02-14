import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BOJ_10952 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> sumList = new ArrayList<>();

        while (true){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a == 0 && b == 0) break;

            sumList.add(a+b);
        }

        for (Integer sum : sumList) {
            System.out.println(sum);
        }
    }
}
