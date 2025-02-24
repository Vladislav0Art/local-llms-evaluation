package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetDocumentTypeTest {

    @Test
    public void getDocumentTypeTest() {
        // Arrange
        Document document = new Document("baseUri");

        // Act
        DocumentType documentType = document.documentType();

        // Assert
        assertNull(documentType);
    }

}