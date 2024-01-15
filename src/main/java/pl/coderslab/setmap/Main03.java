package pl.coderslab.setmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main03 {

    public static void main(String[] args) {

        List<Country> countries = initialize();
        Map<String, Country> testMap = getMap(countries);

        for (Map.Entry<String, Country> entry : testMap.entrySet()) {
            String capital = entry.getKey();
            String country = entry.getValue().getName();
            System.out.println(capital + " - " + country);
        }
    }

    public static List<Country> initialize() {
        List<Country> newList  = new ArrayList<>();

        Country poland = new Country("Polska", "Warszawa");
        Country niemcy = new Country("Niemcy", "Berlin");
        Country czechy = new Country("Czechy", "Praga");
        Country ukraina = new Country("Ukraina", "Kijów");
        Country bialorus = new Country("Białoruś", "Mińsk");
        newList.add(poland);
        newList.add(niemcy);
        newList.add(czechy);
        newList.add(ukraina);
        newList.add(bialorus);

        return newList;
    }

    public static Map<String, Country> getMap (List<Country> list) {
        Map<String, Country> mapa = new HashMap<>();

        for (Country country: list) {
            mapa.put(country.getCapital(), country);
        }
     return mapa;
    }
}
