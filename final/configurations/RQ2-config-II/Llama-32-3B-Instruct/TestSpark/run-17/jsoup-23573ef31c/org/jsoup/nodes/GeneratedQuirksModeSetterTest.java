package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedQuirksModeSetterTest {

    @Test
    public void quirksModeSetterTest() {
        // Arrange and Act
        Document document = new Document("http://example.com");
        QuirksMode quirksMode = QuirksMode.CRITICAL;
        Document result = document.quirksMode(quirksMode);

        // Assert
        assertEquals(QuirksMode.CRITICAL, result.quirksMode());
    }

}