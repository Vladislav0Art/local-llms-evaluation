package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedCreateShellStringReturnsDocumentWithShellElement {

    @Test
    public void createShellStringReturnsDocumentWithShellElement() {
        String baseUri = "http://example.com";
        Document document = Document.createShell(baseUri);
        assertTrue(document.hasChild("html"));
        assertEquals(baseUri, document.location());
    }

}