package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.nio.charset.CharsetEncoder;
import java.nio.charset.CharsetEncoderCompat;

public class GeneratedTestBody {

    private static final String BASE_URI = "https://example.com";

    @Test
    public void testBody() {
        // Arrange
        String uri = BASE_URI + "/example.html";
        Element body = new Document(uri).body();

        // Act
        Elements elements = body.getElementsByTag("body");
        assertNot - empty(elements);

        // Assert
        assertEquals(1, elements.size());
    }

}