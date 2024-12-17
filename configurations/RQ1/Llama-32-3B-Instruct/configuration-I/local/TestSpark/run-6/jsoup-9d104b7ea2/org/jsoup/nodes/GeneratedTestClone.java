package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestClone {

    @Test
    public void testClone() {
        Document document = Jsoup.parse("<html><body>Hello World!</body></html>");
        Object clonedDocument = document.clone();
        assertTrue(clonedDocument instanceof Document);
        assertEquals(document, (Document) clonedDocument);
    }

}