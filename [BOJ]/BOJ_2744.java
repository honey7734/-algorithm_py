import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2744 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arr = br.readLine().toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (Character.isUpperCase(arr[i])){
                arr[i] = Character.toLowerCase(arr[i]);
            }else{
                arr[i] = Character.toUpperCase(arr[i]);
            }
        }
        System.out.println(arr);
    }
}
