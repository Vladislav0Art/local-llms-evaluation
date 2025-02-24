package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedTestQuirksMode {

    @Test
    public void testQuirksMode() {
        Document document = new Document("http://example.com");
        assertEquals(QuirksMode.noQuirks, document.quirksMode());
        document.quirksMode(QuirksMode.quirks);
        assertEquals(QuirksMode.quirks, document.quirksMode());
    }

}