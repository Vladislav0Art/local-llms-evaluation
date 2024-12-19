package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTestCharsetMethods {

    @Test
    public void testCharsetMethods() {
        Document document = new Document("https://example.com");
        assertNotNull(document.charset());
        assertEquals(ISO_8859 - 1, document.charset().code);
    }

}