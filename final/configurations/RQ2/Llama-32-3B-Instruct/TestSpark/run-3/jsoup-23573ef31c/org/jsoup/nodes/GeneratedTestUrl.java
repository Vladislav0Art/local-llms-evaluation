package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;

public class GeneratedTestUrl {

    @Test
    public void testUrl() throws IOException {
        String url = "https://www.example.com";
        try {
            Document document = Jsoup.connect(url).get();
            System.out.println(document.title());
        } catch (IOException e) {
            System.out.println("Error occurred while connecting to the URL: " + e.getMessage());
        }
    }

}