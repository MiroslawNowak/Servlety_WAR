package pl.coderslab;


import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;


public class MainLog {
    private static final Logger log = LogManager.getLogger(MainLog.class);
    public static void main(String[] args) {
        log.info("Info");
    }
}