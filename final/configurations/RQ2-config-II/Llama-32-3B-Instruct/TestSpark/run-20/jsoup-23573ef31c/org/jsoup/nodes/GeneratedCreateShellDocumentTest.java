package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;

public class GeneratedCreateShellDocumentTest {

    @Test
    public void createShellDocumentTest() {
        Document document = Document.createShell("http://example.com");
        assertNotNull(document);
    }

}