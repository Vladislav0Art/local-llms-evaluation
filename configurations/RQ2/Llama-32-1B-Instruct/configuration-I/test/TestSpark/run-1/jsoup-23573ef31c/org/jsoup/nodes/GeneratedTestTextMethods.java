package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTestTextMethods {

    @Test
    public void testTextMethods() {
        Document document = new Document("https://example.com");
        assertEquals("", document.text(""));
        assertEquals("Example Content", document.text("Example Content"));
    }

}