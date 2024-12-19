package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;

public class GeneratedTitle {

    @Test
    public void title() {
        // Arrange
        String baseUri = "https://example.com";

        // Act
        Document document = new Document(new Element("html"), null, null, new Element("title", null), null);

        // Assert
        assertEquals(baseUri, document.title());
    }

}