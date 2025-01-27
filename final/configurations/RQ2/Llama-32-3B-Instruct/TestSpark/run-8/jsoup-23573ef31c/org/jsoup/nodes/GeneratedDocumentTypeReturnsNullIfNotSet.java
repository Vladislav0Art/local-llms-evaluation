package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedDocumentTypeReturnsNullIfNotSet {

    @Test
    public void documentTypeReturnsNullIfNotSet() {
        Document document = new Document("http://example.com");
        assertNull(document.documentType());
    }

}