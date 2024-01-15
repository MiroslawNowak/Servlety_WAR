package pl.coderslab.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main02 {

    public static void main(String[] args) {

        String testPassword = "M!aKaRoNiArZ1";
        System.out.println(verifyPassword(testPassword));
    }

    static boolean verifyPassword(String password) {
        Pattern pass = Pattern.compile("^(?!.*[a-z]{2,})(?!.*[A-Z]{2,})(?=.*[a-z])(?=.*[A-Z]).{10,15}$");
        Matcher matcher = pass.matcher(password);
        return matcher.matches();
    }
}
