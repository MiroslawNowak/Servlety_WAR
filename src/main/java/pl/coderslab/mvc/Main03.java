package pl.coderslab.mvc;

import com.google.common.collect.Lists;

import java.util.List;

public class Main03 {
    public static void main(String[] args) {
        List<String> names = Lists.newArrayList("Arek", "Czarek", "Darek");

        List<String> reversed = Lists.reverse(names);

        System.out.println(reversed);
    }
}
