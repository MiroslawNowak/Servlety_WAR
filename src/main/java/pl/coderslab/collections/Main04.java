package pl.coderslab.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main04 {

    public static void main(String[] args) {

        List<City> cityList = new ArrayList<>();
        City krakow = new City("Krakow", 12312);
        City poznan = new City("Poznan", 1231241);
        City warsaw = new City("Warszawa", 125151);
        cityList.add(krakow);
        cityList.add(poznan);
        cityList.add(warsaw);

        for (City city : cityList) {
            System.out.println(city);
        }
        List<City> revList = reverse(cityList);

        System.out.println(revList.size());

        for (City city : revList) {
            System.out.println(city);
        }

    }

    public static List<City> reverse (List<City> list) {
        List<City> revList = new ArrayList<>();
        ListIterator<City> it = list.listIterator(list.size());
        while(it.hasPrevious()) {
            revList.add(it.previous());
        }
        return revList;
    }

}
