package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTestText {

    private static final String BASE_URI = "https://example.com";

    @Test
    public void testText() {
        // Arrange
        String uri = BASE_URI + "/test.html";
        Element document = new Document(uri);

        // Act
        String text = document.text("test");

        // Assert
        assertEquals("test", text);
    }

}