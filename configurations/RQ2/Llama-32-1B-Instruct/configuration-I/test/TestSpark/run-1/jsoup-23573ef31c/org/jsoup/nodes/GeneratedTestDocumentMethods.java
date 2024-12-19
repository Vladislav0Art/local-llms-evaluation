package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTestDocumentMethods {

    @Test
    public void testDocumentMethods() {
        Document document = new Document("https://example.com");
        assertEquals(4, document.head().length(), "head length");
        assertEquals(3, document.body().length(), "body length");
        assertEquals(10, document.forms().size(), "forms size");

        FormElement form1 = document.expectForm(".my-class");
        assertNotNull(form1);
    }

}