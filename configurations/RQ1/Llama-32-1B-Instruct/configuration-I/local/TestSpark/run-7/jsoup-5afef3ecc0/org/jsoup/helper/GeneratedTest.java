package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class GeneratedTest {

    public static String build(String url) {
        Document doc = Jsoup.connect(url).get();
        return doc.toString().replaceAll("^/+", "");
    }

}