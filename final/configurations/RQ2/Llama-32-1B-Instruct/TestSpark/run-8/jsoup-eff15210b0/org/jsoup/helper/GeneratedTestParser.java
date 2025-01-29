package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.ConnectionBuilder;
import org.jsoup.ConnectionOptions;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTestParser {

    public static Connection connect(String url) {
        return new Connection.Builder()
                .build().connect(url);
    }

    @Test
    public void testParser() {
        Parser parser = new Parser();
        String response = Jsoup.connect("https://www.example.com").execute().body();
        System.out.println(response);
        // System.out.println(response.toString());
        // System.out.println(response.html());
        // System.out.println(response.text());
        String cookie = cookieStore.get("session_id");
        if (cookie != null) {
            Element element = doc.selectFirst(".session_id").first();
            System.out.println(element.attr("value"));
        }
    }

}