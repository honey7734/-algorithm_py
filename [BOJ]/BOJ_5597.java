import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BOJ_5597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> stuList = new ArrayList<>();
        for(int i = 0; i < 28; i++){
            stuList.add(sc.nextInt());
        }

        for (int i = 1; i <=30; i++){
            if (!stuList.contains(i)){
                System.out.println(i);
            }
        }
    }
}
