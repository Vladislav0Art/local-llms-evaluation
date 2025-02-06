package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;

public class GeneratedUpdateMetaCharsetElementMethodTest {

    @Test
    public void updateMetaCharsetElementMethodTest() {
        Document document = new Document("http://example.com");
        boolean updated = document.updateMetaCharsetElement();
        assertTrue(updated);
    }

}