package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.ConnectionBuilder;
import org.jsoup.ConnectionOptions;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTestHttpConnectionConstructor {

    public static Connection connect(String url) {
        return new Connection.Builder()
                .build().connect(url);
    }

    @Test
    public void testHttpConnectionConstructor() {
        Document doc = Jsoup.connect("https://www.example.com").get();
        System.out.println(doc.body());
        // String response = doc.toString();
        // System.out.println(response);
        System.out.println("Response: " + doc.status());
        System.out.println("Status Code: " + doc.statusCode());
    }

}