package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTestUpdateMetaCharsetElement {

    @Test
    public void testUpdateMetaCharsetElement() {
        Document document = new Document("https://example.com", ParseSettings.None);
        document.updateMetaCharsetElement(true);
        assertTrue(document.updateMetaCharsetElement());
    }

}