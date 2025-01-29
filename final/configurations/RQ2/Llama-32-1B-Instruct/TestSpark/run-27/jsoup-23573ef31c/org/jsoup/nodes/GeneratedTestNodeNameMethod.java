package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTestNodeNameMethod {

    public static Document testLocation() {
        return Jsoup.connect("https://www.example.com").get();
    }

    public static void testConnection() {
        try {
            Document document = Jsoup.connect("https://www.example.com").get();
            Connection connection = document.connection();
            System.out.println(connection.getCharset());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static QuirksMode testQuirksMode() {
        return null;
    }

    public static void testNodeName() {
        try {
            Document document = Jsoup.connect("https://www.example.com").get();
            assertEquals("https://www.example.com", document.nodeName());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String text(String text) {
        return null;
    }

    @Test
    public void testNodeNameMethod() {
        Document document = Jsoup.connect("https://www.example.com").get();
        assertEquals("myForm", document.nodeName());
    }
}

public class OutputSettings {

    private boolean update;

    public Document outputSettings(boolean update) {
        this.update = update;
        return new Document(baseUri).outputSettings().outputSettings();
    }

    @Override
    public QuirksMode quirksMode() {
        return null;
    }

}