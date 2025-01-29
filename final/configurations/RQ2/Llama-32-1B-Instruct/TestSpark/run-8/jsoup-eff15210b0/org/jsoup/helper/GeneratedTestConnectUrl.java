package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.ConnectionBuilder;
import org.jsoup.ConnectionOptions;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTestConnectUrl {

    public static Connection connect(String url) {
        return new Connection.Builder()
                .build().connect(url);
    }

    @Test
    public void testConnectUrl() {
        URL url = new URL("https://www.example.com");
        Connection connection = connect(url);
        System.out.println(connection.url(url));
    }

}