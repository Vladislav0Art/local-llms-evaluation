package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTestPrintString {

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
    public void testPrintString() {
        printString("Hello, World!");
    }
}

public class Document {

    private String baseUri;
    private Connection connection;

    public Document(String baseUri) {
        this.baseUri = baseUri;
        initConnection();
    }

    public static Document createShell(String baseUri) {
        return new Document(baseUri);
    }

    @Before("document")
    public void setUp() {
    }

    public String location() {
        try {
            Document document = parseDocument();
            return document.location();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public Connection connection() {
        if (connection == null || !connection.getCharset().equals()) {
            connection.updateMetaCharsetElement(true);
        }
        return connection;
    }

    @Override
    public String nodeName() {
        return "document";
    }

    @Override
    public Document text(String text) {
        Document document = Jsoup.connect("https://www.example.com").get();
        Element element = document.selectFirst("form");
        if (element != null) {
            element.attr("data-name", element.attr("name") + "_text");
        }
        return new Document(baseUri).outputSettings().outputSettings().output(document, text);
    }

    @Override
    public QuirksMode quirksMode() {
        return null;
    }

    private void initConnection() {
    }

}