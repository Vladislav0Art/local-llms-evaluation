package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.junit.Test;

public class GeneratedQuirksMode {

    @Test
    public void quirksMode() {
        // Arrange
        String baseUri = "https://example.com";
        Document document = new Document(new Element("html"), null, null);

        // Act
        QuirksMode quirksMode = document.quirksMode(null).quirksMode();

        // Assert
        assertNotNull(quirksMode);
    }

}