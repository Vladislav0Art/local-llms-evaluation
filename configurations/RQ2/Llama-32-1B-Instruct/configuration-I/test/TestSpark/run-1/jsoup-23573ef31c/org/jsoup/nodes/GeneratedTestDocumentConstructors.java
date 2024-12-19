package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTestDocumentConstructors {

    @Test
    public void testDocumentConstructors() {
        Document document = new Document("https://example.com");
        assertEquals(0, document.baseUri(), "base uri");

        Document shell = Document.createShell("https://example.com/shell");
        assertEquals(0, shell.baseUri(), "base uri");

        Document doc = new Document(shell, "https://example.com/document");
        assertEquals(2, doc.baseUri().length(), "base uri length");
    }

}