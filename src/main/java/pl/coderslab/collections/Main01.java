package pl.coderslab.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main01 {

    public static void main(String[] args) {
        List<Integer> elements = new ArrayList<>();

        for(int i = 10; i <= 19; i++) {
            elements.add(i);
        }

       for (int i = 0; i < elements.size(); i++)    {
            System.out.print(elements.get(i));
       }
        Iterator <Integer> itr = elements.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        for (Iterator<Integer> itr2 = elements.iterator(); itr2.hasNext(); ) {
            System.out.println(itr2.next());
        }
        for (int i : elements) {
            System.out.println(i);
        }

        elements.forEach(System.out::print);
    }
}
