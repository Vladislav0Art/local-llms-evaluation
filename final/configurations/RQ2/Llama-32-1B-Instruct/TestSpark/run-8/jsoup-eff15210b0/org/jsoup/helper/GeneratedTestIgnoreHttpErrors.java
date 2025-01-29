package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.ConnectionBuilder;
import org.jsoup.ConnectionOptions;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTestIgnoreHttpErrors {

    public static Connection connect(String url) {
        return new Connection.Builder()
                .build().connect(url);
    }

    @Test
    public void testIgnoreHttpErrors() {
        Connection connection = connect("https://www.example.com");
        try {
            if (connection.isRedirect()) {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}