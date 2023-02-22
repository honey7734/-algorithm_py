import java.io.IOException;
import java.util.Scanner;
public class BOJ_15964 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        System.out.println((a+b)*(a-b));
    }
}
