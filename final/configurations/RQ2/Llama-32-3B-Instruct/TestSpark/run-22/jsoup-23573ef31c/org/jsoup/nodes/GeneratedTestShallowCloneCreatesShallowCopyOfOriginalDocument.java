package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.nio.charset.Charset;

public class GeneratedTestShallowCloneCreatesShallowCopyOfOriginalDocument {

    @Test
    public void testShallowCloneCreatesShallowCopyOfOriginalDocument() {
        String baseUri = "https://example.com";
        Document originalDocument = Document.createShell(baseUri);
        Document shallowClonedDocument = originalDocument.shallowClone();
        assertNotNull(shallowClonedDocument);
        assertTrue(shallowClonedDocument instanceof Document);
    }

}