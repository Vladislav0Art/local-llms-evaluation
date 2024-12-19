package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;

public class GeneratedText setText {

    @Test
    public void text

    setText() {
        // Arrange
        String baseUri = "https://example.com";
        Element element = new Element("html");
        element.attr("base", baseUri);
        Document document = new Document(element, null, null);

        // Act
        document.text("Hello World");

        // Assert
        assertEquals("Hello World", document.text());
    }

}