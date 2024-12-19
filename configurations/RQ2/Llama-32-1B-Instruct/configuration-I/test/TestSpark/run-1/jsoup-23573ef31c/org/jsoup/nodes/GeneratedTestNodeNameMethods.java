package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTestNodeNameMethods {

    @Test
    public void testNodeNameMethods() {
        Document document = new Document("https://example.com");
        assertEquals("", document.nodeName());
        assertEquals("<html>", document.nodeName());
    }

}