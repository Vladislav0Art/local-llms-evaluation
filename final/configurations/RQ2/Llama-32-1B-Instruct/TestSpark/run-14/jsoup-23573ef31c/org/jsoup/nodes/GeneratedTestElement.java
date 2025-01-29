package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTestElement {

    private static final String BASE_URI = "https://example.com";

    @Test
    public void testElement() {
        // Arrange
        String uri = BASE_URI + "/test.html";
        Element document = new Document(uri);

        // Act
        Elements elements = document.elements();

        // Assert
        assertEquals(1, elements.size());
        assertNotEmpty(elements);
    }

}