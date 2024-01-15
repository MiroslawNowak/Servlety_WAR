package pl.coderslab.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main01 {

    public static void main(String[] args) {

        String email = "ms_-nowak0995@gma-.il.com";
        System.out.println(verifyEmail(email));
    }

    static boolean verifyEmail (String email) {
        Pattern testEmail = Pattern.compile("[_a-zA-Z0-9-]+(\\.[_a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*\\.([a-zA-Z]{2,}){1}");
        Matcher matcher = testEmail.matcher(email);
        return matcher.matches();
    }
}
