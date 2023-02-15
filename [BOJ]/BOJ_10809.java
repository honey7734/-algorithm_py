import java.util.Scanner;

public class BOJ_10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for (int i = 'a'; i <= 'z'; i++){
            int pos = str.indexOf((char)i);
            System.out.print(pos + " ");
        }
    }
}
