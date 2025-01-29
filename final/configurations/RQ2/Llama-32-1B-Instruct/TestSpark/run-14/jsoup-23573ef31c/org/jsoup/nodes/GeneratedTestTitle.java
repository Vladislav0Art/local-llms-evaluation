package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.nio.charset.CharsetEncoder;
import java.nio.charset.CharsetEncoderCompat;

public class GeneratedTestTitle {

    private static final String BASE_URI = "https://example.com";

    @Test
    public void testTitle() {
        // Arrange
        String uri = BASE_URI + "/test.html";
        Element head = new Document(uri).head();

        // Act
        String title = head.attr("title");

        // Assert
        assertEquals("Test", title);
    }

}