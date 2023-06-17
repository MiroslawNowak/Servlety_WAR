package pl.coderslab.setmap;

import java.util.HashSet;
import java.util.Scanner;

public class Main01 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashSet inputElements = new HashSet<String>();

        System.out.println("To exit program, type \"exit\"");
        System.out.println("Enter new item: ");

        int count = 0;
        String input = scan.nextLine();
        count++;
        while (!input.equalsIgnoreCase("exit")) {
            inputElements.add(input);
            System.out.println(inputElements);
            input = scan.nextLine();
            count++;
        }
        System.out.printf("Podanych napisów: %d, Rozmiar kolekcji: %d", count - 1, inputElements.size());
    }
}
