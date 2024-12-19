package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.junit.Test;

public class GeneratedShallowClone {

    @Test
    public void shallowClone() {
        // Arrange
        String baseUri = "https://example.com";
        Document document = new Document(new Element("html"), null, null);

        // Act
        Document clonedDocument = document.shallowClone();

        // Assert
        assertNotNull(clonedDocument);
    }

}