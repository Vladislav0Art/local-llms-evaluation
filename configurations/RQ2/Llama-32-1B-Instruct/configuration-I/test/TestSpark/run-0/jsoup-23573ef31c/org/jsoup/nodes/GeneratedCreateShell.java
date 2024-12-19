package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.junit.Test;

public class GeneratedCreateShell {

    @Test
    public void createShell() {
        // Arrange
        String baseUri = "https://example.com";

        // Act
        Document document = Document.createShell(baseUri);

        // Assert
        assertNotNull(document);
    }

}