package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;

public class GeneratedCreateShellDocumentCreationTest {

    @Test
    public void createShellDocumentCreationTest() {
        Document document = Document.createShell("http://example.com");
        assertNotNull(document);
    }

}