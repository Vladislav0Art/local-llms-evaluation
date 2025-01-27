package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;

public class GeneratedTest {

    @Test
    public void testJsoup() throws IOException {
        String htmlString = "<html><body>Hello World!</body></html>";
        Document document = Jsoup.parse(htmlString);
        System.out.println(document.title());
        System.out.println(document.body().text());
    }

    @Test
    public void testDocument() {
        String htmlString = "<html><head><title>My Title</title></head><body>Hello World!</body></html>";
        Document document = Jsoup.parse(htmlString);
        Element titleElement = document.selectFirst("title");
        System.out.println(titleElement.text());
    }

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

    @Test
    public void testDocumentCharset() {
        String htmlString = "<html><head><title>My Title</title></head><body>Hello World!</body></html>";
        Document document = Jsoup.parse(htmlString, "UTF-8");
        Element titleElement = document.selectFirst("title");
        System.out.println(titleElement.text());
    }

}