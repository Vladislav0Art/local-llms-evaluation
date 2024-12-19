package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTestDocumentLocation {

    @Test
    public void testDocumentLocation() {
        Document document = new Document("https://example.com");
        assertEquals("", document.location());
        assertEquals("https://example.com", document.createShell("https://example.com").location());
    }

}