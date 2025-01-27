package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

public class GeneratedUpdateMetaCharsetElementBasicTest {

    @Test
    public void updateMetaCharsetElementBasicTest() {
        Document document = new Document("http://example.com");
        boolean updated = document.updateMetaCharsetElement();
        org.junit.Assert.assertTrue(updated);
    }

}