package pl.coderslab.setmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main02 {

    public static void main(String[] args) {
        var answers = getMap();
        Scanner scan = new Scanner(System.in);
        int score = 0;

        for (var question : answers.keySet()) {
            System.out.printf("Podaj przeciwieństwado słowa: %s", question);
            var userInput = scan.nextLine();

            if (question.equalsIgnoreCase(answers.get(question))) {
                score++;
            }
        }
        System.out.printf("Poprawnych odpowiedzi: %d", score);
    }
    public static Map<String, String> getMap() {
        HashMap result = new HashMap<String, String>();
            result.put("kot", "pies");
            result.put("biały", "czarny");
            result.put("mąż", "żona");
            result.put("ciepło", "zimno");
            result.put("młody", "stary");
            return result;
    }
}
