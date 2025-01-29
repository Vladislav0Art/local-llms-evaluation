package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.ConnectionBuilder;
import org.jsoup.ConnectionOptions;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTestConnect {

    public static Connection connect(String url) {
        return new Connection.Builder()
                .build().connect(url);
    }

    @Test
    public void testConnect() {
        Document doc = Jsoup.connect("https://www.example.com").get();
        System.out.println(doc.body());
    }

}