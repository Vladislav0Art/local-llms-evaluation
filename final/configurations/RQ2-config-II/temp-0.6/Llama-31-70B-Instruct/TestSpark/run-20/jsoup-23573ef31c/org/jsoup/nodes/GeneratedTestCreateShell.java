package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestCreateShell {

    @Test
    public void testCreateShell() {
        // Arrange
        String expectedBaseUri = "http://example.com";

        // Act
        Document document = Document.createShell(expectedBaseUri);

        // Assert
        assertEquals(expectedBaseUri, document.baseUri());
    }

}