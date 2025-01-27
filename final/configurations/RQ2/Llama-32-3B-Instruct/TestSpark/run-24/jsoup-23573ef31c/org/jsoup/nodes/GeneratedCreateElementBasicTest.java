package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

public class GeneratedCreateElementBasicTest {

    @Test
    public void createElementBasicTest() {
        Document document = new Document("http://example.com");
        Element element = document.createElement("div");
        org.junit.Assert.assertNotNull(element);
    }

}