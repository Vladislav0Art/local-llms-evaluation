package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTestText {

    @Test
    public void testText() {
        Document document = new Document("https://example.com");
        assertEquals(text("Hello World"), document.text("Hello World"));
    }

}