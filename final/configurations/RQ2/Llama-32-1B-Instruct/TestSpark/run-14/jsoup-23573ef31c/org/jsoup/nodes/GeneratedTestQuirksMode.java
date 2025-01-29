package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.nio.charset.CharsetEncoder;
import java.nio.charset.CharsetEncoderCompat;

public class GeneratedTestQuirksMode {

    private static final String BASE_URI = "https://example.com";

    @Test
    public void testQuirksMode() {
        // Arrange
        QuirksMode quirksMode = new DocumentQuirksMode();

        // Act
        String quirkMode = document.quirksMode();

        // Assert
        assertEquals("unknown", quirkMode);
    }

}