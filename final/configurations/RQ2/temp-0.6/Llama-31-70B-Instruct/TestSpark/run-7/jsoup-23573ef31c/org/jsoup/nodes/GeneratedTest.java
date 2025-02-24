package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void getLocationTest() {
        // Arrange
        Document document = new Document("baseUri");

        // Act
        String location = document.location();

        // Assert
        assertEquals("baseUri", location);
    }

    @Test
    public void getConnectionTest() {
        // Arrange
        Document document = new Document("baseUri");

        // Act
        Connection connection = document.connection();

        // Assert
        assertNull(connection);
    }

    @Test
    public void getDocumentTypeTest() {
        // Arrange
        Document document = new Document("baseUri");

        // Act
        DocumentType documentType = document.documentType();

        // Assert
        assertNull(documentType);
    }

    @Test
    public void getHeadTest() {
        // Arrange
        Document document = new Document("baseUri");

        // Act
        Element head = document.head();

        // Assert
        assertNotNull(head);
        assertEquals("head", head.tagName());
    }

    @Test
    public void getBodyTest() {
        // Arrange
        Document document = new Document("baseUri");

        // Act
        Element body = document.body();

        // Assert
        assertNotNull(body);
        assertEquals("body", body.tagName());
    }

    @Test
    public void getFormsTest() {
        // Arrange
        Document document = new Document("baseUri");

        // Act
        List<FormElement> forms = document.forms();

        // Assert
        assertNotNull(forms);
        assertEquals(0, forms.size());
    }

}