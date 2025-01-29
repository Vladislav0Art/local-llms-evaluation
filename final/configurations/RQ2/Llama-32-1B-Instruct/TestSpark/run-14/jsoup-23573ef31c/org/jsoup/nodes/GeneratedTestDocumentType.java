package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.nio.charset.CharsetEncoder;
import java.nio.charset.CharsetEncoderCompat;

public class GeneratedTestDocumentType {

    private static final String BASE_URI = "https://example.com";

    @Test
    public void testDocumentType() {
        // Arrange
        String documentType = "text/html";
        Document document = new Document(BASE_URI + "/example.html");

        // Act
        DocumentType documentTypeResult = document.documentType();

        // Assert
        assertEquals(documentType, documentTypeResult.getType());
    }

}