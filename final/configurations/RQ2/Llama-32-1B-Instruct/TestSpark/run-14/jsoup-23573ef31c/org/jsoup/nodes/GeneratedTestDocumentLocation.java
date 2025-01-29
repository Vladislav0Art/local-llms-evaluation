package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.nio.charset.CharsetEncoder;
import java.nio.charset.CharsetEncoderCompat;

public class GeneratedTestDocumentLocation {

    private static final String BASE_URI = "https://example.com";

    @Test
    public void testDocumentLocation() {
        // Arrange
        String uri = BASE_URI + "/test.html";
        Element document = new Document(uri);

        // Act
        String location = document.location();

        // Assert
        assertEquals("/test.html", location);
    }

}