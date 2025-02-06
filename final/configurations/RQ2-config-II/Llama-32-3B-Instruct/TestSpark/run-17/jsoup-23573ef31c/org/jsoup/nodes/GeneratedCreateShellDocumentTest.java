package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedCreateShellDocumentTest {

    @Test
    public void createShellDocumentTest() {
        // Arrange and Act
        String baseUri = "http://example.com";
        Document document = Document.createShell(baseUri);

        // Assert
        assertNotNull(document);
    }

}