import java.util.Scanner;

public class BOJ_9498 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        String score_val;
        if (score >= 90) {
            score_val = "A";
        } else if (score >= 80) {
            score_val = "B";
        } else if (score >= 70) {
            score_val = "C";
        } else if (score >= 60) {
            score_val = "D";
        } else {
            score_val = "F";
        }
        System.out.println(score_val);
    }
}
