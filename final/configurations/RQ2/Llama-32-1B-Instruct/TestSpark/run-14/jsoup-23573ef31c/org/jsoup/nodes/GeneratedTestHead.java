package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.nio.charset.CharsetEncoder;
import java.nio.charset.CharsetEncoderCompat;

public class GeneratedTestHead {

    private static final String BASE_URI = "https://example.com";

    @Test
    public void testHead() {
        // Arrange
        String uri = BASE_URI + "/test.html";
        Element head = new Document(uri).head();

        // Act
        Elements elements = head.getElementsByTag("head");
        assertNot - empty(elements);

        // Assert
        assertEquals(1, elements.size());
    }

}