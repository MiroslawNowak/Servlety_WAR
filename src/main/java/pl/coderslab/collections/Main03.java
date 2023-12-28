package pl.coderslab.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main03 {


    public static void main(String[] args) {
    List<City> cityList = initialize();

    List<City> reversedList = Main04.reverse(cityList);

    Iterator<City> it = cityList.iterator();

    while (it.hasNext()){
        System.out.println(it.next());
    }

    List<City> subList = firstSubList(cityList, 1, 2);

    it = reversedList.iterator();

    while (it.hasNext()) {
        System.out.println(it.next());
    }
    }


    public static List<City> initialize() {
        List<City> cities = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        for(int i = 1; i <= 5; i ++) {
            System.out.println("Podaj nazwę miasta: ");
            String cityName = scan.nextLine();
            System.out.println("Podaj liczbę mieszkańców:");
            int cityPop = scan.nextInt();
            City city = new City(cityName, cityPop);
            cities.add(city);
            scan.nextLine();
        }
        return cities;
    }

    public static List<City> firstSubList(List<City> list, int start, int end) {
        return list.subList(start, end);
    }
}
