package pl.coderslab.collections;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main02 {

    public static void main(String[] args) {

    }
    public static void removeDivider(List<Integer> list, int divider) {
        ListIterator<Integer> iterator = list.listIterator();
        while (iterator.hasNext()) {
            if (iterator.next() % divider == 0) {
                iterator.remove();
            }
        }
    }
}
