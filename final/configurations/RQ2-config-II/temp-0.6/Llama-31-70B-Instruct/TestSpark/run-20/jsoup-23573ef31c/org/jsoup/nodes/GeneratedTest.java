package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void testCreateShell() {
        // Arrange
        String expectedBaseUri = "http://example.com";

        // Act
        Document document = Document.createShell(expectedBaseUri);

        // Assert
        assertEquals(expectedBaseUri, document.baseUri());
    }

    @Test
    public void testLocation() {
        // Arrange
        Document document = Mockito.mock(Document.class);
        Mockito.when(document.location()).thenReturn("http://example.com");

        // Act
        String location = document.location();

        // Assert
        assertEquals("http://example.com", location);
    }

    @Test
    public void testConnection() {
        // Arrange
        Document document = Mockito.mock(Document.class);
        Mockito.when(document.connection()).thenReturn(null);

        // Act
        Connection connection = document.connection();

        // Assert
        assertNull(connection);
    }

    @Test
    public void testDocumentType() {
        // Arrange
        Document document = Mockito.mock(Document.class);
        Mockito.when(document.documentType()).thenReturn(null);

        // Act
        DocumentType documentType = document.documentType();

        // Assert
        assertNull(documentType);
    }

    @Test
    public void testHead() {
        // Arrange
        Document document = Mockito.mock(Document.class);
        Mockito.when(document.head()).thenReturn(null);

        // Act
        Element head = document.head();

        // Assert
        assertNull(head);
    }

}