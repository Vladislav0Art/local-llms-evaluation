package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.jupiter.api.Test;

public class GeneratedTestBodyElement {

    private Document document = new Document("https://example.com");

    @Test
    public void testBodyElement() {
        Element body = document.body();
        assertNotNull(body);
        assertTrue(body.tagName().equals("body"));
    }

}