package TheFirstApp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TheEightTask {
    public static void main(String[] args) {
        String password = "sfsdsfdfsfds_D345";
        String regex = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])[a-zA-Z0-9_]{8,}";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(password);

        if (m.matches()) {
            System.out.println("Пароль правильний");
        } else System.out.println("Пароль не правильний");
    }
}
