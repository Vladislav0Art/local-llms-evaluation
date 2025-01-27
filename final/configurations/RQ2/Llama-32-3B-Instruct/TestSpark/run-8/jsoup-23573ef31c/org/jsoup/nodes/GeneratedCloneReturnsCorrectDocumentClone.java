package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedCloneReturnsCorrectDocumentClone {

    @Test
    public void cloneReturnsCorrectDocumentClone() {
        Document document = new Document("http://example.com");
        Document documentClone = document.clone();
        assertNotNull(documentClone);
        assertEquals(document, documentClone);
    }

}