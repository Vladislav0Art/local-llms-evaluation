package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;

public class GeneratedNodeNameDocumentMethodTest {

    @Test
    public void nodeNameDocumentMethodTest() {
        Document document = new Document("http://example.com");
        String name = document.nodeName();
        assertEquals("", name);
    }

}