package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedCreateElementMethodTest {

    @Test
    public void createElementMethodTest() {
        // Arrange and Act
        Element element = Document.createElement("div");
        Document document = new Document("http://example.com");
        Element result = document.createElement("p");

        // Assert
        assertEquals("p", result.nodeName());
    }

}