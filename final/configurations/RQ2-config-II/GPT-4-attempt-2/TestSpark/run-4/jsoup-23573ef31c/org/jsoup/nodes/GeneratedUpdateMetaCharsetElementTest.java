package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedUpdateMetaCharsetElementTest {

    @Test
    public void updateMetaCharsetElementTest() {
        Document doc = new Document("http://example.com");
        assertFalse(doc.updateMetaCharsetElement());

        doc.updateMetaCharsetElement(true);
        assertTrue(doc.updateMetaCharsetElement());
    }

}