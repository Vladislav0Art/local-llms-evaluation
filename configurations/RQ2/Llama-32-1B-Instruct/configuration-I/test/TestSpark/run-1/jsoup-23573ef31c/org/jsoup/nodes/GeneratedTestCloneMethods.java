package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTestCloneMethods {

    @Test
    public void testCloneMethods() {
        Document document = new Document("https://example.com");
        Document clonedDoc = document.clone();
        assertEquals(0, clonedDoc.baseUri().length(), "base uri length");
    }

}