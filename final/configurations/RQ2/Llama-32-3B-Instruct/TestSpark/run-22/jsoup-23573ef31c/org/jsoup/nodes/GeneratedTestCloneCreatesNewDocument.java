package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.nio.charset.Charset;

public class GeneratedTestCloneCreatesNewDocument {

    @Test
    public void testCloneCreatesNewDocument() {
        String baseUri = "https://example.com";
        Document originalDocument = Document.createShell(baseUri);
        Document clonedDocument = originalDocument.clone();
        assertNotNull(clonedDocument);
        assertTrue(clonedDocument instanceof Document);
    }

}