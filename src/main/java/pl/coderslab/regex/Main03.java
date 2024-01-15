package pl.coderslab.regex;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main03 {
    private static final String REGEX = "(\\d+[\\/*+-])+\\d+=\\d+";
    private static final String FILE_NAME = "operations.txt";

    public static void main(String[] args) {
        insertText();


    }

    public static void insertText() {
        Scanner scan = new Scanner(System.in);
        String inputTextWithoutSpaces = "";
        try (FileWriter fileWriter = new FileWriter(FILE_NAME, true)) {
            System.out.println("Podaj działanie matematyczne do sprawdzenia:");
            while (!scan.hasNext("quit")) {
                String inputText = scan.nextLine();

                if (inputText.contains(" ")) {
                    inputTextWithoutSpaces = inputText.replaceAll(" ", "");
                    boolean t = verifyText(inputTextWithoutSpaces);
                    if (t) {
                        fileWriter.append(inputTextWithoutSpaces).append("\n");
                    }
                } else if (verifyText(inputText)) {
                    fileWriter.append(inputText).append("\n");
                }
            }
        } catch (IOException e) {
            e.getMessage();
        }
    }
    static boolean verifyText(String text) {
        Pattern pass = Pattern.compile(REGEX);
        Matcher matcher = pass.matcher(text);
        return matcher.matches();
    }
}