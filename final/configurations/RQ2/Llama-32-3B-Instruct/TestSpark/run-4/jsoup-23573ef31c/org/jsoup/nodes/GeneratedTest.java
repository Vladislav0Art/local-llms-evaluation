package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTest {

    @Test
    public void createShellDocument_test() {
        String baseUri = "https://example.com";
        Connection connection = Jsoup.connect(baseUri);
        Document document = new Document();
        document.appendConnection(connection);
        assertNotNull(document);
    }

    @Test
    public void text_string_textTest() {
        Document document = new Document("https://example.com");
        String text = "Hello World!";
        Element element = document.text(text);
        assertNotNull(element);
    }

    @Test
    public void nodeName_string_test() {
        Document document = new Document();
        assertEquals("", document.nodeName());
    }

    @Test
    public void charset_string_test() {
        String charsetName = "UTF-8";
        Connection connection = Jsoup.connect(charsetName);
        Document document = new Document();
        document.charset(charsetName, connection);
        org.java.io.charset.Charset charset = org.java.io.charset.Charset.forName(charsetName);
        assertEquals(charset, document.charset());
    }

    @Test
    public void updateMetaCharsetElement_boolean_test() {
        Document document = new Document();
        boolean update = true;
        document.updateMetaCharsetElement(update);
    }

}