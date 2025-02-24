package org.jsoup.nodes;

import static org.junit.Assert.assertEquals;

import org.jsoup.nodes.Document;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void titleTest() {
        Document document = new Document("https://www.example.com");
        document.title("Hello World");
        assertEquals("Hello World", document.title());
    }

    @Test
    public void charsetTest() {
        Document document = new Document("https://www.example.com");
        document.charset(Charset.forName("UTF-8"));
        assertEquals(Charset.forName("UTF-8"), document.charset());
    }

    @Test
    public void quirksModeTest() {
        Document document = new Document("https://www.example.com");
        document.quirksMode(Document.QuirksMode.NO_QUIRKS);
        assertEquals(Document.QuirksMode.NO_QUIRKS, document.quirksMode());
    }

}