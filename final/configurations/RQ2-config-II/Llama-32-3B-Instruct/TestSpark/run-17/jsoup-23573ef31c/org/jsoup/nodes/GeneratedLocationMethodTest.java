package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedLocationMethodTest {

    @Test
    public void locationMethodTest() {
        // Arrange and Act
        Document document = new Document("http://example.com");

        // Assert
        assertEquals("http://example.com", document.location());
    }

}