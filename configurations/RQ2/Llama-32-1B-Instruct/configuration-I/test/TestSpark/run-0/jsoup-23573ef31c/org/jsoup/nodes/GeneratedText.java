package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.junit.Test;

public class GeneratedText {

    @Test
    public void text() {
        // Arrange
        String baseUri = "https://example.com";
        Element element = new Element("html");
        element.attr("base", baseUri);

        // Act
        document = new Document(element, null, null);
        String text = document.text();

        // Assert
        assertEquals("Hello World", text);
    }

}