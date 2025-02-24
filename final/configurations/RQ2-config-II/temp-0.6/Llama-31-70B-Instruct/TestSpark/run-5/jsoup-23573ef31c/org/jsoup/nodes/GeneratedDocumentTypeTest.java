package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedDocumentTypeTest {

    @Test
    public void documentTypeTest() {
        Document doc = new Document("http://example.com");
        assertEquals(DocumentType.html5, doc.documentType());
    }

}