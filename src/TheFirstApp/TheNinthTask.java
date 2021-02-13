package TheFirstApp;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TheNinthTask {
    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        int millisecondInOneDay = 86400000;

        try {
            Date date1 = dateFormat.parse("17.05.2018");
            Date date2 = dateFormat.parse("13.05.2018");
            int differenceInMilliseconds = (int) (date2.getTime() - date1.getTime());
            int days = differenceInMilliseconds / millisecondInOneDay;

            System.out.println("Різниця між датами в днях: " + (Math.abs(days)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
