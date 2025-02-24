package org.jsoup.nodes;

import static org.junit.Assert.assertEquals;

import org.jsoup.nodes.Document;
import org.junit.Test;

public class GeneratedQuirksModeTest {

    @Test
    public void quirksModeTest() {
        Document document = new Document("https://www.example.com");
        document.quirksMode(Document.QuirksMode.NO_QUIRKS);
        assertEquals(Document.QuirksMode.NO_QUIRKS, document.quirksMode());
    }

}