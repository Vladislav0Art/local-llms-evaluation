package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTestShallowCloneMethods {

    @Test
    public void testShallowCloneMethods() {
        Document document = new Document("https://example.com");
        Document shallowClonedDoc = document.shallowClone();
        assertEquals(1, shallowClonedDoc.head().size(), "head size");
    }

}