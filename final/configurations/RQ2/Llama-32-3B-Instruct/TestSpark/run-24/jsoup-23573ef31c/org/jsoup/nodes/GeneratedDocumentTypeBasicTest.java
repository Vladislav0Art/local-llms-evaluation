package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

public class GeneratedDocumentTypeBasicTest {

    @Test
    public void documentTypeBasicTest() {
        Document document = new Document("http://example.com");
        org.junit.Assert.assertNull(document.documentType());
    }

}