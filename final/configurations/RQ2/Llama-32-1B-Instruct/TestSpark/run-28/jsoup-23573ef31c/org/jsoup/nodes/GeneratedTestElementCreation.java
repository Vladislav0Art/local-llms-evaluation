package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.jupiter.api.Test;

public class GeneratedTestElementCreation {

    private Document document = new Document("https://example.com");

    @Test
    public void testElementCreation() {
        Element element = document.createElement("div");
        assertNotNull(element);
        assertTrue(element.tagName().equals("div"));
    }

}