package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTestElementName {

    @Test
    public void testElementName() {
        Document document = new Document("https://example.com", ParseSettings.None);
        Element element = document.createElement("input");
        assertEquals(element, element);
    }

}