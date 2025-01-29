package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTestOutputSettingsMethod {

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
    public void testOutputSettingsMethod() {
        OutputSettings settings = new Document("https://www.example.com").outputSettings(true);
        assertEquals(true, settings.update);
    }
}

public class Connection {

    private String charset;

    public Connection(String charset) {
        this.charset = charset;
    }

    @Override
    public String getCharset() {
        return charset;
    }

    @Override
    public boolean equals(Object other) {
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        Connection connection = (Connection) other;
        return this.charset.equals(connection.charset);
    }

}