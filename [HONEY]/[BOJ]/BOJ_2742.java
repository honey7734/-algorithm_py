import java.util.Scanner;

public class BOJ_2742 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        printNum(sc.nextInt());
    }
    public static void printNum(int num){
        System.out.println(num);
        if(num != 1) printNum(num - 1);
    }
}
