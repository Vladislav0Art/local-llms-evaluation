package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;

public class GeneratedLocationDocumentTest {

    @Test
    public void locationDocumentTest() {
        Document document = new Document("http://example.com");
        assertEquals("http://example.com", document.location());
    }

}