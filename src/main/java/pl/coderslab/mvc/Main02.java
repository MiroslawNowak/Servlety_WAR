package pl.coderslab.mvc;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Main02 {
    public static void main(String[] args) {
        Connection connect = Jsoup.connect("https://dev.java/news/");

        try {

            Document document = connect.get();

            Elements links = document.select("a.title");

            for (Element elem : links) {

                System.out.println(elem.text());

            }

        } catch (IOException e) {

            e.printStackTrace();

        }
    }
        }
