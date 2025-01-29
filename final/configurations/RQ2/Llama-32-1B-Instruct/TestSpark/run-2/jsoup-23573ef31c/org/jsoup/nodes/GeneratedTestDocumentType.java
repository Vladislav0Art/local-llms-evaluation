package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTestDocumentType {

    @Test
    public void testDocumentType() {
        Document document = new Document("https://example.com");
        assertEquals(documentType(), document.documentType());
    }

}