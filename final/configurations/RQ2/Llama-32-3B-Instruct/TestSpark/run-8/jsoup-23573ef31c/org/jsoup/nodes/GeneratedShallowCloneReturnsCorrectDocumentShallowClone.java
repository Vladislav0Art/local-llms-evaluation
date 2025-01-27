package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedShallowCloneReturnsCorrectDocumentShallowClone {

    @Test
    public void shallowCloneReturnsCorrectDocumentShallowClone() {
        Document document = new Document("http://example.com");
        Document documentShallowClone = document.shallowClone();
        assertNotNull(documentShallowClone);
        assertEquals(document, documentShallowClone);
    }

}