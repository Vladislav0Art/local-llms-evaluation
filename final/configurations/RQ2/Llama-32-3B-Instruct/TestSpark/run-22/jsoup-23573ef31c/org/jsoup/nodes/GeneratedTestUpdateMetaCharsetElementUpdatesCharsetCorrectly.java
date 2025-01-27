package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.nio.charset.Charset;

public class GeneratedTestUpdateMetaCharsetElementUpdatesCharsetCorrectly {

    @Test
    public void testUpdateMetaCharsetElementUpdatesCharsetCorrectly() {
        boolean originalUpdate = true;
        Document document = Document.createShell("https://example.com");
        document.updateMetaCharsetElement(true);
        assertTrue(document.updateMetaCharsetElement());
        assertEquals(originalUpdate, document.updateMetaCharsetElement());
    }

}