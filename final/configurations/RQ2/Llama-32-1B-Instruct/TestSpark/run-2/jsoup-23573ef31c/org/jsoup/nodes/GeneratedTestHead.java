package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTestHead {

    @Test
    public void testHead() {
        Document document = new Document("https://example.com", ParseSettings.None);
        Element head = document.head();
        assertEquals(head, headElement());
    }

}