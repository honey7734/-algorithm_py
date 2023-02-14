import java.util.Scanner;

public class BOJ_1087 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int res = 1;
        for (int i = 1; i <= num ; i++) {
           res *= i;
        }
        System.out.println(res);
    }
}
