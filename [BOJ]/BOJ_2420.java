import java.util.Scanner;

public class BOJ_2420 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();

        long res = n-m;
        if(res < 0) res *= -1;

        System.out.println(res);
    }
}
