import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;


public class BOJ_2884 {
    public static void main(String[] args) throws IOException, ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("HH mm");
        Date date = format.parse(sc.nextLine());
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.MINUTE, -45);

        System.out.printf("%s %s", cal.get(Calendar.HOUR_OF_DAY), cal.get(Calendar.MINUTE));
    }
}
